package org.eclipse.emf.texo.test.model.schemaconstructs.mixed;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRoot {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = DocumentRootMixedFeatureGroup.class)
  @JoinTable()
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @CollectionTable(name = "DocumentRoot_xMLNSPrefixMap")
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @CollectionTable(name = "DocumentRoot_xSISchemaLocation")
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = LetterBodyType.class)
  @JoinColumns({ @JoinColumn() })
  private LetterBodyType letterBody = null;

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<DocumentRootMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link DocumentRoot#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<DocumentRootMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>xMLNSPrefixMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xMLNSPrefixMap</b></em>' feature
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap() {
    return xMLNSPrefixMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getXMLNSPrefixMap() <em>xMLNSPrefixMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
   * @generated
   */
  public void setXMLNSPrefixMap(Map<String, String> newXMLNSPrefixMap) {
    xMLNSPrefixMap = newXMLNSPrefixMap;
  }

  /**
   * Returns the value of '<em><b>xSISchemaLocation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xSISchemaLocation</b></em>' feature
   * @generated
   */
  public Map<String, String> getXSISchemaLocation() {
    return xSISchemaLocation;
  }

  /**
   * Sets the '{@link DocumentRoot#getXSISchemaLocation() <em>xSISchemaLocation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>letterBody</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>letterBody</b></em>' feature
   * @generated
   */
  public LetterBodyType getLetterBody() {
    return letterBody;
  }

  /**
   * Sets the '{@link DocumentRoot#getLetterBody() <em>letterBody</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getLetterBody() letterBody}' feature.
   * @generated
   */
  public void setLetterBody(LetterBodyType newLetterBody) {
    letterBody = newLetterBody;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot ";
  }
}
