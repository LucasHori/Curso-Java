package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros;
import entities.Valores;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		Valores[] vect = new Valores[n];
		
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = new Valores(num);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			 
			soma += vect[i].getValores();
			
		}
		
		double media = soma/vect.length;
		
		
		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i].getValores());
	    }
	    
	    System.out.println();
	
		System.out.println("soma = " + soma);
		System.out.println("media = " + media);
		
		
		sc.close();
		
	}

}
