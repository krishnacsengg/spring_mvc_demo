package com.luv2code.springdemo.controller;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption;
	
	
	public Student(){
		countryOption =new LinkedHashMap<>();
		countryOption.put("Br", "Brazil");
		countryOption.put("En", "England");
		countryOption.put("In", "India");
		countryOption.put("US", "United States of America");
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}
	
	

	
}
