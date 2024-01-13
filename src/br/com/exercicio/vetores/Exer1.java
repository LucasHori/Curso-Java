package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros;
import entities.Product2;

public class Exer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n;
	
	
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		
		Numeros[] vect = new Numeros[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero");
			int num = sc.nextInt();
			vect[i] = new Numeros(num);

		}
		
		System.out.println("numeros negativos");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getNumero() < 0) {
				System.out.println(vect[i].getNumero());
			}
		}
		
		
		
		
		sc.close();
		
		
		
		
		
	}
}
