package com.constructor;

public class Movie {
public Movie(String movieName, String Genre, String Rating) {
	System.out.println(movieName);
	System.out.println(Genre);
	System.out.println(Rating);

}
public static void main(String[] args) {
	Movie m=new Movie("Tuz me rab Dikhta hai", "Romantic", "5 star");
}}
