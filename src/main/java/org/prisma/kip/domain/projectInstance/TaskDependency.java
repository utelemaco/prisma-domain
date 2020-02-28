package org.prisma.kip.domain.projectInstance;

public class TaskDependency {

	private Task blockingTask;
	
	private Task blockedTask;
	
	private String dependencyType;

	public Task getBlockingTask() {
		return blockingTask;
	}

	public void setBlockingTask(Task blockingTask) {
		this.blockingTask = blockingTask;
	}

	public Task getBlockedTask() {
		return blockedTask;
	}

	public void setBlockedTask(Task blockedTask) {
		this.blockedTask = blockedTask;
	}

	public String getDependencyType() {
		return dependencyType;
	}

	public void setDependencyType(String dependencyType) {
		this.dependencyType = dependencyType;
	}
	
}