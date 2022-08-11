package com.healthmanagement.core.domain;

import java.time.LocalDate;

public class Patient {
	
	private final String name;
	private final LocalDate birthDate;
	private final Address address;

	public Patient(final String name, final LocalDate birthDate, final Address address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Address getAddress() {
		return address;
	}	
	
}
