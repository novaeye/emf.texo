package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPPurchasingRunLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPPurchasingRunLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MRPPurchasingRunLineType> mRPPurchasingRunLine = new ArrayList<MRPPurchasingRunLineType>();

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunLine</b></em>' feature
	 * @generated
	 */
	public List<MRPPurchasingRunLineType> getMRPPurchasingRunLine() {
		return mRPPurchasingRunLine;
	}

	/**
	 * Adds to the <em>mRPPurchasingRunLine</em> feature.
	 * @generated
	 */
	public void addToMRPPurchasingRunLine(
			MRPPurchasingRunLineType mRPPurchasingRunLineValue) {
		if (!mRPPurchasingRunLine.contains(mRPPurchasingRunLineValue)) {

			mRPPurchasingRunLine.add(mRPPurchasingRunLineValue);
		}

	}

	/**			
	 * Removes from the <em>mRPPurchasingRunLine</em> feature.
	 * @generated
	 */
	public void removeFromMRPPurchasingRunLine(
			MRPPurchasingRunLineType mRPPurchasingRunLineValue) {
		if (mRPPurchasingRunLine.contains(mRPPurchasingRunLineValue)) {
			mRPPurchasingRunLine.remove(mRPPurchasingRunLineValue);
		}
	}

	/**			
	 * Clears the <em>mRPPurchasingRunLine</em> feature.
	 * @generated
	 */
	public void clearMRPPurchasingRunLine() {
		while (!mRPPurchasingRunLine.isEmpty()) {
			removeFromMRPPurchasingRunLine(mRPPurchasingRunLine.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link MRPPurchasingRunLineListType#getMRPPurchasingRunLine() <em>mRPPurchasingRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineListType#getMRPPurchasingRunLine() mRPPurchasingRunLine}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLine(
			List<MRPPurchasingRunLineType> newMRPPurchasingRunLine) {
		mRPPurchasingRunLine = newMRPPurchasingRunLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MRPPurchasingRunLineListType ";
	}
}
