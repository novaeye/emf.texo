package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtShipmentInOutLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtShipmentInOutLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtShipmentInOutLineType> materialMgmtShipmentInOutLine = new ArrayList<MaterialMgmtShipmentInOutLineType>();

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtShipmentInOutLineType> getMaterialMgmtShipmentInOutLine() {
		return materialMgmtShipmentInOutLine;
	}

	/**
	 * Adds to the <em>materialMgmtShipmentInOutLine</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtShipmentInOutLine(
			MaterialMgmtShipmentInOutLineType materialMgmtShipmentInOutLineValue) {
		if (!materialMgmtShipmentInOutLine
				.contains(materialMgmtShipmentInOutLineValue)) {

			materialMgmtShipmentInOutLine
					.add(materialMgmtShipmentInOutLineValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtShipmentInOutLine</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtShipmentInOutLine(
			MaterialMgmtShipmentInOutLineType materialMgmtShipmentInOutLineValue) {
		if (materialMgmtShipmentInOutLine
				.contains(materialMgmtShipmentInOutLineValue)) {
			materialMgmtShipmentInOutLine
					.remove(materialMgmtShipmentInOutLineValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtShipmentInOutLine</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtShipmentInOutLine() {
		while (!materialMgmtShipmentInOutLine.isEmpty()) {
			removeFromMaterialMgmtShipmentInOutLine(materialMgmtShipmentInOutLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutLineListType#getMaterialMgmtShipmentInOutLine() <em>materialMgmtShipmentInOutLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutLineListType#getMaterialMgmtShipmentInOutLine() materialMgmtShipmentInOutLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLine(
			List<MaterialMgmtShipmentInOutLineType> newMaterialMgmtShipmentInOutLine) {
		materialMgmtShipmentInOutLine = newMaterialMgmtShipmentInOutLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtShipmentInOutLineListType ";
	}
}
