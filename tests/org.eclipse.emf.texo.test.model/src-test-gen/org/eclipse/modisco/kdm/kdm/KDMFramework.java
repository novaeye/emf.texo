package org.eclipse.modisco.kdm.kdm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.core.ModelElement;

/**
 * A representation of the model object '<em><b>KDMFramework</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_KDMFramework")
public abstract class KDMFramework extends ModelElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Audit> audit = new HashSet<Audit>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<ExtensionFamily> extension = new HashSet<ExtensionFamily>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * Returns the value of '<em><b>audit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>audit</b></em>' feature
   * @generated
   */
  public Set<Audit> getAudit() {
    return audit;
  }

  /**
   * Adds to the <em>audit</em> feature.
   * 
   * @generated
   */
  public void addToAudit(Audit auditValue) {
    if (!audit.contains(auditValue)) {
      audit.add(auditValue);
    }
  }

  /**
   * Removes from the <em>audit</em> feature.
   * 
   * @generated
   */
  public void removeFromAudit(Audit auditValue) {
    if (audit.contains(auditValue)) {
      audit.remove(auditValue);
    }
  }

  /**
   * Clears the <em>audit</em> feature.
   * 
   * @generated
   */
  public void clearAudit() {
    while (!audit.isEmpty()) {
      removeFromAudit(audit.iterator().next());
    }
  }

  /**
   * Sets the '{@link KDMFramework#getAudit() <em>audit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link KDMFramework#getAudit() audit}' feature.
   * @generated
   */
  public void setAudit(Set<Audit> newAudit) {
    audit = newAudit;
  }

  /**
   * Returns the value of '<em><b>extension</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>extension</b></em>' feature
   * @generated
   */
  public Set<ExtensionFamily> getExtension() {
    return extension;
  }

  /**
   * Adds to the <em>extension</em> feature.
   * 
   * @generated
   */
  public void addToExtension(ExtensionFamily extensionValue) {
    if (!extension.contains(extensionValue)) {
      extension.add(extensionValue);
    }
  }

  /**
   * Removes from the <em>extension</em> feature.
   * 
   * @generated
   */
  public void removeFromExtension(ExtensionFamily extensionValue) {
    if (extension.contains(extensionValue)) {
      extension.remove(extensionValue);
    }
  }

  /**
   * Clears the <em>extension</em> feature.
   * 
   * @generated
   */
  public void clearExtension() {
    while (!extension.isEmpty()) {
      removeFromExtension(extension.iterator().next());
    }
  }

  /**
   * Sets the '{@link KDMFramework#getExtension() <em>extension</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link KDMFramework#getExtension() extension}' feature.
   * @generated
   */
  public void setExtension(Set<ExtensionFamily> newExtension) {
    extension = newExtension;
  }

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
   * Sets the '{@link KDMFramework#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link KDMFramework#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "KDMFramework " + " [name: " + getName() + "]";
  }
}
