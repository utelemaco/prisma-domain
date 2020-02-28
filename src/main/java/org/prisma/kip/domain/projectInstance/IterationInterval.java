package org.prisma.kip.domain.projectInstance;

import org.prisma.kip.domain.util.Duration;

public class IterationInterval {

    private Iteration previousIteration;
    
    private Iteration nextIteration;

    private Duration duration;

	public Iteration getPreviousIteration() {
		return previousIteration;
	}

	public void setPreviousIteration(Iteration previousIteration) {
		this.previousIteration = previousIteration;
	}

	public Iteration getNextIteration() {
		return nextIteration;
	}

	public void setNextIteration(Iteration nextIteration) {
		this.nextIteration = nextIteration;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}
    
}
