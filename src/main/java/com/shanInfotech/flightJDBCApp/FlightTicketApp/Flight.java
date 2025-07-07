package com.shanInfotech.flightJDBCApp.FlightTicketApp;

public class Flight {
	private int flightId;
    private String airline;
    private String source;
    private String destination;
    private String departureTime;
    
    public Flight() {
    	
    }

	
	public Flight(int flightId, String airline, String source, String destination, String departureTime) {
		super();
		this.flightId = flightId;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
	}


	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airline=" + airline + ", source=" + source + ", destination="
				+ destination + ", departureTime=" + departureTime + "]";
	}

}
