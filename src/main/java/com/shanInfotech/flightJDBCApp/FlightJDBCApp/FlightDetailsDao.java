package com.shanInfotech.flightJDBCApp.FlightJDBCApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FlightDetailsDao implements IFlightDetails{
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	

	@Override
	public void addFlight(FlightDetails fd) throws SQLException, ClassNotFoundException {
		con=DBConnect.connect();
		con.setAutoCommit(false);
		st=con.createStatement();
		System.out.println("Flight Details: ID,FLightCompany,TravelData,Source,Destination");
		fd.setFlightId(sc.nextInt());
		sc.nextLine();
		fd.setFlightCompany(sc.nextLine());
		fd.setTravelDate(sc.nextLine());
		fd.setSource(sc.nextLine());
		fd.setDestination(sc.nextLine());
		String insertFlights="insert into flightdetails values("+fd.getFlightId()+",'"+fd.getFlightCompany()+"','"
				+fd.getTravelDate()+"','"+fd.getSource()+"','"+fd.getDestination()+"')";
		st.executeUpdate(insertFlights);
		con.commit();
		System.out.println("Data Inserted");
		con.close();
	}

	@Override
	public void updateFlight() {
		
		
	}

	@Override
	public void getFlight() throws Exception {
		con=DBConnect.connect();
		con.setAutoCommit(false);
		st=con.createStatement();
		String queryResult="select * from flightdetails";
		rs=st.executeQuery(queryResult);
		while(rs.next()) {
			System.out.print("Flight Id:"+rs.getInt(1));
		}
		con.commit();
		con.close();
	}

	@Override
	public void deleteFlight() {
		// TODO Auto-generated method stub
		
	}
	

}
