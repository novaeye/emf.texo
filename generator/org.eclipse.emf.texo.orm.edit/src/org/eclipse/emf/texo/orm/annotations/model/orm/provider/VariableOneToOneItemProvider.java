/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableOneToOneItemProvider.java,v 1.4 2011/08/25 15:03:10 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class VariableOneToOneItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public VariableOneToOneItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addAccessPropertyDescriptor(object);
      addFetchPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addOptionalPropertyDescriptor(object);
      addOrphanRemovalPropertyDescriptor(object);
      addTargetInterfacePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Access feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addAccessPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_access_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_access_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_Access(), true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Fetch feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addFetchPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_fetch_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_fetch_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_Fetch(), true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_name_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_name_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_Name(), true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Optional feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addOptionalPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_optional_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_optional_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_Optional(), true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Orphan Removal feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addOrphanRemovalPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_orphanRemoval_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_orphanRemoval_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_OrphanRemoval(), true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Target Interface feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addTargetInterfacePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_VariableOneToOne_targetInterface_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_VariableOneToOne_targetInterface_feature",
            "_UI_VariableOneToOne_type"), OrmPackage.eINSTANCE.getVariableOneToOne_TargetInterface(), true, false,
        false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_Cascade());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_DiscriminatorColumn());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_DiscriminatorClass());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_JoinColumn());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_PrivateOwned());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_Property());
      childrenFeatures.add(OrmPackage.eINSTANCE.getVariableOneToOne_AccessMethods());
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns VariableOneToOne.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableOneToOne"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((VariableOneToOne) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_VariableOneToOne_type")
        : getString("_UI_VariableOneToOne_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
   * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(VariableOneToOne.class)) {
    case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS:
    case OrmPackage.VARIABLE_ONE_TO_ONE__FETCH:
    case OrmPackage.VARIABLE_ONE_TO_ONE__NAME:
    case OrmPackage.VARIABLE_ONE_TO_ONE__OPTIONAL:
    case OrmPackage.VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL:
    case OrmPackage.VARIABLE_ONE_TO_ONE__TARGET_INTERFACE:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case OrmPackage.VARIABLE_ONE_TO_ONE__CASCADE:
    case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN:
    case OrmPackage.VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS:
    case OrmPackage.VARIABLE_ONE_TO_ONE__JOIN_COLUMN:
    case OrmPackage.VARIABLE_ONE_TO_ONE__PRIVATE_OWNED:
    case OrmPackage.VARIABLE_ONE_TO_ONE__PROPERTY:
    case OrmPackage.VARIABLE_ONE_TO_ONE__ACCESS_METHODS:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
   * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_Cascade(),
        OrmFactory.eINSTANCE.createCascadeType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_DiscriminatorColumn(),
        OrmFactory.eINSTANCE.createDiscriminatorColumn()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_DiscriminatorClass(),
        OrmFactory.eINSTANCE.createDiscriminatorClass()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_JoinColumn(),
        OrmFactory.eINSTANCE.createJoinColumn()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_PrivateOwned(),
        OrmFactory.eINSTANCE.createEmptyType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_Property(),
        OrmFactory.eINSTANCE.createProperty()));

    newChildDescriptors.add(createChildParameter(OrmPackage.eINSTANCE.getVariableOneToOne_AccessMethods(),
        OrmFactory.eINSTANCE.createAccessMethods()));
  }

  /**
   * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return Eclipselink_orm_2_0EditPlugin.INSTANCE;
  }

}
