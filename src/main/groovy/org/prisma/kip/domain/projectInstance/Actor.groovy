package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Role

class Actor {
	
	Long id
	String businessKey
	String name
	String description
	
	Project project
	List<Iteration> iterations = []
	List<Role> implementedRoles = []
	

}
