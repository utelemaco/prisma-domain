package org.prisma.domain.projectInstance

import org.prisma.domain.processDefinition.TaskDefinition

class TaskInstance {

	Long id
	String code
	String name
	String description
	TaskDefinition taskDefinition
	
    
}
