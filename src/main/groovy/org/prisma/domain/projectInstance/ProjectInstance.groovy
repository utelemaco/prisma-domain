package org.prisma.domain.projectInstance

class ProjectInstance {

	Long id
	String code
	String name
	String description

	List<IterationInstance> iterationInstances = []
	List<ProcessInstance> processInstances = []
	List<TaskInstance> taskInstances = []
    
}
