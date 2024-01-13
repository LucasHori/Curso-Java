package br.curso.programacao;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x = 5;
		
		//System.out.println("bom dia");
		
		//if(x < 0) {
		//System.out.println("boa tarde");
		
		//}
		//System.out.println("boa noite");
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia");
		}
		else {
			if(hora < 18) {
			System.out.println("boa tarde");
		}
	
		else {
			System.out.println("Boa noite");
		}
			}
		
		
		sc.close();
	}

}
