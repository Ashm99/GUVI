package question2;
//A PRODUCT CLASS WITH PID, PRICE AND QUANTITY
public class Product{
	private int pID;
	private double price;
	private int quantity;
	
	//parameterized constructor
	Product(int id, double price, int qty){
		this.setpID(id);
		this.setPrice(price);
		this.setQuantity(qty);
	}
	//getter and setter methods for the private attributes
	public double getPrice() { 
		return price;
	}
	
	public int getQuantity() { 
		return quantity;
	}
	
	public int getpID() { 
		return pID;
	}
	
	public void setpID(int pID) { 
		this.pID = pID;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}
}
