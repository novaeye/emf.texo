package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtInventoryCountLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtInventoryCountLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtInventoryCountLineType> materialMgmtInventoryCountLine = new ArrayList<MaterialMgmtInventoryCountLineType>();

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInventoryCountLineType> getMaterialMgmtInventoryCountLine() {
		return materialMgmtInventoryCountLine;
	}

	/**
	 * Adds to the <em>materialMgmtInventoryCountLine</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtInventoryCountLine(
			MaterialMgmtInventoryCountLineType materialMgmtInventoryCountLineValue) {
		if (!materialMgmtInventoryCountLine
				.contains(materialMgmtInventoryCountLineValue)) {

			materialMgmtInventoryCountLine
					.add(materialMgmtInventoryCountLineValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtInventoryCountLine</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtInventoryCountLine(
			MaterialMgmtInventoryCountLineType materialMgmtInventoryCountLineValue) {
		if (materialMgmtInventoryCountLine
				.contains(materialMgmtInventoryCountLineValue)) {
			materialMgmtInventoryCountLine
					.remove(materialMgmtInventoryCountLineValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtInventoryCountLine</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtInventoryCountLine() {
		while (!materialMgmtInventoryCountLine.isEmpty()) {
			removeFromMaterialMgmtInventoryCountLine(materialMgmtInventoryCountLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtInventoryCountLineListType#getMaterialMgmtInventoryCountLine() <em>materialMgmtInventoryCountLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtInventoryCountLineListType#getMaterialMgmtInventoryCountLine() materialMgmtInventoryCountLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountLine(
			List<MaterialMgmtInventoryCountLineType> newMaterialMgmtInventoryCountLine) {
		materialMgmtInventoryCountLine = newMaterialMgmtInventoryCountLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtInventoryCountLineListType ";
	}
}
