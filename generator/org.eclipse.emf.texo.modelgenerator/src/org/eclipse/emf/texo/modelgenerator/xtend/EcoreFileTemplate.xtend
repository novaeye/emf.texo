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
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation
 
class EcoreFileTemplate extends BaseTemplate {

	def void generate(ModelController theModelController, EPackageModelGenAnnotation ePackageModelGenAnnotation) {
		var fileName = TemplateUtil::ecoreFileName(ePackageModelGenAnnotation)
		var content = ePackageModelGenAnnotation.ecoreFileContent
		
		addFile(fileName, content)		
	}
}
