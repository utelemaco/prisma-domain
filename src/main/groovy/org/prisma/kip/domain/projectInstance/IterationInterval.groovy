package org.prisma.kip.domain.projectInstance

import org.prisma.kip.domain.util.Duration

class IterationInterval {

    Iteration previousIteration
    Iteration nextIteration

    Duration duration
}
