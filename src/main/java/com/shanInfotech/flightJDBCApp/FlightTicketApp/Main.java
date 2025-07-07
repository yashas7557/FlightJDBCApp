package com.shanInfotech.flightJDBCApp.FlightTicketApp;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws SQLException,BookingException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		FlightDao ff=new FlightDao();
		System.out.println("enter the details of flight : FlightID , Airline, Source, Destination, DepartureTime");
		Flight f=new Flight(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
		ff.addFlightDetails(f);
		
		TicketDao  tt=new TicketDao();
		System.out.println("enter the details of ticket : TicketID, PassengerName, SeatNumber, Price, FlightID, BookingTime");
		Ticket t=new Ticket(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextInt(),sc.next());
		tt.addTicket(t);
		

}
}
