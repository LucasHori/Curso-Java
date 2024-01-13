package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	
	public Product(String name, double price, int qunatity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}

	public double TotalValueInStock() {
		return quantity * price;

	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;

	}

	public String toString() {
		return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + "units, Total: "
				+ String.format("%.2f", TotalValueInStock());
	}

}
