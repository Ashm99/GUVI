package task2;

public class Product{
	private int pID;
	private double price;
	private int quantity;
	
	Product(int id, double price, int qty){//parameterized constructor
		this.setpID(id);
		this.setPrice(price);
		this.setQuantity(qty);
	}

	public double getPrice() { //returns current price
		return price;
	}

	public void setPrice(double price) { //updates the price
		this.price = price;
	}

	public int getQuantity() { //returns current quantity of the object
		return quantity;
	}

	public void setQuantity(int quantity) { //updates the quantity
		this.quantity = quantity;
	}

	public int getpID() { //returns the id of the object
		return pID;
	}

	public void setpID(int pID) { //updates the id
		this.pID = pID;
	}
	
}
