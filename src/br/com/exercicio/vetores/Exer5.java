package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.NumerosExer5;

public class Exer5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		NumerosExer5[] vect = new NumerosExer5[n];
		for(int i =0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			double numeros = sc.nextDouble();
			vect[i] = new NumerosExer5(numeros);
			
		}
		
		double maior = 0.0;
		int posmaior = 0;
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getNumeros() > maior) {
				maior = vect[i].getNumeros();
				posmaior = i;
			}
		}
		
		  System.out.printf("MAIOR VALOR = %.1f\n", maior);
		    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

			sc.close();
		
	}
	
}
