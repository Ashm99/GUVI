package question2;

//AN XYZ CLASS THAT CREATES AND WORKS WITH PRODUCT OBJECTS
import java.util.Scanner;

public class XYZ {
	
	//a method to find the total amount spent on all the products in the products argument
	public static double totalAmountSpent(Product[] products) {
		double amount = 0.00;
		for(Product p : products) {
			amount += (p.getPrice() * p.getQuantity());
		}
		return amount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] products = new Product[5];
		
		System.out.println("Enter 5 product details as asked below: ");
		
		//Getting data on the products
		//By default the IDs of the products is set to start from 1
		for(int i = 0; i < 5; i++) {
			System.out.println("Product " +  (i + 1) + ": ");
			System.out.println("\tEnter the price of a single object: ");
			double cost = scan.nextDouble();
			System.out.println("\tEnter the quantity of the object: ");
			int qty = scan.nextInt();
			products[i] = new Product(i+1, cost, qty);
		}
		//A sample array
		//comment out the above loop before using this sample array, if necessary
//		products[0] = new Product(1, 100, 23);
//		products[1] = new Product(2, 3200, 5);
//		products[2] = new Product(3, 399, 10);
//		products[3] = new Product(4, 50000, 2);
//		products[4] = new Product(5, 1200, 2);
		
		//To find the id of the product with highest price
		double price = -1;
		int id = -1;
		
		for(Product p : products) {
			System.out.println("pID: " + p.getpID() + " price: " + p.getPrice() + " qty: " + p.getQuantity());
			if(p.getPrice() > price) {
				price = p.getPrice();
				id = p.getpID();
			}
		}
		System.out.println();
		
		System.out.println(id + " is the pID of the product with the highest price.");

		System.out.println();
		
		//printing total amount spent on all the products
		double totalAmount = totalAmountSpent(products);
		System.out.format("Total amount spent on all products is Rs. %.2f", totalAmount);
		scan.close();
	}

}
