package br.com.aplication.data.global;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraGlobal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		LocalDate d04 = LocalDate.parse("2024-01-08");
		LocalDateTime d05 = LocalDateTime.parse("2024-01-08T23:38");
		Instant d06 = Instant.parse("2024-01-09T01:48:26Z");
		
		//lista os nomes que posso usar para fuso horario 
		//for(String s : ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
		//}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
		//obter data-hora de uma data-hora local
		
		System.out.println(d04.getDayOfMonth());
		System.out.println(d04.getMonthValue());
		System.out.println(d04.getYear());
		
		System.out.println(d05.getHour());
		System.out.println(d05.getMinute());

	}

}
