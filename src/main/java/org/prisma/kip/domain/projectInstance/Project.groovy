package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Artifact

class Project extends WorkGraph {

	List<Iteration> iterations = []
	List<IterationInterval> iterationIntervals = []
	
	List<ProcessInstance> processInstances = []
	List<Task> tasks = []
	
	List<Delivery> deliveries = []
	List<DeliveryInterval> deliveryIntervals = []
	
	List<TaskDependency> taskDependencies = []
	
	List<Artifact> artifacts = []
    
}