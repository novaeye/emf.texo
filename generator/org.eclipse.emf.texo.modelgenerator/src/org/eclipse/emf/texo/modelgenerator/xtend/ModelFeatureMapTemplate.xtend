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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EStructuralFeatureModelGenAnnotation

class ModelFeatureMapTemplate extends BaseTemplate {

	ModelController modelController
	EStructuralFeatureModelGenAnnotation eStructuralFeatureModelGenAnnotation
	EClassModelGenAnnotation eClassAnnotation
	EPackageModelGenAnnotation ePackageAnnotation

	def String generateContent(ModelController theModelController, EStructuralFeatureModelGenAnnotation theEStructuralFeatureModelGenAnnotation) {
		modelController = theModelController
		eStructuralFeatureModelGenAnnotation = theEStructuralFeatureModelGenAnnotation
		eClassAnnotation = eStructuralFeatureModelGenAnnotation.ownerEClassAnnotation as EClassModelGenAnnotation
		ePackageAnnotation = eClassAnnotation.ownerEPackageAnnotation as EPackageModelGenAnnotation
		generateContent()
	}
	
	def String generateContent() 
		'''
/** 
 * The wrapper/adapter for the Feature Group '<em><b>«eClassAnnotation.EClass.name».«eStructuralFeatureModelGenAnnotation.name»</b></em>'.
 * @generated 
*/
public static class «eStructuralFeatureModelGenAnnotation.featureMapSimpleClassName»ModelFeatureMapEntry<E extends «eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName»> extends org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry<«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName»> {

	/**
	 * @generated
	 */
	public org.eclipse.emf.ecore.EStructuralFeature getEStructuralFeature() {
		switch (getTarget().getFeature()) {
		«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
			case TEXT:
				return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(); 
			case CDATA:
				return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA(); 
			case COMMENT:
				return org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment(); 
		«ENDIF»
	«FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
			case «TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»:
				return «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»_«TemplateUtil::toFirstUpper(memberFeatureAnnotation.name)»();
	«ENDFOR»
		}
		throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
	}

	/**
	 * @generated
	 */
	public void setEStructuralFeature(final org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
		«IF TemplateUtil::isMixed(eStructuralFeatureModelGenAnnotation.EStructuralFeature)»
		if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
			getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.TEXT);
			return;
		} else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
			getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.CDATA);
			return;
		} else if (eStructuralFeature == org.eclipse.emf.ecore.xml.type.XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
			getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.COMMENT);
			return;
		} 
		«ENDIF»

		final org.eclipse.emf.ecore.EClass eClass = «ePackageAnnotation.qualifiedClassName».INSTANCE.get«TemplateUtil::toFirstUpper(eClassAnnotation.name)»EClass();
		switch (eClass.getFeatureID(eStructuralFeature)) {	
	«FOR memberFeatureAnnotation : eStructuralFeatureModelGenAnnotation.allMemberFeatureMapFeatures»
			case «ePackageAnnotation.qualifiedClassName».«TemplateUtil::toUpperCase(eClassAnnotation.name)»_«TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»_FEATURE_ID:
				getTarget().setFeature(«eStructuralFeatureModelGenAnnotation.featureMapQualifiedClassName».Feature.«TemplateUtil::toUpperCase(memberFeatureAnnotation.name)»);
				return;		
	«ENDFOR»
		}
		throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
	}

	/**
	 * @generated
	 */
	public Object getValue() {
		return getTarget().getValue(); 
	}

	/**
	 * @generated
	 */
	public void setValue(final Object value) {
		getTarget().setValue(getTarget().getFeature(), value);
	}
}
'''
}