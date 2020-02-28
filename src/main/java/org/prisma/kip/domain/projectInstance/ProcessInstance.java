package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.List;

import org.prisma.kip.domain.processDefinition.ProcessDefinition;

public class ProcessInstance {

	private Long id;
	
	private String businessKey;
	
	private String name;
	
	private String description;
	
	private ProcessDefinition processDefinition;
	
	private Project project;
	
	private List<Iteration> iterations = new ArrayList<>();
	
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

	public ProcessDefinition getProcessDefinition() {
		return processDefinition;
	}

	public void setProcessDefinition(ProcessDefinition processDefinition) {
		this.processDefinition = processDefinition;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Iteration> getIterations() {
		return iterations;
	}

	public void setIterations(List<Iteration> iterations) {
		this.iterations = iterations;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
    
}
