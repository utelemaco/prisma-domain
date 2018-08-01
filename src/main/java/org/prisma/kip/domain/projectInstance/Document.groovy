package org.prisma.kip.domain.projectInstance

import java.util.List

import org.prisma.kip.domain.processDefinition.Artifact

class Document {
	
	Long id
	String businessKey
	String name
	String description
	
	List<Artifact> implementedArtifacts = []
	
	List<DocumentUsage> documentsUsage = []

}
