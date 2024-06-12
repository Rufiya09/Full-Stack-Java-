package com.odigos.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateApiEx {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		LocalTime time1 = LocalTime.of(18, 47, 20, 450);
		System.out.println(time.isAfter(time1));

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.getYear());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		System.out.println(dateTime.getNano());

		LocalDateTime dateTime1 = LocalDateTime.of(1993, 8, 10, 10, 45);
		System.out.println(dateTime1);

		LocalDate todaysdate = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, todaysdate);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);// Asia/Calcutta
		
		ZoneId zone1=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone1);
		System.out.println(zt);//Asia/Calcutta
	}

}
