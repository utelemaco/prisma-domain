package org.prisma.kip.domain.projectInstance;

public class BlockTask {
	
	private Task task;
	
	private String blockType;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getBlockType() {
		return blockType;
	}

	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}
	
}
