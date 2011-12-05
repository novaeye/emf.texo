package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtProductionPlanListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtProductionPlanListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<MaterialMgmtProductionPlanType> materialMgmtProductionPlan = new ArrayList<MaterialMgmtProductionPlanType>();

	/**
	 * Returns the value of '<em><b>materialMgmtProductionPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionPlan</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtProductionPlanType> getMaterialMgmtProductionPlan() {
		return materialMgmtProductionPlan;
	}

	/**
	 * Adds to the <em>materialMgmtProductionPlan</em> feature.
	 * @generated
	 */
	public void addToMaterialMgmtProductionPlan(
			MaterialMgmtProductionPlanType materialMgmtProductionPlanValue) {
		if (!materialMgmtProductionPlan
				.contains(materialMgmtProductionPlanValue)) {

			materialMgmtProductionPlan.add(materialMgmtProductionPlanValue);
		}

	}

	/**			
	 * Removes from the <em>materialMgmtProductionPlan</em> feature.
	 * @generated
	 */
	public void removeFromMaterialMgmtProductionPlan(
			MaterialMgmtProductionPlanType materialMgmtProductionPlanValue) {
		if (materialMgmtProductionPlan
				.contains(materialMgmtProductionPlanValue)) {
			materialMgmtProductionPlan.remove(materialMgmtProductionPlanValue);
		}
	}

	/**			
	 * Clears the <em>materialMgmtProductionPlan</em> feature.
	 * @generated
	 */
	public void clearMaterialMgmtProductionPlan() {
		while (!materialMgmtProductionPlan.isEmpty()) {
			removeFromMaterialMgmtProductionPlan(materialMgmtProductionPlan
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanListType#getMaterialMgmtProductionPlan() <em>materialMgmtProductionPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanListType#getMaterialMgmtProductionPlan() materialMgmtProductionPlan}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionPlan(
			List<MaterialMgmtProductionPlanType> newMaterialMgmtProductionPlan) {
		materialMgmtProductionPlan = newMaterialMgmtProductionPlan;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "MaterialMgmtProductionPlanListType ";
	}
}
