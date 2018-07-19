package org.prisma.domain.projectInstance

class ProcessInstance {

	Long id
	String code
	String name
	String description

	List<TaskInstance> taskInstances = []
    
}
