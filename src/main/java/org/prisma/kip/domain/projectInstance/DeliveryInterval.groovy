package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.util.Duration

class DeliveryInterval {

    Delivery previousDelivery
    Delivery nextDelivery

    Duration duration
	
	Project project
}
