package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];



		
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
			
			}
		
		for (int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
	    }

		
		System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }

		sc.close();
		
		
	
	}

}
