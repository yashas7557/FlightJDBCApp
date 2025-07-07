package com.shanInfotech.flightJDBCApp.vehiclesServicesEx;

import java.util.Scanner;

public class VehMain {
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("ENTER VEHICLES DETAILS: VehicleID ,OwnerName, Model , RegistrationNumber");
		VehiclesDao vd= new VehiclesDao();
		Vehicles v=new Vehicles(sc.nextInt(), sc.next(), sc.next(), sc.next());
		vd.addVehicles(v);
		
		System.out.println("ENTER SERVICE RECORDS DETAILS: RecordID, ServiceDate ,Description, Cost");
		ServiceRecordsDao ad= new ServiceRecordsDao();
		serviceRecords sr=new serviceRecords(sc.nextInt(),v,sc.next(), sc.next(),sc.nextDouble());
		ad.addServiceRecords(sr);
		
		
		
	}

}
