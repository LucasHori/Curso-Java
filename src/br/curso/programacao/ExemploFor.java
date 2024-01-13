package br.curso.programacao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		
		x = sc.nextInt();
		
		
		for(int i = 0; i < x; i++) {
			x = sc.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);

		sc.close();
	}

}
