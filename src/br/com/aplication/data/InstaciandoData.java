package br.com.aplication.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstaciandoData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciacao data
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); 
		
		LocalDate d04 = LocalDate.parse("2024-01-08");
		LocalDateTime d05 = LocalDateTime.parse("2024-01-08T23:38");
		Instant d06 = Instant.parse("2024-01-08T23:48:26Z");
		Instant d07 = Instant.parse("2024-01-08T23:48:26-03:00");
		
		LocalDate d08 = LocalDate.parse("08/01/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("08/01/2024 23:58", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 01, 8);
		LocalDateTime d11 = LocalDateTime.of(2024, 01, 8, 00, 04, 00);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);

	}

}
