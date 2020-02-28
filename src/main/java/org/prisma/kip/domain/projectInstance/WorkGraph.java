package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkGraph {
	
	private Long id;
	
	private String businessKey;
	
	private String name;
	
	private String description;
	
	private String status;

	private Date startDate;
	
	private Date finishDate;
	
	private WorkGraph superWorkGraph;
	
	private List<WorkGraph> subWorkGraphs = new ArrayList<>();
	
	private List<Actor> actors = new ArrayList<>();
	
	private List<ProcessInstance> processInstances = new ArrayList<>();
	
	private List<Document> documents = new ArrayList<>();
	
	private List<Task> tasks = new ArrayList<>();

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public WorkGraph getSuperWorkGraph() {
		return superWorkGraph;
	}

	public void setSuperWorkGraph(WorkGraph superWorkGraph) {
		this.superWorkGraph = superWorkGraph;
	}

	public List<WorkGraph> getSubWorkGraphs() {
		return subWorkGraphs;
	}

	public void setSubWorkGraphs(List<WorkGraph> subWorkGraphs) {
		this.subWorkGraphs = subWorkGraphs;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<ProcessInstance> getProcessInstances() {
		return processInstances;
	}

	public void setProcessInstances(List<ProcessInstance> processInstances) {
		this.processInstances = processInstances;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
}