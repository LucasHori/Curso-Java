package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] a = new double[n];
		for(int i=0; i< n; i++) {
			System.out.println("digite um numeor: ");
			a[i] = sc.nextDouble();
			
		}
		
		double media =0.0, soma =0.0;
		
		for(int i =0; i<n; i++) {
			soma += a[i];
		}
		
		media = soma/n;
		 System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		    System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		    for (int i=0; i<n; i++) {
		        if (a[i] < media) {
		        	System.out.printf("%.1f\n", a[i]);
		        }
		    }

			sc.close();
		

	}

}
