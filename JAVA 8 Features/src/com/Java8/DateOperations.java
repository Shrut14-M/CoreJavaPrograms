package com.Java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateOperations {
	public static void main(String[] args) {
		/*
		 * Factory method which is a static method that returns object of that class
		 * instead of using new keyword. It creates a LocalTime object internally, and
		 * returns it.
		 * 
		 */
		LocalDate obj = LocalDate.now(); /*
											 * Here we're creating object of in-built class not user defined one. to
											 * access the methods of LocalDate class.
											 */
		System.out.println(obj);
		System.out.println(obj.getYear());
		System.out.println(obj.getMonthValue());
		System.out.println(obj.lengthOfYear());
		System.out.println(obj.lengthOfMonth());

		LocalTime time = LocalTime.now();
		System.out.println("Current Time: " + time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("LocalDateTime: "+ dateTime);
		System.out.println(dateTime.getMinute());
		
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		Duration duration = Duration.ofHours(2);
		Period period = Period.ofDays(10);
		Instant inst = Instant.now();

		System.out.println("Zoned DateTime: " + zoned);
		System.out.println("Duration: " + duration);
		System.out.println("Period: " + period);
		System.out.println("Current Instant: " + inst);

	}
}
