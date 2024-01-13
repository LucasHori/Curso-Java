package entities;

public class Employee {
	public String name;
	public double tax, grossSalary;
	
	
	public double NetSalary() {
		return grossSalary - tax;
		
	}
	
	public void IncreaseSalary(double porcentage) {
		grossSalary += grossSalary * porcentage /100.00;		
	}

}
