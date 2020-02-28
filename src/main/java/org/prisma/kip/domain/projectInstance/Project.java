package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.List;

import org.prisma.kip.domain.processDefinition.Artifact;

public class Project extends WorkGraph {

	private List<Iteration> iterations = new ArrayList<>();
	
	private List<IterationInterval> iterationIntervals = new ArrayList<>();
	
	private List<ProcessInstance> processInstances = new ArrayList<>();
	
	private List<Task> tasks = new ArrayList<>();
	
	private List<Delivery> deliveries = new ArrayList<>();
	
	private List<DeliveryInterval> deliveryIntervals = new ArrayList<>();
	
	private List<TaskDependency> taskDependencies = new ArrayList<>();
	
	private List<Artifact> artifacts = new ArrayList<>();

	public List<Iteration> getIterations() {
		return iterations;
	}

	public void setIterations(List<Iteration> iterations) {
		this.iterations = iterations;
	}

	public List<IterationInterval> getIterationIntervals() {
		return iterationIntervals;
	}

	public void setIterationIntervals(List<IterationInterval> iterationIntervals) {
		this.iterationIntervals = iterationIntervals;
	}

	public List<ProcessInstance> getProcessInstances() {
		return processInstances;
	}

	public void setProcessInstances(List<ProcessInstance> processInstances) {
		this.processInstances = processInstances;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Delivery> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(List<Delivery> deliveries) {
		this.deliveries = deliveries;
	}

	public List<DeliveryInterval> getDeliveryIntervals() {
		return deliveryIntervals;
	}

	public void setDeliveryIntervals(List<DeliveryInterval> deliveryIntervals) {
		this.deliveryIntervals = deliveryIntervals;
	}

	public List<TaskDependency> getTaskDependencies() {
		return taskDependencies;
	}

	public void setTaskDependencies(List<TaskDependency> taskDependencies) {
		this.taskDependencies = taskDependencies;
	}

	public List<Artifact> getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(List<Artifact> artifacts) {
		this.artifacts = artifacts;
	}
    
}