package com.healthmanagement.core.domain;

import java.time.LocalDate;
import java.util.List;

public class MedicalPrescription {
	
	private final Patient patient;
	private final Doctor doctor;
	private final List<Recibo> recibos;
	private final LocalDate dateQuery;
	private final LocalQuery localQuery;

	public MedicalPrescription(final Patient patient, final Doctor doctor, final List<Recibo> recibos, final LocalDate dateQuery,
			final LocalQuery localQuery, final int frequency, final int dose, final String viaUse) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.recibos = recibos;
		this.dateQuery = dateQuery;
		this.localQuery = localQuery;
	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public List<Recibo> getMedicine() {
		return recibos;
	}

	public LocalDate getDateQuery() {
		return dateQuery;
	}

	public LocalQuery getLocalQuery() {
		return localQuery;
	}
	
}
