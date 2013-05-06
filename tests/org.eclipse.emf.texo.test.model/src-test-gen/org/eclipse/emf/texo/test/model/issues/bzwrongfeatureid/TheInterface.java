package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TheInterface</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bzWrongFeatureId_TheInterface")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
@Access(AccessType.PROPERTY)
public interface TheInterface {
  /**
   * Returns the value of '<em><b>interfaceName</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>interfaceName</b></em>' feature
   * @generated
   */
  public String getInterfaceName();

  /**
   * Sets the '{@link TheInterface#getInterfaceName() <em>interfaceName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInterfaceName
   *          the new value of the '{@link TheInterface#getInterfaceName() <em>interfaceName</em>}' feature.
   * @generated
   */
  public void setInterfaceName(String newInterfaceName);

}
