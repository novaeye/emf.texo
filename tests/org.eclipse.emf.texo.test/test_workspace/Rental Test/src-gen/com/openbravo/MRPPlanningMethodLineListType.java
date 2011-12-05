package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPPlanningMethodLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPPlanningMethodLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MRPPlanningMethodLineType> mRPPlanningMethodLine = new ArrayList<MRPPlanningMethodLineType>();

	/**
	 * Returns the value of '<em><b>mRPPlanningMethodLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanningMethodLine</b></em>' feature
	 * @generated
	 */
	public List<MRPPlanningMethodLineType> getMRPPlanningMethodLine() {
		return mRPPlanningMethodLine;
	}

	/**
	 * Adds to the <em>mRPPlanningMethodLine</em> feature.
	 * @generated
	 */
	public void addToMRPPlanningMethodLine(
			MRPPlanningMethodLineType mRPPlanningMethodLineValue) {
		if (!mRPPlanningMethodLine.contains(mRPPlanningMethodLineValue)) {

			mRPPlanningMethodLine.add(mRPPlanningMethodLineValue);
		}

	}

	/**			
	 * Removes from the <em>mRPPlanningMethodLine</em> feature.
	 * @generated
	 */
	public void removeFromMRPPlanningMethodLine(
			MRPPlanningMethodLineType mRPPlanningMethodLineValue) {
		if (mRPPlanningMethodLine.contains(mRPPlanningMethodLineValue)) {
			mRPPlanningMethodLine.remove(mRPPlanningMethodLineValue);
		}
	}

	/**			
	 * Clears the <em>mRPPlanningMethodLine</em> feature.
	 * @generated
	 */
	public void clearMRPPlanningMethodLine() {
		while (!mRPPlanningMethodLine.isEmpty()) {
			removeFromMRPPlanningMethodLine(mRPPlanningMethodLine.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link MRPPlanningMethodLineListType#getMRPPlanningMethodLine() <em>mRPPlanningMethodLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPlanningMethodLineListType#getMRPPlanningMethodLine() mRPPlanningMethodLine}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethodLine(
			List<MRPPlanningMethodLineType> newMRPPlanningMethodLine) {
		mRPPlanningMethodLine = newMRPPlanningMethodLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MRPPlanningMethodLineListType ";
	}
}
