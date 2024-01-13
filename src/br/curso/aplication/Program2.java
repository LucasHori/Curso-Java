package br.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.println();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.println();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);

		System.out.println();
		System.out.print("product data: " + product);

		System.out.println("Entre the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.AddProducts(quantity);

		System.out.println();
		System.out.print("Update data: " + product);

		System.out.println("Entre the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);

		System.out.println();
		System.out.print("update data: " + product);

		sc.close();
	}

}
