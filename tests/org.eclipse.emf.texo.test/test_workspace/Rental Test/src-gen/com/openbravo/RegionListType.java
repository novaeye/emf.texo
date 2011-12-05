package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>RegionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RegionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<RegionType> region = new ArrayList<RegionType>();

	/**
	 * Returns the value of '<em><b>region</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>region</b></em>' feature
	 * @generated
	 */
	public List<RegionType> getRegion() {
		return region;
	}

	/**
	 * Adds to the <em>region</em> feature.
	 * @generated
	 */
	public void addToRegion(RegionType regionValue) {
		if (!region.contains(regionValue)) {

			region.add(regionValue);
		}

	}

	/**			
	 * Removes from the <em>region</em> feature.
	 * @generated
	 */
	public void removeFromRegion(RegionType regionValue) {
		if (region.contains(regionValue)) {
			region.remove(regionValue);
		}
	}

	/**			
	 * Clears the <em>region</em> feature.
	 * @generated
	 */
	public void clearRegion() {
		while (!region.isEmpty()) {
			removeFromRegion(region.iterator().next());
		}
	}

	/**
	 * Sets the '{@link RegionListType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RegionListType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(List<RegionType> newRegion) {
		region = newRegion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "RegionListType ";
	}
}
