package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Activity
import org.prisma.kip.domain.util.Effort
import org.prisma.kip.domain.util.Priority

import groovy.transform.ToString

@ToString
class Task {

	Long id
	String businessKey
	String name
	String description
	
	String status
	
	Date planDate
	Date startDate
	Date completeDate
	
	Project project
	Actor performer
	
	ProcessInstance processInstance
	
	List<DocumentUsage> documentsUsage = []
	
	List<Activity> implementedActivities = []
	
	Effort effort
	
	Priority priority
	
	List<BlockTask> blockingTasks = []
	List<BlockTask> blockedByTasks = []
	
    
}