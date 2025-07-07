package com.shanInfotech.flightJDBCApp.FlightTicketApp;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;


public class FlightDao implements IFlight{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;

	@Override
	public void addFlightDetails(Flight f) throws BookingException, SQLException, ClassNotFoundException {
		con=DBConnect.connect();
		con.setAutoCommit(false);
		String insert="insert into flights value(?,?,?,?,?)";
		ps=con.prepareStatement(insert);
		ps.setInt(1, f.getFlightId());
		ps.setString(2, f.getAirline());
		ps.setString(3, f.getSource());
		ps.setString(4, f.getDestination());
		ps.setString(5, f.getDepartureTime());
		ps.executeUpdate();
		con.commit();
		System.out.println(" flight data inserted successfully");
		
	}
	

}
