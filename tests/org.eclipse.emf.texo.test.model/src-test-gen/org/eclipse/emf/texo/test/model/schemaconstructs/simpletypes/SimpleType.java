package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * A representation of the model object '<em><b>SimpleType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "SimpleType")
public class SimpleType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = "c1";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean boo = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private byte byt = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double doubl = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private float float_ = 0.0f;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int inte = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private long lon = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private short shor = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private SimpleEnum enu = SimpleEnum.ENUM1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Temporal(TemporalType.DATE)
  private Date dat = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String limitedstring = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private BigDecimal limitedDecimal = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String extraLimitedString = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link SimpleType#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * Returns the value of '<em><b>boo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>boo</b></em>' feature
   * @generated
   */
  public boolean isBoo() {
    return boo;
  }

  /**
   * Sets the '{@link SimpleType#isBoo() <em>boo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#isBoo() boo}' feature.
   * @generated
   */
  public void setBoo(boolean newBoo) {
    boo = newBoo;
  }

  /**
   * Returns the value of '<em><b>byt</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byt</b></em>' feature
   * @generated
   */
  public byte getByt() {
    return byt;
  }

  /**
   * Sets the '{@link SimpleType#getByt() <em>byt</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getByt() byt}' feature.
   * @generated
   */
  public void setByt(byte newByt) {
    byt = newByt;
  }

  /**
   * Returns the value of '<em><b>doubl</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doubl</b></em>' feature
   * @generated
   */
  public double getDoubl() {
    return doubl;
  }

  /**
   * Sets the '{@link SimpleType#getDoubl() <em>doubl</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getDoubl() doubl}' feature.
   * @generated
   */
  public void setDoubl(double newDoubl) {
    doubl = newDoubl;
  }

  /**
   * Returns the value of '<em><b>float</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>float</b></em>' feature
   * @generated
   */
  public float getFloat() {
    return float_;
  }

  /**
   * Sets the '{@link SimpleType#getFloat() <em>float</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getFloat() float}' feature.
   * @generated
   */
  public void setFloat(float newFloat_) {
    float_ = newFloat_;
  }

  /**
   * Returns the value of '<em><b>inte</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inte</b></em>' feature
   * @generated
   */
  public int getInte() {
    return inte;
  }

  /**
   * Sets the '{@link SimpleType#getInte() <em>inte</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getInte() inte}' feature.
   * @generated
   */
  public void setInte(int newInte) {
    inte = newInte;
  }

  /**
   * Returns the value of '<em><b>lon</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lon</b></em>' feature
   * @generated
   */
  public long getLon() {
    return lon;
  }

  /**
   * Sets the '{@link SimpleType#getLon() <em>lon</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getLon() lon}' feature.
   * @generated
   */
  public void setLon(long newLon) {
    lon = newLon;
  }

  /**
   * Returns the value of '<em><b>shor</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shor</b></em>' feature
   * @generated
   */
  public short getShor() {
    return shor;
  }

  /**
   * Sets the '{@link SimpleType#getShor() <em>shor</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getShor() shor}' feature.
   * @generated
   */
  public void setShor(short newShor) {
    shor = newShor;
  }

  /**
   * Returns the value of '<em><b>enu</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>enu</b></em>' feature
   * @generated
   */
  public SimpleEnum getEnu() {
    return enu;
  }

  /**
   * Sets the '{@link SimpleType#getEnu() <em>enu</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getEnu() enu}' feature.
   * @generated
   */
  public void setEnu(SimpleEnum newEnu) {
    enu = newEnu;
  }

  /**
   * Returns the value of '<em><b>dat</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dat</b></em>' feature
   * @generated
   */
  public Date getDat() {
    return dat;
  }

  /**
   * Sets the '{@link SimpleType#getDat() <em>dat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getDat() dat}' feature.
   * @generated
   */
  public void setDat(Date newDat) {
    dat = newDat;
  }

  /**
   * Returns the value of '<em><b>limitedstring</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>limitedstring</b></em>' feature
   * @generated
   */
  public String getLimitedstring() {
    return limitedstring;
  }

  /**
   * Sets the '{@link SimpleType#getLimitedstring() <em>limitedstring</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getLimitedstring() limitedstring}' feature.
   * @generated
   */
  public void setLimitedstring(String newLimitedstring) {
    limitedstring = newLimitedstring;
  }

  /**
   * Returns the value of '<em><b>limitedDecimal</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>limitedDecimal</b></em>' feature
   * @generated
   */
  public BigDecimal getLimitedDecimal() {
    return limitedDecimal;
  }

  /**
   * Sets the '{@link SimpleType#getLimitedDecimal() <em>limitedDecimal</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getLimitedDecimal() limitedDecimal}' feature.
   * @generated
   */
  public void setLimitedDecimal(BigDecimal newLimitedDecimal) {
    limitedDecimal = newLimitedDecimal;
  }

  /**
   * Returns the value of '<em><b>extraLimitedString</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>extraLimitedString</b></em>' feature
   * @generated
   */
  public String getExtraLimitedString() {
    return extraLimitedString;
  }

  /**
   * Sets the '{@link SimpleType#getExtraLimitedString() <em>extraLimitedString</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleType#getExtraLimitedString() extraLimitedString}' feature.
   * @generated
   */
  public void setExtraLimitedString(String newExtraLimitedString) {
    extraLimitedString = newExtraLimitedString;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleType " + " [code: " + getCode() + "]" + " [boo: " + isBoo() + "]" + " [byt: " + getByt() + "]"
        + " [doubl: " + getDoubl() + "]" + " [float: " + getFloat() + "]" + " [inte: " + getInte() + "]" + " [lon: "
        + getLon() + "]" + " [shor: " + getShor() + "]" + " [enu: " + getEnu() + "]" + " [dat: " + getDat() + "]"
        + " [limitedstring: " + getLimitedstring() + "]" + " [limitedDecimal: " + getLimitedDecimal() + "]"
        + " [extraLimitedString: " + getExtraLimitedString() + "]";
  }
}
