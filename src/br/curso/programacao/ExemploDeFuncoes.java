package br.curso.programacao;

import java.util.Scanner;

public class ExemploDeFuncoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double x1, x2, delta, b, a, c;
		
		
		System.out.println("Entre com os valores de a, b e c para descobrir o delta e o valor de x");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("valor de delta: " + delta);
		
		x1 = (-b + Math.sqrt(delta))/(2 * a);
		System.out.println("valor de x: " + x1);
		
		x2 = (-b + Math.sqrt(delta))/(2 * a);
		System.out.println("valor de x: " + x2);
		
		
		
		
			
		
		
	}

}
