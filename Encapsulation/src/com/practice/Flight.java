package com.practice;

public class Flight {
String flightNumber;
String airLine;
int capacity;
int ticketRate;
boolean isDomestic;
char flightClass;// 'E' for economy, 'B' for business.
String flightType;

 public Flight(String flightNumber, String airLine, int capacity, int ticketRate, boolean isDomestic,char flightClass, String flightType) {
	 this.flightNumber=flightNumber;
	 this.airLine=airLine;
	 this.capacity=capacity;
	 this.ticketRate=ticketRate;
	 this.isDomestic=isDomestic;
	 this.flightClass=flightClass;
	 this.flightType=flightType;
 }
 
 public void Display() {
	 System.out.println("The flight number is "+this.flightNumber);
	 System.out.println("The Airline for this flight is "+this.airLine);
	 System.out.println("The ticket rate is "+this.ticketRate);
	 System.out.println("The capacity of passengers in this flight is "+this.capacity);
	 System.out.println("The flight is Domestic "+this.isDomestic);
	 System.out.println("The class of this ticket is "+this.flightClass);
//	 System.out.println("The type of the flight is "+this.flightType);

}





//@Override
//public String toString() {
//	return "Flight [flightNumber=" + flightNumber + ", airLine=" + airLine + ", capacity=" + capacity + ", ticketRate="
//			+ ticketRate + ", isDomestic=" + isDomestic + ", flightClass=" + flightClass + "]";
//}





public float getTicketRate() {
	return ticketRate;
}
public void  setTicketRate(int ticketRate) {
	this.ticketRate=ticketRate;

}
public String getFlightType() {
	return flightType;
}
public void  setTicketRate(String flightType) {
	this.flightType=flightType;

}



 

}
