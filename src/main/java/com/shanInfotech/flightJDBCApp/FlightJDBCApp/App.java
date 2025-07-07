package com.shanInfotech.flightJDBCApp.FlightJDBCApp;

public class App {
    public static void main(String[] args) throws Exception {
        FlightDetailsDao fd=new FlightDetailsDao();
      // fd.addFlight(new FlightDetails());
        fd.getFlight();
    }
}
