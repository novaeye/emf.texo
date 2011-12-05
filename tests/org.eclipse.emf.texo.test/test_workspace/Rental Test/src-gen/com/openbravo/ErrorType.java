package com.openbravo;

/** 
 * A representation of the model object '<em><b>ErrorType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ErrorType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String message = null;

	/**
	 * Returns the value of '<em><b>message</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>message</b></em>' feature
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the '{@link ErrorType#getMessage() <em>message</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ErrorType#getMessage() message}' feature.
	 * @generated
	 */
	public void setMessage(String newMessage) {
		message = newMessage;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ErrorType " + " [message: " + getMessage() + "]";
	}
}
