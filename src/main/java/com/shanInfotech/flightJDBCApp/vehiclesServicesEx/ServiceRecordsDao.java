package com.shanInfotech.flightJDBCApp.vehiclesServicesEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;

public class ServiceRecordsDao implements ISeviceRecords{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;


	@Override
	public void addServiceRecords(serviceRecords r) throws Exception {
			con=DBConnect.connect();
			con.setAutoCommit(false);
			String insertser="insert into service_records values(?,?,?,?,?)";
			ps=con.prepareStatement(insertser);
			
			ps.setInt(1,r.getRecord_id() );
			ps.setInt(2, r.getVehicle_id().getVehicle_id());
			ps.setString(3, r.getService_date());
			ps.setString(4, r.getDescription());
			ps.setDouble(5, r.getCost());
			ps.executeUpdate();
			con.commit();
			
			System.out.println(" Service Records Data Inserted Succesfully");
	}

	@Override
	public void getServiceRecords() {
		// TODO Auto-generated method stub
		
	}
}
	