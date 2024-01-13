package br.curso.programacao;

import java.util.Scanner;

public class ExemploSwithcCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		String dia;
		
		x = sc.nextInt();
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("dia da semana " + dia);
		sc.close();
	}

}
