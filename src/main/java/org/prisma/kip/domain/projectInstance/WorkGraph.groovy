package org.prisma.kip.domain.projectInstance

import java.util.List

class WorkGraph {
	
	Long id
	String businessKey
	String name
	String description
	
	String status

	Date startDate
	Date finishDate
	
	WorkGraph superWorkGraph
	List<WorkGraph> subWorkGraphs = []
	
	List<Actor> actors = []
	List<ProcessInstance> processInstances = []
	List<Document> documents = []
	List<Task> tasks = []

}