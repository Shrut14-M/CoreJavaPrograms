package com.practice;

public class DisplayFlight {
public static void main(String[] args) {
	Flight f= new Flight("1A23","Indian airline",500, 1500,true,'B', "International" );
	f.Display();
	System.out.println();
    
    f.setTicketRate(350);
    System.out.println("updated ticket rate is  "+f.getTicketRate());

    f.getFlightType();
    System.out.println("The type of this flight is "+f.getFlightType());
 

}


}
