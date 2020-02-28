package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.prisma.kip.domain.processDefinition.Activity;
import org.prisma.kip.domain.util.Effort;
import org.prisma.kip.domain.util.Priority;

public class Task {

	private Long id;
	
	private String businessKey;
	
	private String name;
	
	private String description;
	
	private String status;
	
	private Date planDate;
	
	private Date startDate;
	
	private Date completeDate;
	
	private Project project;
	
	private Actor performer;
	
	private ProcessInstance processInstance;
	
	private List<DocumentUsage> documentsUsage = new ArrayList<>();
	
	private List<Activity> implementedActivities = new ArrayList<>();
	
	private Effort effort;
	
	private Priority priority;
	
	private List<BlockTask> blockingTasks = new ArrayList<>();
	
	private List<BlockTask> blockedByTasks = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPlanDate() {
		return planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Actor getPerformer() {
		return performer;
	}

	public void setPerformer(Actor performer) {
		this.performer = performer;
	}

	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public List<DocumentUsage> getDocumentsUsage() {
		return documentsUsage;
	}

	public void setDocumentsUsage(List<DocumentUsage> documentsUsage) {
		this.documentsUsage = documentsUsage;
	}

	public List<Activity> getImplementedActivities() {
		return implementedActivities;
	}

	public void setImplementedActivities(List<Activity> implementedActivities) {
		this.implementedActivities = implementedActivities;
	}

	public Effort getEffort() {
		return effort;
	}

	public void setEffort(Effort effort) {
		this.effort = effort;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public List<BlockTask> getBlockingTasks() {
		return blockingTasks;
	}

	public void setBlockingTasks(List<BlockTask> blockingTasks) {
		this.blockingTasks = blockingTasks;
	}

	public List<BlockTask> getBlockedByTasks() {
		return blockedByTasks;
	}

	public void setBlockedByTasks(List<BlockTask> blockedByTasks) {
		this.blockedByTasks = blockedByTasks;
	}
    
}