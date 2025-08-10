package com.variableCalling;

public class FlightDetails {
	public static void main(String[] args) {
		Flight f = new Flight();
		System.out.println(f.flightNumber = 1001);
		System.out.println(f.airline = "indian Airline");
		System.out.println(f.departureCity = "banglore");

		System.out.println(f.destinationCity = "Mumbai");

		System.out.println(f.departureTime = "10.45PM");

		System.out.println(f.ticketPrice = 5000);

		System.out.println("            ");

		System.out.println(f.flightNumber = 3406);
		System.out.println(f.airline = "Norway Airline");
		System.out.println(f.departureCity = "Pune");

		System.out.println(f.destinationCity = "Nanded");

		System.out.println(f.departureTime = "9.00AM");

		System.out.println(f.ticketPrice = 4500);

	}
}
