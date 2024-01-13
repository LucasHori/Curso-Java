package br.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ProgramExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Retangle x;
		x = new Retangle();
		
		
		
		
		System.out.println("Enter rectangle width and height");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double calculo = x.Area();
		calculo = x.Perimetro();
		calculo = x.Diagonal();
		
		
		
		
		
		
		System.out.println("AREA = " + x.Area());
		System.out.println("Perimetro = " + x.Perimetro());
		System.out.println("Diagonal = " + x.Diagonal());
		
		

	}

}
