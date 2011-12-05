package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtInternalMovementLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtInternalMovementLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtInternalMovementLineType> materialMgmtInternalMovementLine = new ArrayList<MaterialMgmtInternalMovementLineType>();

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalMovementLineType> getMaterialMgmtInternalMovementLine() {
		return materialMgmtInternalMovementLine;
	}

	/**
	 * Adds to the <em>materialMgmtInternalMovementLine</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtInternalMovementLine(
			MaterialMgmtInternalMovementLineType materialMgmtInternalMovementLineValue) {
		if (!materialMgmtInternalMovementLine
				.contains(materialMgmtInternalMovementLineValue)) {

			materialMgmtInternalMovementLine
					.add(materialMgmtInternalMovementLineValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtInternalMovementLine</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtInternalMovementLine(
			MaterialMgmtInternalMovementLineType materialMgmtInternalMovementLineValue) {
		if (materialMgmtInternalMovementLine
				.contains(materialMgmtInternalMovementLineValue)) {
			materialMgmtInternalMovementLine
					.remove(materialMgmtInternalMovementLineValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtInternalMovementLine</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtInternalMovementLine() {
		while (!materialMgmtInternalMovementLine.isEmpty()) {
			removeFromMaterialMgmtInternalMovementLine(materialMgmtInternalMovementLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtInternalMovementLineListType#getMaterialMgmtInternalMovementLine() <em>materialMgmtInternalMovementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtInternalMovementLineListType#getMaterialMgmtInternalMovementLine() materialMgmtInternalMovementLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLine(
			List<MaterialMgmtInternalMovementLineType> newMaterialMgmtInternalMovementLine) {
		materialMgmtInternalMovementLine = newMaterialMgmtInternalMovementLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtInternalMovementLineListType ";
	}
}
