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

class UMLtoJavaCodeGenerator implements IGenerator {
	Map<String, Activity> activities = new HashMap()
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for(r : input.allContents.toIterable){
			switch(r){
				Activity : activities.put(r.name, r)
			}
		}
		
		for(r : input.allContents.toIterable){
			switch(r){			
				org.eclipse.uml2.uml.Class : fsa.generateFile(r.name+".java", generateClass(r))
			}
		}
	}
	
	
	def generateClass(org.eclipse.uml2.uml.Class clazz)'''
	public class «clazz.name.toFirstUpper» {
		«FOR op : clazz.ownedOperations»
			«generateMethod(op)»
		«ENDFOR»
	}
	'''
	
	def generateMethod(Operation op)'''
	«op.type» «op.name»(){
		«FOR act : activities.get(op.name).nodes»
			«genBody(act)»
		«ENDFOR»
	}
	'''
	
	def genParam(ParameterableElement p)'''
	'''
	
	def genBody(ActivityNode a)'''
		«a.name»
	'''
}
