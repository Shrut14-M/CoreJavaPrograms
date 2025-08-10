package com.variableCalling;

public class SportsDetails {
	public static void main(String[] args) {
		Sports s = new Sports();
		System.out.println(s.sportName = "Cricket");
		System.out.println(s.teamName = "RCB");

		System.out.println(s.sportType = "Outdoor Game");

		System.out.println(s.coachName = "Muthhu swami");

		System.out.println(s.numPlayers = 12);

		System.out.println(s.homeCity = "Banglore");
		System.out.println(s.championshipsWon = 2);

		System.out.println("-------------");

		System.out.println(s.sportName = "Table Tennis");
		System.out.println(s.teamName = "ProPlayers");

		System.out.println(s.sportType = "Indoor Game");

		System.out.println(s.coachName = "Deshmukh S.");

		System.out.println(s.numPlayers = 4);

		System.out.println(s.homeCity = "Nanded");
		System.out.println(s.championshipsWon = 2);

	}
}
