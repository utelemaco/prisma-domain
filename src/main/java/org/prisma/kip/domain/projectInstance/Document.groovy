package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Artifact

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(includes=['businessKey'])
class Document {
	
	Long id
	String businessKey
	String name
	String description
	
	List<Artifact> implementedArtifacts = []
	
	List<DocumentUsage> documentsUsage = []

}
