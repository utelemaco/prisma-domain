package org.prisma.domain.projectInstance

class IterationInstance {

	Long id
	String code
	String name
	String description

	List<TaskInstance> taskInstances = []
    
}
