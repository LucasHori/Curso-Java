package br.com.aplication.calulo.data.hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		LocalDate d04 = LocalDate.parse("2024-01-08");
		LocalDateTime d05 = LocalDateTime.parse("2024-01-08T23:38");
		Instant d06 = Instant.parse("2024-01-09T01:48:26Z");
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusHours(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusHours(2);
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		
		//descobrir duracao entre duas horas
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println(t1.toHours());
		
		
		//nao tem como calcular a data sem horas 
		//somente se usar atTime exemplo
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		System.out.println(t2.toDays());
		

	}

}
