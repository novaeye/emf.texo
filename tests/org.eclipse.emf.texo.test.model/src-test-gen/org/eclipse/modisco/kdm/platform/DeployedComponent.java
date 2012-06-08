package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.modisco.kdm.code.Module;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DeployedComponent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "platform_DeployedComponent")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class DeployedComponent extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<Module> groupedCode = new HashSet<Module>();

  /**
   * Returns the value of '<em><b>groupedCode</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedCode</b></em>' feature
   * @generated
   */
  public Set<Module> getGroupedCode() {
    return groupedCode;
  }

  /**
   * Adds to the <em>groupedCode</em> feature.
   * 
   * @generated
   */
  public void addToGroupedCode(Module groupedCodeValue) {
    if (!groupedCode.contains(groupedCodeValue)) {
      groupedCode.add(groupedCodeValue);
    }
  }

  /**
   * Removes from the <em>groupedCode</em> feature.
   * 
   * @generated
   */
  public void removeFromGroupedCode(Module groupedCodeValue) {
    if (groupedCode.contains(groupedCodeValue)) {
      groupedCode.remove(groupedCodeValue);
    }
  }

  /**
   * Clears the <em>groupedCode</em> feature.
   * 
   * @generated
   */
  public void clearGroupedCode() {
    while (!groupedCode.isEmpty()) {
      removeFromGroupedCode(groupedCode.iterator().next());
    }
  }

  /**
   * Sets the '{@link DeployedComponent#getGroupedCode() <em>groupedCode</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DeployedComponent#getGroupedCode() groupedCode}' feature.
   * @generated
   */
  public void setGroupedCode(Set<Module> newGroupedCode) {
    groupedCode = newGroupedCode;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DeployedComponent ";
  }
}
