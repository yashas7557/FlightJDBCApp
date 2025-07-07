package com.shanInfotech.flightJDBCApp.FlightJDBCApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection con=null;
    public static Connection connect () throws ClassNotFoundException,SQLException {
    	
    	Class.forName("com.mysql.cj.jdbc.Driver"); // Type 4 Driver
    	
    	//Connection interface used for connecting to database
    	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcEx","root","root");
    	
        return con;
}
	
	
}