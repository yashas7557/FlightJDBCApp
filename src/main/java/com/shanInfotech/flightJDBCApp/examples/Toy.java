package com.shanInfotech.flightJDBCApp.examples;

public class Toy {
	private int toyId;
	private String toyName;
	private String countryOrigin;
	private double toyPrice;
	
	
	public Toy(){
	
	}


	public Toy(int toyId, String toyName, String countryOrigin, double toyPrice) {
		super();
		this.toyId = toyId;
		this.toyName = toyName;
		this.countryOrigin = countryOrigin;
		this.toyPrice = toyPrice;
	}


	public int getToyId() {
		return toyId;
	}


	public void setToyId(int toyId) {
		this.toyId = toyId;
	}


	public String getToyName() {
		return toyName;
	}


	public void setToyName(String toyName) {
		this.toyName = toyName;
	}


	public String getCountryOrigin() {
		return countryOrigin;
	}


	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}


	public double getPrice() {
		return toyPrice;
	}


	public void setPrice(double toyPrice) {
		this.toyPrice = toyPrice;
	}


	@Override
	public String toString() {
		return "Toy [toyId=" + toyId + ", toyName=" + toyName + ", countryOrigin=" + countryOrigin + ", toyPrice=" + toyPrice
				+ "]";
	}
	
	

}
