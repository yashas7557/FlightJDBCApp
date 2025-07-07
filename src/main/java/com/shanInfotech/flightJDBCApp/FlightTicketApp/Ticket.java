package com.shanInfotech.flightJDBCApp.FlightTicketApp;

public class Ticket {
	 private int ticketId;
	    private String passengerName;
	    private String seatNumber;
	    private double price;
	    private int flightId;
	    private String bookingTime;
	    
	    public Ticket() {
	    	
	    }

		
		public Ticket(int ticketId, String passengerName, String seatNumber, double price, int flightId,
				String bookingTime) {
			super();
			this.ticketId = ticketId;
			this.passengerName = passengerName;
			this.seatNumber = seatNumber;
			this.price = price;
			this.flightId = flightId;
			this.bookingTime = bookingTime;
		}

		public int getTicketId() {
			return ticketId;
		}

		public void setTicketId(int ticketId) {
			this.ticketId = ticketId;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public void setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getFlightId() {
			return flightId;
		}

		public void setFlightId(int flightId) {
			this.flightId = flightId;
		}

		public String getBookingTime() {
			return bookingTime;
		}

		public void setBookingTime(String bookingTime) {
			this.bookingTime = bookingTime;
		}

		@Override
		public String toString() {
			return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", seatNumber=" + seatNumber
					+ ", price=" + price + ", flightId=" + flightId + ", bookingTime=" + bookingTime + "]";
		}

		
		
}
