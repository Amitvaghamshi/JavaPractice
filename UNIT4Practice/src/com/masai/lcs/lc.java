package com.masai.lcs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class lc {
	
	public static void main(String[] args) {
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		
		LocalDate ld=LocalDate.parse("22:08:2022",df);
//
//	//	LocalDateTime ldt= ld.atTime(2, 12, 14, 32);
//		
//		System.out.println(ld.getMonthValue());
		
//		LocalTime lt=LocalTime.parse("01:22:34");
		
	//	System.out.println(ld);
		
		LocalDateTime eveningTime = LocalDateTime.of(2021, 8, 15, 22, 00);
		
		LocalDateTime nextDayMorningTime = LocalDateTime.of(2022, 8, 16, 12, 00);

		Duration d=Duration.between(eveningTime, nextDayMorningTime);
		System.out.println(d.toMillis());
		
		System.out.println(ChronoUnit.MILLIS.between(eveningTime, nextDayMorningTime));
		
		
		
	}

}
