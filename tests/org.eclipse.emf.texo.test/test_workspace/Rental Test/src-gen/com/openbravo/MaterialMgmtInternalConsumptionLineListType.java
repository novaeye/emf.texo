package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtInternalConsumptionLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtInternalConsumptionLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtInternalConsumptionLineType> materialMgmtInternalConsumptionLine = new ArrayList<MaterialMgmtInternalConsumptionLineType>();

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalConsumptionLineType> getMaterialMgmtInternalConsumptionLine() {
		return materialMgmtInternalConsumptionLine;
	}

	/**
	 * Adds to the <em>materialMgmtInternalConsumptionLine</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtInternalConsumptionLine(
			MaterialMgmtInternalConsumptionLineType materialMgmtInternalConsumptionLineValue) {
		if (!materialMgmtInternalConsumptionLine
				.contains(materialMgmtInternalConsumptionLineValue)) {

			materialMgmtInternalConsumptionLine
					.add(materialMgmtInternalConsumptionLineValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtInternalConsumptionLine</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtInternalConsumptionLine(
			MaterialMgmtInternalConsumptionLineType materialMgmtInternalConsumptionLineValue) {
		if (materialMgmtInternalConsumptionLine
				.contains(materialMgmtInternalConsumptionLineValue)) {
			materialMgmtInternalConsumptionLine
					.remove(materialMgmtInternalConsumptionLineValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtInternalConsumptionLine</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtInternalConsumptionLine() {
		while (!materialMgmtInternalConsumptionLine.isEmpty()) {
			removeFromMaterialMgmtInternalConsumptionLine(materialMgmtInternalConsumptionLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtInternalConsumptionLineListType#getMaterialMgmtInternalConsumptionLine() <em>materialMgmtInternalConsumptionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtInternalConsumptionLineListType#getMaterialMgmtInternalConsumptionLine() materialMgmtInternalConsumptionLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumptionLine(
			List<MaterialMgmtInternalConsumptionLineType> newMaterialMgmtInternalConsumptionLine) {
		materialMgmtInternalConsumptionLine = newMaterialMgmtInternalConsumptionLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtInternalConsumptionLineListType ";
	}
}
