package org.prisma.kip.domain.projectInstance

class Project extends WorkGraph {

	List<Iteration> iterations = []
	List<IterationInterval> iterationIntervals = []
	
	List<ProcessInstance> processInstances = []
	List<Task> tasks = []
	
	List<Delivery> deliveries = []
	List<DeliveryInterval> deliveryIntervals = []
    
}