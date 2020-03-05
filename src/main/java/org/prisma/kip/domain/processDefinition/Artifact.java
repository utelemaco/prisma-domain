package org.prisma.kip.domain.processDefinition;

import org.prisma.kip.domain.projectInstance.Document;

import java.util.ArrayList;
import java.util.List;

public class Artifact {

	private Long id;
	
	private String code;
	
	private String name;
	
	private String description;

	private List<Document> instancedDocuments = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public List<Document> getInstancedDocuments() {
		return instancedDocuments;
	}

	public void setInstancedDocuments(List<Document> instancedDocuments) {
		this.instancedDocuments = instancedDocuments;
	}
}
