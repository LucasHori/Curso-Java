package br.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x, y; 
		x = new Triangle();
		y = new Triangle(); 
		
		
		
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
	
		double areax = x.area(); 
		double areay = y.area();
		
		System.out.printf("triangle x area: %.4f%n", areax);
		System.out.printf("triangle x area: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.println("large area: x");
		} 
		else {
			System.out.println("large area: y");
		}
		
		
		sc.close();
		
		
		
	}

}
