package jp.ac.jaist.kslab.sb.marte.merge.generator

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.uml2.uml.Activity
import org.eclipse.uml2.uml.ActivityNode
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.ParameterableElement
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.CallOperationAction

class UMLtoCodeGenerator implements IGenerator {
	Map<String, Activity> activities = new HashMap()
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for(r : input.allContents.toIterable){
			switch(r){
				Activity : activities.put(r.name, r)
			}
		}
		
		for(r : input.allContents.toIterable){
			switch(r){			
				org.eclipse.uml2.uml.Class : {
					fsa.generateFile(r.name.toLowerCase+".h", generateHeader(r))
					fsa.generateFile(r.name.toLowerCase+".c", generateSource(r))}
			}
		}
	}
	
	def generateHeader(Class clazz)'''
	#ifdef __«clazz.name.toUpperCase»_H
	#define __«clazz.name.toUpperCase»_H
	«FOR op : clazz.ownedOperations»
		«generateSignature(op)»
	«ENDFOR»
	#endif
	'''	
	
	def generateSignature(Operation op)'''
		«getTypeName(op.type)» «op.name»(«for(p : op.parameterableElements){generateParam(p)}»);
	'''
	
	def generateParam(ParameterableElement elem)'''
	
	'''
	
	def generateSource(Class clazz)'''
	#include "«clazz.name.toLowerCase».h"
	«FOR inc : clazz.ownedAttributes»
	#include "«inc.name.toLowerCase».h"
	«ENDFOR»
	
	«FOR op : clazz.ownedOperations»
		«generateMethod(op)»
	«ENDFOR»
	'''
	
	def generateMethod(Operation op)'''
	«getTypeName(op.type)» «op.name»(){
		«FOR act : activities.get(op.name).nodes»
			«genBody(act)»
		«ENDFOR»
	}
	'''
	
	def genParam(ParameterableElement p)'''
	'''
	
	def dispatch genBody(ActivityNode a)'''
	'''
	
	def dispatch genBody(CallOperationAction call)'''
		«call.name»();
	'''
	
	def getTypeName(Type t){
		if(t==null || t.name==null){
			return "void"
		}else if(t.name.equals("byte")){
			return "unsigned char"
		}else{
			return t.name
		}
	}
}