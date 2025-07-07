package com.shanInfotech.flightJDBCApp.preparedStatementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;

public class LiquorDao implements ILiquor{
	private Connection con =null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc=new Scanner(System.in);

	@Override
	public void addLiquorDetails() throws Exception {
		con=DBConnect.connect();
		String insertLiq="insert into Liquor  values(?,?,?,?,?,?)";// '?' is known as 'in' parameters
		ps=con.prepareStatement(insertLiq);
		System.out.println("Insert Liquor Data");
		ps.setInt(1,sc.nextInt() );
		sc.nextLine();
		ps.setString(2, sc.nextLine());
		ps.setString(3, sc.nextLine());
		ps.setString(4, sc.nextLine());
		ps.setInt(5, sc.nextInt());
		ps.setDouble(6,100+ Math.random());
		ps.execute();
		System.out.println("Data Inserted Sucessfulyyyyyyyyyyyyyyyyyy!!!!!!!!!!!!!! CheerrSSSSSSSSS");
		
	}

	@Override
	public void getLiquorDetails() {
		
		
	}

}
