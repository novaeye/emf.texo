package org.eclipse.modisco.kdm.structure;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>StructureModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "structure_StructureModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class StructureModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractStructureElement> structureElement = new HashSet<AbstractStructureElement>();

  /**
   * Returns the value of '<em><b>structureElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>structureElement</b></em>' feature
   * @generated
   */
  public Set<AbstractStructureElement> getStructureElement() {
    return structureElement;
  }

  /**
   * Adds to the <em>structureElement</em> feature.
   * 
   * @param structureElementValue
   *          the value to add
   * 
   * @generated
   */
  public void addToStructureElement(AbstractStructureElement structureElementValue) {
    if (!structureElement.contains(structureElementValue)) {
      structureElement.add(structureElementValue);
    }
  }

  /**
   * Removes from the <em>structureElement</em> feature.
   * 
   * @param structureElementValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromStructureElement(AbstractStructureElement structureElementValue) {
    if (structureElement.contains(structureElementValue)) {
      structureElement.remove(structureElementValue);
    }
  }

  /**
   * Clears the <em>structureElement</em> feature.
   * 
   * @generated
   */
  public void clearStructureElement() {
    while (!structureElement.isEmpty()) {
      removeFromStructureElement(structureElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link StructureModel#getStructureElement() <em>structureElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStructureElement
   *          the new value of the '{@link StructureModel#getStructureElement() structureElement}' feature.
   * @generated
   */
  public void setStructureElement(Set<AbstractStructureElement> newStructureElement) {
    structureElement = newStructureElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "StructureModel ";
  }
}
