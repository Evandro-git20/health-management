package com.healthmanagement.core.domain;

import java.time.LocalDate;
import java.util.List;

public class MedicalPrescription {
	
	private final Patient patient;
	private final Doctor doctor;
	private final List<Inscription> inscription;
	private final LocalDate dateQuery;
	private final LocalQuery localQuery;

	public MedicalPrescription(final Patient patient, final Doctor doctor, final List<Inscription> inscription, final LocalDate dateQuery,
			final LocalQuery localQuery, final int frequency, final int dose, final String viaUse) {

		this.patient = patient;
		this.doctor = doctor;
		this.inscription = inscription;
		this.dateQuery = dateQuery;
		this.localQuery = localQuery;
	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public List<Inscription> getMedicine() {
		return inscription;
	}

	public LocalDate getDateQuery() {
		return dateQuery;
	}

	public LocalQuery getLocalQuery() {
		return localQuery;
	}
	
}
