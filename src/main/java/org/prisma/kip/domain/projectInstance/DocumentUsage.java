package org.prisma.kip.domain.projectInstance;

import java.util.Date;

public class DocumentUsage {
	
	private Long id;
	
	private Document document;
	
	private Task task;
	
	private UsageEnum usage;
	
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public UsageEnum getUsage() {
		return usage;
	}

	public void setUsage(UsageEnum usage) {
		this.usage = usage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
