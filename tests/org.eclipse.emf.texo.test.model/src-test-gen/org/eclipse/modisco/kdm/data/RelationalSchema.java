package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.code.CodeItem;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>RelationalSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "data_RelationalSchema")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RelationalSchema extends DataContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<CodeItem> codeElement = new HashSet<CodeItem>();

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public Set<CodeItem> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * 
   * @param codeElementValue
   *          the value to add
   * 
   * @generated
   */
  public void addToCodeElement(CodeItem codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {
      codeElement.add(codeElementValue);
    }
  }

  /**
   * Removes from the <em>codeElement</em> feature.
   * 
   * @param codeElementValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromCodeElement(CodeItem codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      codeElement.remove(codeElementValue);
    }
  }

  /**
   * Clears the <em>codeElement</em> feature.
   * 
   * @generated
   */
  public void clearCodeElement() {
    while (!codeElement.isEmpty()) {
      removeFromCodeElement(codeElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link RelationalSchema#getCodeElement() <em>codeElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeElement
   *          the new value of the '{@link RelationalSchema#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(Set<CodeItem> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RelationalSchema ";
  }
}
