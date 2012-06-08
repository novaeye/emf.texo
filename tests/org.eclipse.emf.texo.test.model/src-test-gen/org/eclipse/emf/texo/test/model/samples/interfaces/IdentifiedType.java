package org.eclipse.emf.texo.test.model.samples.interfaces;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>IdentifiedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "interfaces_IdentifiedType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
@Access(AccessType.PROPERTY)
public interface IdentifiedType extends IdentifiableInterface {
  /**
   * Returns the value of '<em><b>identifier</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>identifier</b></em>' feature
   * @generated
   */
  public String getIdentifier();

  /**
   * Sets the '{@link IdentifiedType#getIdentifier() <em>identifier</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link IdentifiedType#getIdentifier() <em>identifier</em>}' feature.
   * @generated
   */
  public void setIdentifier(String newIdentifier);

}
