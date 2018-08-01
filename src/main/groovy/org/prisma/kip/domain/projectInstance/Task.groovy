package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.processDefinition.Activity

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
	
	List<DocumentUsage> documentsUsage = []
	
	List<Activity> implementedActivities = []
	
	
    
}