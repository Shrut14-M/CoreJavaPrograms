package com.practice;

public class Room {
		public static void main(String[] args) {
			
			HotelRoom h= new HotelRoom(124, "Double suit",2000.0f,true,'b',50);
//			h.setRoomNumber(123);
			System.out.println("The room number is "+h.getRoomNumber());
			
			//h.setRoomType("Double Suit");
			System.out.println("The type of room is "+h.getRoomType());
			
			//h.setRoomGrade('C');
			System.out.println("The Grade of this room based on the quality is " +h.getRoomGrade());
			
//			h.setRentPerNight(2000);
			System.out.println("Rent of this room per night is "+h.getRentPerNight()+ "rs");
			
//			h.setACAvailable(true);
			System.out.println("Availability of the AC in this room "+h.isACAvailable()); //isACAvailable is the getter method for boolean type.
			
//			h.setDiscount(15);
			System.out.println("Discount applied on this room is "+h.getDiscount());
			double disc= h.getDiscount();
			
			h.myDiscount(disc);
			
			System.out.println();
			
			HotelRoom h1= new HotelRoom(312, "Single",1000,false,'A',50);
			System.out.println("The room number is "+h1.getRoomNumber());
			
			System.out.println("The type of room is "+h1.getRoomType());
			
			System.out.println("The Grade of this room based on the quality is " +h1.getRoomGrade());
			
			System.out.println("Rent of this room per night is "+h1.getRentPerNight()+ "rs");
			
			System.out.println("Availability of the AC in this room "+h1.isACAvailable()); //isACAvailable is the getter method for boolean type.
			
			System.out.println("Discount applied on this room is "+h1.getDiscount());
			double disc1= h.getDiscount();
			
			h1.myDiscount(disc1);
			
		}
			
		}
