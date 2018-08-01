package org.prisma.kip.domain.projectInstance

class DocumentUsage {
	
	Long id
	
	Document document
	Task task
	UsageEnum usage
	Date date

}
