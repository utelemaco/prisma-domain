package org.prisma.kip.domain.util;

public class Effort {
	
	private String unit;
	
	private Long estimated;
	
	private Long real;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getEstimated() {
		return estimated;
	}

	public void setEstimated(Long estimated) {
		this.estimated = estimated;
	}

	public Long getReal() {
		return real;
	}

	public void setReal(Long real) {
		this.real = real;
	}
	
}
