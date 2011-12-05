package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPProductionRunLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPProductionRunLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MRPProductionRunLineType> mRPProductionRunLine = new ArrayList<MRPProductionRunLineType>();

	/**
	 * Returns the value of '<em><b>mRPProductionRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLine</b></em>' feature
	 * @generated
	 */
	public List<MRPProductionRunLineType> getMRPProductionRunLine() {
		return mRPProductionRunLine;
	}

	/**
	 * Adds to the <em>mRPProductionRunLine</em> feature.
	 * @generated
	 */
	public void addToMRPProductionRunLine(
			MRPProductionRunLineType mRPProductionRunLineValue) {
		if (!mRPProductionRunLine.contains(mRPProductionRunLineValue)) {

			mRPProductionRunLine.add(mRPProductionRunLineValue);
		}

	}

	/**			
	 * Removes from the <em>mRPProductionRunLine</em> feature.
	 * @generated
	 */
	public void removeFromMRPProductionRunLine(
			MRPProductionRunLineType mRPProductionRunLineValue) {
		if (mRPProductionRunLine.contains(mRPProductionRunLineValue)) {
			mRPProductionRunLine.remove(mRPProductionRunLineValue);
		}
	}

	/**			
	 * Clears the <em>mRPProductionRunLine</em> feature.
	 * @generated
	 */
	public void clearMRPProductionRunLine() {
		while (!mRPProductionRunLine.isEmpty()) {
			removeFromMRPProductionRunLine(mRPProductionRunLine.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link MRPProductionRunLineListType#getMRPProductionRunLine() <em>mRPProductionRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineListType#getMRPProductionRunLine() mRPProductionRunLine}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLine(
			List<MRPProductionRunLineType> newMRPProductionRunLine) {
		mRPProductionRunLine = newMRPProductionRunLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MRPProductionRunLineListType ";
	}
}
