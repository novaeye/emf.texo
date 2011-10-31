package ru.satseqsys.model;

import java.util.Date;

/** 
 * A representation of the model object '<em><b>CarRegInfo</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Свидетельство о регистрации
 * <!-- end-model-doc -->
 * @generated 
 */
public class CarRegInfo extends Document {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Person owner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Регистрационный знак
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String regNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Идентификационный номер (VIN)
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String vin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Год выпуска
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Date releaseYear = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер двигателя
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String engineNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер шасси
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String chassisNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер кузова
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String bodyNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Цвет
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String color = null;

	/**
	 * Returns the value of '<em><b>owner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>owner</b></em>' feature
	 * @generated
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * Sets the '{@link CarRegInfo#getOwner() <em>owner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CarRegInfo#getOwner() owner}' feature.
	 * @generated
	 */
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}

	/**
	 * Returns the value of '<em><b>regNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Регистрационный знак
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>regNumber</b></em>' feature
	 * @generated
	 */
	public String getRegNumber() {
		return regNumber;
	}

	/**
	 * Sets the '{@link CarRegInfo#getRegNumber() <em>regNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Регистрационный знак
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getRegNumber() regNumber}' feature.
	 * @generated
	 */
	public void setRegNumber(String newRegNumber) {
		regNumber = newRegNumber;
	}

	/**
	 * Returns the value of '<em><b>vin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Идентификационный номер (VIN)
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>vin</b></em>' feature
	 * @generated
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * Sets the '{@link CarRegInfo#getVin() <em>vin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Идентификационный номер (VIN)
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getVin() vin}' feature.
	 * @generated
	 */
	public void setVin(String newVin) {
		vin = newVin;
	}

	/**
	 * Returns the value of '<em><b>releaseYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Год выпуска
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>releaseYear</b></em>' feature
	 * @generated
	 */
	public Date getReleaseYear() {
		return releaseYear;
	}

	/**
	 * Sets the '{@link CarRegInfo#getReleaseYear() <em>releaseYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Год выпуска
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getReleaseYear() releaseYear}' feature.
	 * @generated
	 */
	public void setReleaseYear(Date newReleaseYear) {
		releaseYear = newReleaseYear;
	}

	/**
	 * Returns the value of '<em><b>engineNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер двигателя
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>engineNumber</b></em>' feature
	 * @generated
	 */
	public String getEngineNumber() {
		return engineNumber;
	}

	/**
	 * Sets the '{@link CarRegInfo#getEngineNumber() <em>engineNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер двигателя
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getEngineNumber() engineNumber}' feature.
	 * @generated
	 */
	public void setEngineNumber(String newEngineNumber) {
		engineNumber = newEngineNumber;
	}

	/**
	 * Returns the value of '<em><b>chassisNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер шасси
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>chassisNumber</b></em>' feature
	 * @generated
	 */
	public String getChassisNumber() {
		return chassisNumber;
	}

	/**
	 * Sets the '{@link CarRegInfo#getChassisNumber() <em>chassisNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер шасси
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getChassisNumber() chassisNumber}' feature.
	 * @generated
	 */
	public void setChassisNumber(String newChassisNumber) {
		chassisNumber = newChassisNumber;
	}

	/**
	 * Returns the value of '<em><b>bodyNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер кузова
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>bodyNumber</b></em>' feature
	 * @generated
	 */
	public String getBodyNumber() {
		return bodyNumber;
	}

	/**
	 * Sets the '{@link CarRegInfo#getBodyNumber() <em>bodyNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер кузова
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getBodyNumber() bodyNumber}' feature.
	 * @generated
	 */
	public void setBodyNumber(String newBodyNumber) {
		bodyNumber = newBodyNumber;
	}

	/**
	 * Returns the value of '<em><b>color</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Цвет
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>color</b></em>' feature
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the '{@link CarRegInfo#getColor() <em>color</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Цвет
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link CarRegInfo#getColor() color}' feature.
	 * @generated
	 */
	public void setColor(String newColor) {
		color = newColor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CarRegInfo " + " [regNumber: " + getRegNumber() + "]"
				+ " [vin: " + getVin() + "]" + " [releaseYear: "
				+ getReleaseYear() + "]" + " [engineNumber: "
				+ getEngineNumber() + "]" + " [chassisNumber: "
				+ getChassisNumber() + "]" + " [bodyNumber: " + getBodyNumber()
				+ "]" + " [color: " + getColor() + "]";
	}
}
