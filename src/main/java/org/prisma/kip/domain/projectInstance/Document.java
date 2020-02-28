package org.prisma.kip.domain.projectInstance;

import java.util.ArrayList;
import java.util.List;

import org.prisma.kip.domain.processDefinition.Artifact;

public class Document {
	
	private Long id;
	
	private String businessKey;
	
	private String name;
	
	private String description;
	
	private List<Artifact> implementedArtifacts = new ArrayList<>();
	
	private List<DocumentUsage> documentsUsage = new ArrayList<>();

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

	public List<Artifact> getImplementedArtifacts() {
		return implementedArtifacts;
	}

	public void setImplementedArtifacts(List<Artifact> implementedArtifacts) {
		this.implementedArtifacts = implementedArtifacts;
	}

	public List<DocumentUsage> getDocumentsUsage() {
		return documentsUsage;
	}

	public void setDocumentsUsage(List<DocumentUsage> documentsUsage) {
		this.documentsUsage = documentsUsage;
	}
	
}
