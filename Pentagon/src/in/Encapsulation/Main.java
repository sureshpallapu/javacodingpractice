package in.Encapsulation;

class Product {
	private String productId;
	private String name;
	private int quantity;
	private double price;

	public Product(String productId, String name, int quantity, double price) {
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	
	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public void displayDetails() {
		System.out.println("productId::" + productId + "name::" + name + "quantity::" + quantity + "price::" + price);
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}

public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("P001", "Laptop", 5, 55000.50);
		p1.getName();
		p1.getClass();
		p1.displayDetails();
		System.out.println(p1);
		p1.setQuantity(10);
		p1.setPrice(53000.00);

	}

}
