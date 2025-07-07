package com.shanInfotech.flightJDBCApp.FlightTicketApp;

import java.sql.SQLException;

public interface ITicket {
	 void addTicket(Ticket t) throws BookingException,SQLException, ClassNotFoundException;

}
