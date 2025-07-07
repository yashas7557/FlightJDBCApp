package com.shanInfotech.flightJDBCApp.vehiclesServicesEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;

public class VehiclesDao implements IVehicles{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc=new Scanner(System.in);

	@Override
	public void addVehicles(Vehicles v) throws Exception {
		con=DBConnect.connect();
		con.setAutoCommit(false);
		String insertveh="insert into vehicles values(?,?,?,?)";
		ps=con.prepareStatement(insertveh);
		
		ps.setInt(1, v.getVehicle_id());
		ps.setString(2, v.getOwnwerName());
		ps.setString(3, v.getModel());
		ps.setString(4, v.getRegistrationNumber());
		ps.executeUpdate();
		con.commit();
		System.out.println("Data Inserted Sucessfuly");
		
		
	}

	@Override
	public void getVehicles() {
		
		
	}

}
