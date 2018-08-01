package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Activity

class TaskDependency {

	Task blockingTask
	Task blockedTask
	
	String dependencyType
	
	
    
}