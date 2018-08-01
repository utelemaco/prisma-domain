package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.ProcessDefinition

class ProcessInstance {

	Long id
	String businessKey
	String name
	String description

	ProcessDefinition processDefinition
	
	Project project
	List<Iteration> iterations = []
	List<Task> tasks = []
	
	
    
}
