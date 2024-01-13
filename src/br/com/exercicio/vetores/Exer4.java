package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.NumerosPares;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		NumerosPares[] vect = new NumerosPares[n];
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			int numeros = sc.nextInt();
			vect[i] = new NumerosPares(numeros);
		}
		
		
	    System.out.println("\nNUMEROS PARES:");

		
		int qtdpares = 0;
	    for (int i=0; i<vect.length; i++) {
	        if (vect[i].getNumeros() % 2 == 0) {
	        	System.out.printf("%d  ", vect[i].getNumeros());
	            qtdpares++;
	        }
	    }

	    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

		sc.close();	
			

		
	}

}
