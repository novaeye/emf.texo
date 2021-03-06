package org.eclipse.emf.texo.test.model.issues.bz393240;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRoot extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

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
   * @param newMixed
   *          the new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
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
   * @param newXMLNSPrefixMap
   *          the new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
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
   * @param newXSISchemaLocation
   *          the new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>applicationRequest</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>applicationRequest</b></em>' feature
   * @generated
   */
  public Application getApplicationRequest() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.APPLICATIONREQUEST);
  }

  /**
   * Sets the '{@link DocumentRoot#getApplicationRequest() <em>applicationRequest</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newApplicationRequest
   *          the new value of the '{@link DocumentRoot#getApplicationRequest() applicationRequest}' feature.
   * @generated
   */
  public void setApplicationRequest(Application newApplicationRequest) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.APPLICATIONREQUEST, newApplicationRequest);
  }

  /**
   * Returns the value of '<em><b>applicationResponse</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>applicationResponse</b></em>' feature
   * @generated
   */
  public Application getApplicationResponse() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.APPLICATIONRESPONSE);
  }

  /**
   * Sets the '{@link DocumentRoot#getApplicationResponse() <em>applicationResponse</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newApplicationResponse
   *          the new value of the '{@link DocumentRoot#getApplicationResponse() applicationResponse}' feature.
   * @generated
   */
  public void setApplicationResponse(Application newApplicationResponse) {
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.APPLICATIONRESPONSE, newApplicationResponse);
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
