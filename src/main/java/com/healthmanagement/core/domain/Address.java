package com.healthmanagement.core.domain;

public class Address {
	private final String road;
	private final String number;
	private final String postalCode;
	private final String district;
	private final String city;
	private final String state;
	
	public Address(final String road, final String number, final String postalCode, final String district, final String city, final String state) {

		this.road = road;
		this.number = number;
		this.postalCode = postalCode;
		this.district = district;
		this.city = city;
		this.state = state;
	}

	public String getRoad() {
		return road;
	}

	public String getNumber() {
		return number;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	
}
