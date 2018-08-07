package org.prisma.kip.domain.processDefinition

import org.prisma.kip.domain.projectInstance.Document

class Artifact {

	Long id
	String code
	String name
	String description
	
	List<Document> instancedDocuments = []
    
}
