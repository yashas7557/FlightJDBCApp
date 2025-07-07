package com.shanInfotech.flightJDBCApp.FlightTicketApp;

import java.sql.SQLException;

public interface IFlight {
	public void addFlightDetails(Flight f) throws  BookingException ,SQLException, ClassNotFoundException;  

}
