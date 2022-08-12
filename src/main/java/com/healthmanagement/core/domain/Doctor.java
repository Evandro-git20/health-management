package com.healthmanagement.core.domain;

public class Doctor {
	private final String name;
	private final String crm;
	
	public Doctor(String name, String crm) {

		this.name = name;
		this.crm = crm;
	}

	public String getName() {
		return name;
	}

	public String getCrm() {
		return crm;
	}
	
}
