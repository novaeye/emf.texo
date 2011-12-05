package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtCostingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtCostingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtCostingType> materialMgmtCosting = new ArrayList<MaterialMgmtCostingType>();

	/**
	 * Returns the value of '<em><b>materialMgmtCosting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtCosting</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtCostingType> getMaterialMgmtCosting() {
		return materialMgmtCosting;
	}

	/**
	 * Adds to the <em>materialMgmtCosting</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtCosting(
			MaterialMgmtCostingType materialMgmtCostingValue) {
		if (!materialMgmtCosting.contains(materialMgmtCostingValue)) {

			materialMgmtCosting.add(materialMgmtCostingValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtCosting</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtCosting(
			MaterialMgmtCostingType materialMgmtCostingValue) {
		if (materialMgmtCosting.contains(materialMgmtCostingValue)) {
			materialMgmtCosting.remove(materialMgmtCostingValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtCosting</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtCosting() {
		while (!materialMgmtCosting.isEmpty()) {
			removeFromMaterialMgmtCosting(materialMgmtCosting.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtCostingListType#getMaterialMgmtCosting() <em>materialMgmtCosting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtCostingListType#getMaterialMgmtCosting() materialMgmtCosting}' feature.
	 * @generated
	 */
	public void setMaterialMgmtCosting(
			List<MaterialMgmtCostingType> newMaterialMgmtCosting) {
		materialMgmtCosting = newMaterialMgmtCosting;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtCostingListType ";
	}
}
