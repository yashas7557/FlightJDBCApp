package com.shanInfotech.flightJDBCApp.FlightTicketApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;


public class TicketDao  implements ITicket{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;


	@Override
	public void addTicket(Ticket t) throws BookingException, SQLException, ClassNotFoundException {
		try {
		
			con=DBConnect.connect();
			con.setAutoCommit(false);
		
		String check = "SELECT * FROM tickets WHERE flight_id = ? AND seat_number = ?";
        ps = con.prepareStatement(check);
        ps.setInt(1, t.getFlightId());
        ps.setString(2, t.getSeatNumber());
        rs = ps.executeQuery();

        if (rs.next()) {
        	if(t.getFlightId()>0  && t.getSeatNumber()!=null) {
        		
        	
            throw new BookingException("Seat already booked for this flight.");
        }
		}
        
        String insert = "INSERT INTO tickets  VALUES (?, ?, ?, ?, ?,?)";
        ps = con.prepareStatement(insert);
        ps.setInt(1, t.getTicketId());
        
        ps.setString(2, t.getPassengerName());
        ps.setString(3, t.getSeatNumber());
        ps.setDouble(4, t.getPrice());
        ps.setInt(5, t.getFlightId());
        ps.setString(6, t.getBookingTime());
        ps.executeUpdate();

        con.commit();
        System.out.println("Ticket booked successfully.");

    } catch (BookingException e) {
        throw e;
        
	}
	}
}
