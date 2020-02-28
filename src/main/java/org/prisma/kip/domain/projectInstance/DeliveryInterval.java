package org.prisma.kip.domain.projectInstance;

import org.prisma.kip.domain.util.Duration;

public class DeliveryInterval {

    private Delivery previousDelivery;
    
    private Delivery nextDelivery;

    private Duration duration;
	
	private Project project;

	public Delivery getPreviousDelivery() {
		return previousDelivery;
	}

	public void setPreviousDelivery(Delivery previousDelivery) {
		this.previousDelivery = previousDelivery;
	}

	public Delivery getNextDelivery() {
		return nextDelivery;
	}

	public void setNextDelivery(Delivery nextDelivery) {
		this.nextDelivery = nextDelivery;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
