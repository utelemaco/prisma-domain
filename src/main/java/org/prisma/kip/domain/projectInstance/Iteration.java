package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Iteration extends WorkGraph {

	private List<IterationInterval> intervals = new ArrayList<>();
	
	private Delivery delivery;
	
	private Date estimatedFinishDate;

	public List<IterationInterval> getIntervals() {
		return intervals;
	}

	public void setIntervals(List<IterationInterval> intervals) {
		this.intervals = intervals;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public Date getEstimatedFinishDate() {
		return estimatedFinishDate;
	}

	public void setEstimatedFinishDate(Date estimatedFinishDate) {
		this.estimatedFinishDate = estimatedFinishDate;
	}
	
}
