package org.prisma.domain.projectInstance

import org.prisma.domain.util.Duration

class DeliveryInstanceInterval {

    DeliveryInstance previousDelivery
    DeliveryInstance nextDelivery

    Duration duration
}
