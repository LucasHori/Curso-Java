package br.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class ProgramExercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Notas notas = new Notas();
		
		
		System.out.print("name: ");
		notas.name = sc.nextLine();
		
		System.out.print("prova 1: ");
		notas.p1 = sc.nextDouble();
		
		System.out.print("prova 2: ");
		notas.p2 = sc.nextDouble();
		
		System.out.print("prova 3: ");
		notas.p3 = sc.nextDouble();
		
		notas.NotaFinal();
		
		System.out.println("Final Grade: " + notas.NotaFinal());


		
	}

}
