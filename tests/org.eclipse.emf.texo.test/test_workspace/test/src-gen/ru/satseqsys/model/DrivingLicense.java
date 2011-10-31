package ru.satseqsys.model;

/** 
 * A representation of the model object '<em><b>DrivingLicense</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Водительское удостоверение
 * <!-- end-model-doc -->
 * @generated 
 */
public class DrivingLicense implements Document {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Серия
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String series = null;
	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String number = null;
	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата выдачи
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String issueDate = null;
	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Кем выдан
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String issued = null;

	/**
	 * Returns the value of '<em><b>series</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Серия
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>series</b></em>' feature
	 * @generated
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * Sets the '{@link DrivingLicense#getSeries() <em>series</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Серия
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link DrivingLicense#getSeries() series}' feature.
	 * @generated
	 */
	public void setSeries(String newSeries) {
		series = newSeries;
	}

	/**
	 * Returns the value of '<em><b>number</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>number</b></em>' feature
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the '{@link DrivingLicense#getNumber() <em>number</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link DrivingLicense#getNumber() number}' feature.
	 * @generated
	 */
	public void setNumber(String newNumber) {
		number = newNumber;
	}

	/**
	 * Returns the value of '<em><b>issueDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата выдачи
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>issueDate</b></em>' feature
	 * @generated
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * Sets the '{@link DrivingLicense#getIssueDate() <em>issueDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата выдачи
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link DrivingLicense#getIssueDate() issueDate}' feature.
	 * @generated
	 */
	public void setIssueDate(String newIssueDate) {
		issueDate = newIssueDate;
	}

	/**
	 * Returns the value of '<em><b>issued</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Кем выдан
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>issued</b></em>' feature
	 * @generated
	 */
	public String getIssued() {
		return issued;
	}

	/**
	 * Sets the '{@link DrivingLicense#getIssued() <em>issued</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Кем выдан
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link DrivingLicense#getIssued() issued}' feature.
	 * @generated
	 */
	public void setIssued(String newIssued) {
		issued = newIssued;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DrivingLicense " + " [series: " + getSeries() + "]"
				+ " [number: " + getNumber() + "]" + " [issueDate: "
				+ getIssueDate() + "]" + " [issued: " + getIssued() + "]";
	}
}
