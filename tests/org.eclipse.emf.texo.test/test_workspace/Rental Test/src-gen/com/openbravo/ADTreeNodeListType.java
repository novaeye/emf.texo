package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTreeNodeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTreeNodeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADTreeNodeType> aDTreeNode = new ArrayList<ADTreeNodeType>();

	/**
	 * Returns the value of '<em><b>aDTreeNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTreeNode</b></em>' feature
	 * @generated
	 */
	public List<ADTreeNodeType> getADTreeNode() {
		return aDTreeNode;
	}

	/**
	 * Adds to the <em>aDTreeNode</em> feature.
	 * @generated
	 */
	public void addToADTreeNode(ADTreeNodeType aDTreeNodeValue) {
		if (!aDTreeNode.contains(aDTreeNodeValue)) {

			aDTreeNode.add(aDTreeNodeValue);
		}

	}

	/**			
	 * Removes from the <em>aDTreeNode</em> feature.
	 * @generated
	 */
	public void removeFromADTreeNode(ADTreeNodeType aDTreeNodeValue) {
		if (aDTreeNode.contains(aDTreeNodeValue)) {
			aDTreeNode.remove(aDTreeNodeValue);
		}
	}

	/**			
	 * Clears the <em>aDTreeNode</em> feature.
	 * @generated
	 */
	public void clearADTreeNode() {
		while (!aDTreeNode.isEmpty()) {
			removeFromADTreeNode(aDTreeNode.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADTreeNodeListType#getADTreeNode() <em>aDTreeNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeNodeListType#getADTreeNode() aDTreeNode}' feature.
	 * @generated
	 */
	public void setADTreeNode(List<ADTreeNodeType> newADTreeNode) {
		aDTreeNode = newADTreeNode;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADTreeNodeListType ";
	}
}
