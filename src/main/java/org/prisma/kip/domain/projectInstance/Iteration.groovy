package org.prisma.kip.domain.projectInstance

import java.util.Date

class Iteration extends WorkGraph {

	List<IterationInterval> intervals = []
	
	Delivery delivery
	
	Date estimatedFinishDate
    
}
