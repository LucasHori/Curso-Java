package br.curso.programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAcumulacao {
	 
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		
		double conta = 50.0;
		if(min > 100) {
		//conta = conta + (min - 100) * 2.0;
			conta += (min - 100) *2.0;
			// += e igual o conta = conta + 
		}
		
		System.out.printf(	"valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}
	

}
