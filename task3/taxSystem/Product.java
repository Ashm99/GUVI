package taxSystem;

import java.text.NumberFormat;
import java.util.Scanner;

public class Product implements Taxable{
	private int pID;
	private double price;
	private int quantity;
	
	//A constructor that initializes data members with the setter with the help of a Scanner object
	Product(Scanner scan){
		System.out.println("Enter product id: ");
		String temp = scan.nextLine();
		this.pID = Integer.parseInt(temp);
		
		System.out.println("Enter product price: ");
		temp = scan.nextLine();
		this.price = Double.parseDouble(temp);
		
		System.out.println("Enter product quantity: ");
		temp = scan.nextLine();
		this.quantity = Integer.parseInt(temp);
	}
	//returns the pID
	public int getpID() {
		return pID;
	}

	//returns the price
	public double getPrice() {
		return price;
	}

	//returns the quantity
	public int getQuantity() {
		return quantity;
	}

	//sets the pID
	public void setpID(int pID) {
		this.pID = pID;
	}

	//sets the price
	public void setPrice(double price) {
		this.price = price;
	}

	//sets the quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//calculates and prints unit sales tax of the product, formatted by NumberFormat class
	@Override
	public void calcTax() {
		NumberFormat numFormat = NumberFormat.getCurrencyInstance();
		double tax = Product.salesTax * this.price;
		String formattedPrice = numFormat.format(this.price);
		String formattedTax = numFormat.format(tax);
		System.out.println("Product id         : " + this.pID +
				         "\nProduct price      : " + formattedPrice +
				         "\nSales Tax(per unit): " + formattedTax);
	}
}
