package br.com.exercicio.vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Numeros;
import entities.Pessoas;

public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double alturaMedia, percentualMenores;
		
		System.out.println("Quantas pessoas serao digitadas? ");
		
		n = sc.nextInt();
		
		Pessoas[] vect = new Pessoas[n];
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("dados %da pessoa:\n", i + 1);
			System.out.println();
			System.out.print("nome: ");
			String nome = sc.next();
			System.out.println();
			System.out.println("idade: ");
			int idade = sc.nextInt();
			System.out.println();
			System.out.println("altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(nome, idade, altura);
			
			
		}
		
		double soma = 0.0;
		for(int i = 0; i<vect.length; i++) {
			soma = soma + vect[i].getAltura();
		}
		
		double media;
		media = soma/vect.length;
		
		System.out.println("altura media: ");
		
		double menores = 0.0, alturaTotal = 0.0;
		for(int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				menores ++;
				
			}
			alturaTotal += vect[i].getAltura();
		}
		
		alturaMedia = alturaTotal / vect.length;
		percentualMenores = ((double)menores / vect.length) * 100;
		
		
		 System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		    for(int i=0; i<n; i++) {
		        if (vect[i].getIdade() < 16) {
		        	System.out.printf("%s\n", vect[i].getNome());
		        }
		    }

			sc.close();
	}

}
