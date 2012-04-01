package org.eclipse.emf.texo.resolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.ComponentProvider;
import org.eclipse.emf.texo.model.DynamicModelObject;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Default implementation of the object resolver.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class DefaultObjectResolver implements ObjectResolver {
  public static final String FRAGMENTSEPARATOR = "||"; //$NON-NLS-1$
  private static final int FRAGMENTSEPARATOR_LENGTH = FRAGMENTSEPARATOR.length();

  private static String serverUri = null;

  public static void setServerUri(String uri) {
    serverUri = uri;
  }

  public static String getServerUri() {
    return serverUri;
  }

  private URI uri = null;

  private boolean useWebServiceUriFormat = false;

  /**
   * @return the uniquely identifying uri of this object store
   */
  public URI getUri() {
    if (uri == null) {
      if (getServerUri() != null) {
        uri = URI.createURI(getServerUri());
      } else {
        uri = URI.createURI("http://www.eclipse.org/texo"); //$NON-NLS-1$
      }
    }
    return uri;
  }

  /**
   * Sets the uniquely identifying uri of this object store.
   * 
   * @param uri
   */
  public void setUri(URI uri) {
    this.uri = uri;
  }

  public void setUri(String uriString) {
    uri = URI.createURI(uriString);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.xml.ObjectResolver#resolveToEObject(java.lang.Object)
   */
  public EObject resolveToEObject(Object object) {
    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
    final EClass eClass = modelObject.eClass();
    return EcoreUtil.create(eClass);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.xml.ObjectResolver#resolveFromEObject(org.eclipse.emf.ecore.EObject)
   */
  public Object resolveFromEObject(EObject eObject) {
    final URI proxyUri = ((InternalEObject) eObject).eProxyURI();
    if (proxyUri != null) {
      final String fragment = proxyUri.fragment();
      if (fragment != null) {
        final boolean localRef = fragment.startsWith("/"); //$NON-NLS-1$
        if (!localRef) {
          return fromUri(proxyUri);
        }
      }
    }

    if (eObject.eClass() == EcorePackage.eINSTANCE.getEObject()) {
      // TODO: check this should maybe be moved to a factory
      // or to a new DynamicModelPackage
      final DynamicModelObject modelObject = ComponentProvider.getInstance().newInstance(DynamicModelObject.class);
      modelObject.setEClass(eObject.eClass());
      return modelObject;
    }

    try {
      final EAttribute eAttribute = IdProvider.getInstance().getIdEAttribute(eObject.eClass());
      if (eObject.eGet(eAttribute) != null) {
        final Object target = get(eObject.eClass(), eObject.eGet(eAttribute));
        if (target != null) {
          return target;
        }
      }
    } catch (IllegalStateException e) {
      // ignore on purpose
    }

    final ModelPackage modelPackage = ModelResolver.getInstance().getModelPackage(
        eObject.eClass().getEPackage().getNsURI());
    return modelPackage.getModelFactory().create(eObject.eClass());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectURIResolver#toUri(java.lang.Object)
   */
  public URI toUri(Object object) {
    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
    final String idString = IdProvider.getInstance().getIdAsString(modelObject);
    if (idString == null || idString.trim().length() == 0) {
      return null;
    }
    if (isUseWebServiceUriFormat()) {
      // append a fragment to make sure that EMF correctly handles the id
      return getUri().appendSegment(ModelUtils.getQualifiedNameFromEClass(modelObject.eClass()))
          .appendSegment(idString).appendFragment(""); //$NON-NLS-1$
    }

    return getUri().appendFragment(
        ModelUtils.getQualifiedNameFromEClass(modelObject.eClass()) + FRAGMENTSEPARATOR + idString);
  }

  /**
   * Create an uri on the basis of the type and the id value.
   */
  public URI toURI(EClass eClass, String idString) {
    if (isUseWebServiceUriFormat()) {
      // append a fragment to make sure that EMF correctly handles the id
      return getUri().appendSegment(ModelUtils.getQualifiedNameFromEClass(eClass)).appendSegment(idString)
          .appendFragment(""); //$NON-NLS-1$
    }

    return getUri().appendFragment(ModelUtils.getQualifiedNameFromEClass(eClass) + FRAGMENTSEPARATOR + idString);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectURIResolver#fromUri(org.eclipse.emf.common.util.URI)
   */
  public Object fromUri(URI objectUri) {
    final Object idValue;
    EClass eClass = null;
    if (isUseWebServiceUriFormat() && !objectUri.toString().contains(FRAGMENTSEPARATOR)) {
      final String idString = objectUri.lastSegment();
      final String eClassName = objectUri.trimSegments(1).lastSegment();
      eClass = ModelUtils.getEClassFromQualifiedName(eClassName);
      if (eClass == null) {
        throw new IllegalArgumentException("No eclass found for uri " + objectUri.toString()); //$NON-NLS-1$
      }
      idValue = IdProvider.getInstance().convertIdStringToId(eClass, idString);
    } else {
      final String fragment = objectUri.fragment();

      final int separatorIndex = fragment.indexOf(FRAGMENTSEPARATOR);
      if (separatorIndex == -1) {
        throw new IllegalArgumentException("Fragment format not supported for fragment: " + fragment); //$NON-NLS-1$
      }
      eClass = ModelUtils.getEClassFromQualifiedName(fragment.substring(0, separatorIndex));
      final String idString = fragment.substring(separatorIndex + FRAGMENTSEPARATOR_LENGTH);
      idValue = IdProvider.getInstance().convertIdStringToId(eClass, idString);
    }
    return get(eClass, idValue);
  }

  public Object get(EClass eClass, Object id) {
    return ModelResolver.getInstance().getModelPackage(eClass.getEPackage().getNsURI()).getModelFactory()
        .create(eClass);
  }

  /**
   * If true then this uri resolver will generate and parse uris of the form: http://localhost:8080/texo/wsxml/Library/1
   * So the EClass name and id are appended at the end with the forward slash as separator.
   */
  public boolean isUseWebServiceUriFormat() {
    return useWebServiceUriFormat;
  }

  public void setUseWebServiceUriFormat(boolean useWebServiceUriFormat) {
    this.useWebServiceUriFormat = useWebServiceUriFormat;
  }

}
