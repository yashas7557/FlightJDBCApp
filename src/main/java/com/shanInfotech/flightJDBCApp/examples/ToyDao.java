package com.shanInfotech.flightJDBCApp.examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.shanInfotech.flightJDBCApp.FlightJDBCApp.DBConnect;

public class ToyDao implements IToy{
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	@Override
	public void addToy(Toy t) throws Exception {
		con=DBConnect.connect();
		st=con.createStatement();
		st.addBatch("insert into toy values(101,'spiderMan','India',7897.00)");
		st.addBatch("insert into toy values(102,'elephant','China',7397.00)");
		st.addBatch("insert into toy values(103,'laughing buddha','China',6897.00)");
		st.addBatch("insert into toy values(104,'poojari','India',4320.00)");
		st.addBatch("insert into toy values(105,'hulk','USA',9897.00)");
		
		int i[]=st.executeBatch();// the return type is int array
		System.out.println("Data Inserted");
	}

	@Override
	public void updateToy() {
		
		
	}

	@Override
	public void getToy() throws Exception {
		con=DBConnect.connect();
		st=con.createStatement();
		String queryRs="select toyId,toyName,(toyPrice - (toyPrice*.15)) as newToyPrice from toy";
		rs=st.executeQuery(queryRs);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+":"+rs.getDouble(3));
			//System.out.printf("/n %d,%s,%.1f",rs.getInt(1),rs.getString(2),rs.getDouble(4));
		}
		
	}

}
