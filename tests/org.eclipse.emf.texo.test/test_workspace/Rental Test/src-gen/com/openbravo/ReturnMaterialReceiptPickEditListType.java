package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ReturnMaterialReceiptPickEditListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ReturnMaterialReceiptPickEditListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ReturnMaterialReceiptPickEditType> returnMaterialReceiptPickEdit = new ArrayList<ReturnMaterialReceiptPickEditType>();

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature
	 * @generated
	 */
	public List<ReturnMaterialReceiptPickEditType> getReturnMaterialReceiptPickEdit() {
		return returnMaterialReceiptPickEdit;
	}

	/**
	 * Adds to the <em>returnMaterialReceiptPickEdit</em> feature.
	 * @generated
	 */
	public void addToReturnMaterialReceiptPickEdit(
			ReturnMaterialReceiptPickEditType returnMaterialReceiptPickEditValue) {
		if (!returnMaterialReceiptPickEdit
				.contains(returnMaterialReceiptPickEditValue)) {

			returnMaterialReceiptPickEdit
					.add(returnMaterialReceiptPickEditValue);
		}

	}

	/**			
	 * Removes from the <em>returnMaterialReceiptPickEdit</em> feature.
	 * @generated
	 */
	public void removeFromReturnMaterialReceiptPickEdit(
			ReturnMaterialReceiptPickEditType returnMaterialReceiptPickEditValue) {
		if (returnMaterialReceiptPickEdit
				.contains(returnMaterialReceiptPickEditValue)) {
			returnMaterialReceiptPickEdit
					.remove(returnMaterialReceiptPickEditValue);
		}
	}

	/**			
	 * Clears the <em>returnMaterialReceiptPickEdit</em> feature.
	 * @generated
	 */
	public void clearReturnMaterialReceiptPickEdit() {
		while (!returnMaterialReceiptPickEdit.isEmpty()) {
			removeFromReturnMaterialReceiptPickEdit(returnMaterialReceiptPickEdit
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ReturnMaterialReceiptPickEditListType#getReturnMaterialReceiptPickEdit() <em>returnMaterialReceiptPickEdit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ReturnMaterialReceiptPickEditListType#getReturnMaterialReceiptPickEdit() returnMaterialReceiptPickEdit}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEdit(
			List<ReturnMaterialReceiptPickEditType> newReturnMaterialReceiptPickEdit) {
		returnMaterialReceiptPickEdit = newReturnMaterialReceiptPickEdit;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ReturnMaterialReceiptPickEditListType ";
	}
}
