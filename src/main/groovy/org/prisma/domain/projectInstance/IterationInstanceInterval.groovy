package org.prisma.domain.projectInstance

import org.prisma.domain.util.Duration

class IterationInstanceInterval {

    IterationInstance previousIteration
    IterationInstance nextIteration

    Duration duration
}
