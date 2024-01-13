package br.com.aplication.banco;

import java.util.Locale;
import java.util.Scanner;

import br.com.aplication.entities.EntitiesBanco;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		EntitiesBanco entitiesBanco;
		
				
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y'){
			System.out.println("Enter initial deposit value: ");
			double inicioDeposito = sc.nextDouble();
			entitiesBanco = new EntitiesBanco(name, number, inicioDeposito);
			
		}
		else {
			entitiesBanco = new EntitiesBanco(name, number);
		}
		System.out.println();
		System.out.println("account data: ");
		System.out.println(entitiesBanco);
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositoValue = sc.nextDouble();
		entitiesBanco.valorDepositado(depositoValue);
		System.out.println("update account data: ");
		System.out.println(entitiesBanco);
		
		

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double saque = sc.nextDouble();
		entitiesBanco.valorSaque(saque);
		System.out.println("update account data: ");
		System.out.println(entitiesBanco);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
