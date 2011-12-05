package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPSalesForecastLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPSalesForecastLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MRPSalesForecastLineType> mRPSalesForecastLine = new ArrayList<MRPSalesForecastLineType>();

	/**
	 * Returns the value of '<em><b>mRPSalesForecastLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecastLine</b></em>' feature
	 * @generated
	 */
	public List<MRPSalesForecastLineType> getMRPSalesForecastLine() {
		return mRPSalesForecastLine;
	}

	/**
	 * Adds to the <em>mRPSalesForecastLine</em> feature.
	 * @generated
	 */
	public void addToMRPSalesForecastLine(
			MRPSalesForecastLineType mRPSalesForecastLineValue) {
		if (!mRPSalesForecastLine.contains(mRPSalesForecastLineValue)) {

			mRPSalesForecastLine.add(mRPSalesForecastLineValue);
		}

	}

	/**			
	 * Removes from the <em>mRPSalesForecastLine</em> feature.
	 * @generated
	 */
	public void removeFromMRPSalesForecastLine(
			MRPSalesForecastLineType mRPSalesForecastLineValue) {
		if (mRPSalesForecastLine.contains(mRPSalesForecastLineValue)) {
			mRPSalesForecastLine.remove(mRPSalesForecastLineValue);
		}
	}

	/**			
	 * Clears the <em>mRPSalesForecastLine</em> feature.
	 * @generated
	 */
	public void clearMRPSalesForecastLine() {
		while (!mRPSalesForecastLine.isEmpty()) {
			removeFromMRPSalesForecastLine(mRPSalesForecastLine.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link MRPSalesForecastLineListType#getMRPSalesForecastLine() <em>mRPSalesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPSalesForecastLineListType#getMRPSalesForecastLine() mRPSalesForecastLine}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastLine(
			List<MRPSalesForecastLineType> newMRPSalesForecastLine) {
		mRPSalesForecastLine = newMRPSalesForecastLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MRPSalesForecastLineListType ";
	}
}
