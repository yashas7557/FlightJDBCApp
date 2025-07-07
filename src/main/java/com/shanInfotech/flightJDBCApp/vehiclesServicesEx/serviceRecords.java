package com.shanInfotech.flightJDBCApp.vehiclesServicesEx;

public class serviceRecords {
	private int record_id;
	private  Vehicles vehicle_id;
	private String service_date;
	private String description;
	private double cost;
	
	public serviceRecords() {
		
		
	}

	public serviceRecords(int record_id, Vehicles vehicle_id, String service_date, String description, double cost) {
		super();
		this.record_id = record_id;
		this.vehicle_id = vehicle_id;
		this.service_date = service_date;
		this.description = description;
		this.cost = cost;
	}

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public Vehicles getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Vehicles vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getService_date() {
		return service_date;
	}

	public void setService_date(String service_date) {
		this.service_date = service_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "serviceRecords [record_id=" + record_id + ", vehicle_id=" + vehicle_id + ", service_date="
				+ service_date + ", description=" + description + ", cost=" + cost + "]";
	}

}
