package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;



public class ExerDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will rented? ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Rent # " + i + ":");
			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();			
			Rent rent = new Rent(name, email);
			vect[roomNumber] = rent;
			// pode fazer dessa forma tb vect[roomNunber] = new Rent(name, email);
		}
		
		
		
		System.out.println("busy rooms:" );
		
		for(int i = 0; i< 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();

	}

}
