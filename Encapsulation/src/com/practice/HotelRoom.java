package com.practice;

public class HotelRoom {
	
		 int roomNumber;
		 String roomType;
		 float rentPerNight;
		 boolean isACAvailable;
		 char roomGrade;
		 double discount;

		public HotelRoom(int roomNumber,String roomType, float rentPerNight, boolean isACAvailable, char roomGrade,double discount) {
			this.roomNumber=roomNumber;
			this.roomType=roomType;
			this.rentPerNight=rentPerNight;
			this.isACAvailable=isACAvailable;
			this.roomGrade=roomGrade;
			this.discount=discount;
		}

		

		public int getRoomNumber() {
			return roomNumber;
		}



		public String getRoomType() {
			return roomType;
		}



		public float getRentPerNight() {
			return rentPerNight;
		}



		public boolean isACAvailable() {
			return isACAvailable;
		}



		public char getRoomGrade() {
			return roomGrade;
		}



		public double getDiscount() {
			return discount;
		}



		public void myDiscount(double disc) {
			
			double finalRent= rentPerNight*(1-disc/100);
			System.out.println("The final rent on this Room is "+finalRent);
		}


		}


