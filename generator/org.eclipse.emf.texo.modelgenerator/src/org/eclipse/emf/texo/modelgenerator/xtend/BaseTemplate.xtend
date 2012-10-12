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

import java.util.HashMap
import java.util.Map

abstract class BaseTemplate {
	Map<String, String> files = new HashMap<String, String>()
	
	def addFile(String name, String content) {
		files.put(name, content)
	}
	
	def addFiles(Map<String, String> newFiles) {
		files.putAll(newFiles)
	}
	
	def Map<String, String> getFiles() {
		files
	}
}