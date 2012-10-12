/*******************************************************************************
 * Copyright (c) 2012 Springsite BV (http://www.springsite.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Author - Martin Taal
 *******************************************************************************/

package org.eclipse.emf.texo.modelgenerator.xtend

import org.eclipse.emf.texo.generator.ModelController
import org.eclipse.emf.texo.modelgenerator.modelannotations.EClassModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
import org.eclipse.emf.texo.modelgenerator.modelannotations.EReferenceModelGenAnnotation

class ModelObjectTemplate extends BaseTemplate {
	ModelController modelController
	EClassModelGenAnnotation eClassModelGenAnnotation
	EPackageModelGenAnnotation ePackageAnnotation

	def String generateContent(ModelController theModelController, EClassModelGenAnnotation theEClassModelGenAnnotation) {
		modelController = theModelController
		eClassModelGenAnnotation = theEClassModelGenAnnotation
		ePackageAnnotation = theEClassModelGenAnnotation.ownerEPackageAnnotation

		generateContent()
	}
	
	def String generateContent() 
		'''
/** 
 * The adapter/wrapper for the EClass '<em><b>«eClassModelGenAnnotation.name»</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
*/
public static class «eClassModelGenAnnotation.simpleClassName»ModelObject<E extends «eClassModelGenAnnotation.qualifiedClassName»>
«IF eClassModelGenAnnotation.hasSuperEClass»
	«var eSuperClassAnnotation = eClassModelGenAnnotation.superEClass »
	«var eSuperPackageAnnotation = eClassModelGenAnnotation.superEClass.ownerEPackageAnnotation as EPackageModelGenAnnotation»
	«IF eSuperPackageAnnotation.EPackage != eClassModelGenAnnotation.EClass.EPackage»
	 extends «eSuperPackageAnnotation.modelClassesPackagePath».«eSuperPackageAnnotation.simpleModelFactoryClassName».«eSuperClassAnnotation.simpleClassName»ModelObject<E>
	«ELSE»
	 extends «eSuperClassAnnotation.simpleClassName»ModelObject<E>
	«ENDIF»
«ELSE»
extends org.eclipse.emf.texo.model.AbstractModelObject<E>
«ENDIF»
{
	/**
	* @generated
	*/
	«IF eClassModelGenAnnotation.hasSuperEClass»
	@Override
	«ENDIF»
	public org.eclipse.emf.ecore.EClass eClass() {
		return «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassModelGenAnnotation.name)»EClass();
	}

	/**
	* @generated
	*/
	«IF eClassModelGenAnnotation.hasSuperEClass»
	@Override
	«ENDIF»
	public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {
		return «ePackageAnnotation.qualifiedClassName».INSTANCE;
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
		final int featureID = eClass().getFeatureID(eStructuralFeature);
		switch (featureID) {		
		«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				return getTarget().«featureAnnotation.getter»();
		«ENDFOR»
		}
		return super.eGet(eStructuralFeature);
	}
	 	 	
	/**
	 * @generated
	 */
	«IF eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations.exists(e|e.EStructuralFeature.many && e.EStructuralFeature.changeable)»
	@SuppressWarnings("unchecked")
	«ENDIF»	
	@Override
	public void eSet(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
		final int featureID = eClass().getFeatureID(eStructuralFeature);
		switch (featureID) {		
		«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
			«IF featureAnnotation.EStructuralFeature.changeable»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				getTarget().«featureAnnotation.setter»((«featureAnnotation.objectType»)value);
				return;
			«ENDIF»
		«ENDFOR»
		}		
		super.eSet(eStructuralFeature, value);
	}	
	 	 	
	/**
	 * @generated
	 */
	@Override
	public void eAddTo(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
		final int featureID = eClass().getFeatureID(eStructuralFeature);
		switch (featureID) {		
		«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
			«/*
				The check !featureAnnotation.itemType.contains(",") prevents maps to be handled here
			*/»		
			«IF featureAnnotation.EStructuralFeature.changeable && featureAnnotation.many && !featureAnnotation.itemType.contains(",")»		
			«IF featureAnnotation.reference && featureAnnotation.featureMapFeature == null && (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				getTarget().addTo«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»((«featureAnnotation.itemType»)value);
				return;
			«ELSE»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				getTarget().«featureAnnotation.getter»().add((«featureAnnotation.itemType»)value);
				return;
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		}		
		super.eAddTo(eStructuralFeature, value);
	}
	 	 	
	/**
	 * @generated
	 */
	@Override
	public void eRemoveFrom(org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature, Object value) {
		final int featureID = eClass().getFeatureID(eStructuralFeature);
		switch (featureID) {		
		«FOR featureAnnotation : eClassModelGenAnnotation.EStructuralFeatureModelGenAnnotations»
			«/*
				The check !featureAnnotation.itemType.contains(",") prevents maps to be handled here
			*/»
			«IF featureAnnotation.EStructuralFeature.changeable && featureAnnotation.many && !featureAnnotation.itemType.contains(",")»		
			«IF featureAnnotation.reference && featureAnnotation.featureMapFeature == null && (featureAnnotation as EReferenceModelGenAnnotation).generateSafeManyAccess»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				getTarget().removeFrom«TemplateUtil::toFirstUpper(featureAnnotation.validJavaMemberName)»((«featureAnnotation.itemType»)value);
				return;
			«ELSE»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassModelGenAnnotation.name)»_«TemplateUtil::toUpperCase(featureAnnotation.name)»_FEATURE_ID:
				getTarget().«featureAnnotation.getter»().remove(value);
				return;
			«ENDIF»
			«ENDIF»
		«ENDFOR»
		}		
		super.eRemoveFrom(eStructuralFeature, value);
	}
}
'''
}