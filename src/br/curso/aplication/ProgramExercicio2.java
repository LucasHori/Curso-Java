package br.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramExercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax");
		employee.tax = sc.nextDouble();
		
		employee.NetSalary();
		
		
		System.out.println("Employee: " + employee.name + ", R$ " + employee.NetSalary());
		
		
		
		
		System.out.print("which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		employee.IncreaseSalary(porcentage);
	
	
		
		System.out.print("Update data: " + employee.name + ", R$ " + employee.NetSalary());
		
		
		
		
		
		
		sc.close();
		

	}

}
