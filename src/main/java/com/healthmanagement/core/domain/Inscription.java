package com.healthmanagement.core.domain;

public class Inscription {
	
	private final String name;
	private final int frequency;
	private final int period;
	private final int dose;
	private final String viaUse;

	public Inscription(final String name, final int frequency, final int period, final int dose, final String viaUse) {

		this.name = name;
		this.frequency = frequency;
		this.period = period;
		this.dose = dose;
		this.viaUse = viaUse;
	}

	public String getName() {
		return name;
	}

	public int getFrequency() {
		return frequency;
	}

	public int getPeriod() {
		return period;
	}

	public int getDose() {
		return dose;
	}

	public String getViaUse() {
		return viaUse;
	}	
	
}
