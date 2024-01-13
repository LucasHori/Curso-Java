package br.com.aplication.entities;

public class EntitiesBanco {
	private String name;
	private int number;
	private double saldo;
	
	
	public EntitiesBanco(String name, int number) {
		this.name = name;
		this.number = number;
		
		
	}

	
	public EntitiesBanco(String name, int number, double inicioDeposito) {
	
		this.name = name;
		this.number = number;
		valorDepositado(inicioDeposito);
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public double getSaldo() {
		return saldo;
	}


	
	
	
	public void valorDepositado(double deposito){
		saldo += deposito;
	
		
	}
	
	public void valorSaque(double deposito) {
		saldo -= deposito + 5.00;
		
		
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", name: "
				+ name
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}

}
