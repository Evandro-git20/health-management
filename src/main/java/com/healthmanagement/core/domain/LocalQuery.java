package com.healthmanagement.core.domain;

public class LocalQuery {

	private final String name;
	private final String cnpj;
	private final Address address;
	
	public LocalQuery(String name, String cnpj, Address address) {

		this.name = name;
		this.cnpj = cnpj;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Address getAddress() {
		return address;
	}

}
