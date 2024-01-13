package br.curso.programacao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int x, soma = 0;
		
		x = sc.nextInt();
		
		while (x != 0) {
			
			soma += x;
			x = sc.nextInt();
			
		}
		System.out.println("programa encerrou: " + soma);
		
		
		
		sc.close();
	}

}
