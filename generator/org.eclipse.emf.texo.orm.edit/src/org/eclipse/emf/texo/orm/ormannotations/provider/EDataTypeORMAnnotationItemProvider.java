/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataTypeORMAnnotationItemProvider.java,v 1.6 2011/09/23 20:59:49 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.annotations.annotationsmodel.provider.EDataTypeAnnotationItemProvider;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EDataTypeORMAnnotationItemProvider extends EDataTypeAnnotationItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
    IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EDataTypeORMAnnotationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EDataTypeORMAnnotation_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EDataTypeORMAnnotation_version_feature", "_UI_EDataTypeORMAnnotation_type"),
				 OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrmannotationsPackage.Literals.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT);
			childrenFeatures.add(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__BASIC);
			childrenFeatures.add(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__ID);
			childrenFeatures.add(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns EDataTypeORMAnnotation.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EDataTypeORMAnnotation"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((EDataTypeORMAnnotation)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_EDataTypeORMAnnotation_type") :
			getString("_UI_EDataTypeORMAnnotation_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EDataTypeORMAnnotation.class)) {
			case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
			case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
			case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
			case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OrmannotationsPackage.Literals.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT,
				 OrmFactory.eINSTANCE.createTransient()));

		newChildDescriptors.add
			(createChildParameter
				(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__BASIC,
				 OrmFactory.eINSTANCE.createBasic()));

		newChildDescriptors.add
			(createChildParameter
				(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__ID,
				 OrmFactory.eINSTANCE.createId()));

		newChildDescriptors.add
			(createChildParameter
				(OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION,
				 OrmFactory.eINSTANCE.createElementCollection()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return TexoannotationsormEditPlugin.INSTANCE;
	}

}
