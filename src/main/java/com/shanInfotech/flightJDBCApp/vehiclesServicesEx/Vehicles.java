package com.shanInfotech.flightJDBCApp.vehiclesServicesEx;

public class Vehicles {
	private int vehicle_id;
	private String ownwerName;
	private String model;
	private String registrationNumber;
	
	public Vehicles() {
		
		
	}

	public Vehicles(int vehicle_id, String ownwerName, String model, String registrationNumber) {
		super();
		this.vehicle_id = vehicle_id;
		this.ownwerName = ownwerName;
		this.model = model;
		this.registrationNumber = registrationNumber;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getOwnwerName() {
		return ownwerName;
	}

	public void setOwnwerName(String ownwerName) {
		this.ownwerName = ownwerName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicle_id=" + vehicle_id + ", ownwerName=" + ownwerName + ", model=" + model
				+ ", registrationNumber=" + registrationNumber + "]";
	}

}
