package org.eclipse.emf.texo.test.model.samples.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>CatalogType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "CatalogType")
public class CatalogType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<CatalogType> subCatalog = new ArrayList<CatalogType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private List<ProductType> product = new ArrayList<ProductType>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link CatalogType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CatalogType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link CatalogType#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CatalogType#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>subCatalog</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subCatalog</b></em>' feature
   * @generated
   */
  public List<CatalogType> getSubCatalog() {
    return subCatalog;
  }

  /**
   * Adds to the <em>subCatalog</em> feature.
   * 
   * @generated
   */
  public void addToSubCatalog(CatalogType subCatalogValue) {
    if (!subCatalog.contains(subCatalogValue)) {
      subCatalog.add(subCatalogValue);
    }
  }

  /**
   * Removes from the <em>subCatalog</em> feature.
   * 
   * @generated
   */
  public void removeFromSubCatalog(CatalogType subCatalogValue) {
    if (subCatalog.contains(subCatalogValue)) {
      subCatalog.remove(subCatalogValue);
    }
  }

  /**
   * Clears the <em>subCatalog</em> feature.
   * 
   * @generated
   */
  public void clearSubCatalog() {
    while (!subCatalog.isEmpty()) {
      removeFromSubCatalog(subCatalog.iterator().next());
    }
  }

  /**
   * Sets the '{@link CatalogType#getSubCatalog() <em>subCatalog</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CatalogType#getSubCatalog() subCatalog}' feature.
   * @generated
   */
  public void setSubCatalog(List<CatalogType> newSubCatalog) {
    subCatalog = newSubCatalog;
  }

  /**
   * Returns the value of '<em><b>product</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToProduct(org.eclipse.emf.texo.test.model.samples.catalog.ProductType value)} and
   * {@link #removeFromProduct(ProductType value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @return the value of '<em><b>product</b></em>' feature
   * @generated
   */
  public List<ProductType> getProduct() {
    return product;
  }

  /**
   * Adds to the <em>product</em> feature.
   * 
   * @generated
   */
  public void addToProduct(ProductType productValue) {
    if (!product.contains(productValue)) {
      product.add(productValue);
    }
  }

  /**
   * Removes from the <em>product</em> feature.
   * 
   * @generated
   */
  public void removeFromProduct(ProductType productValue) {
    if (product.contains(productValue)) {
      product.remove(productValue);
    }
  }

  /**
   * Clears the <em>product</em> feature.
   * 
   * @generated
   */
  public void clearProduct() {
    while (!product.isEmpty()) {
      removeFromProduct(product.iterator().next());
    }
  }

  /**
   * Sets the '{@link CatalogType#getProduct() <em>product</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My product documentation <!-- end-model-doc
   * -->
   * 
   * @param the
   *          new value of the '{@link CatalogType#getProduct() product}' feature.
   * @generated
   */
  public void setProduct(List<ProductType> newProduct) {
    product = newProduct;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CatalogType " + " [name: " + getName() + "]" + " [description: " + getDescription() + "]";
  }
}
