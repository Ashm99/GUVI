package taxSystem;

import java.util.Scanner;

public class XYZ {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argS) throws Exception {
		System.out.println("Enter the data of an employee and a product to print their taxes\n");
		
		Employee employee = new Employee(scan);
		
		printLine(1);
		
		employee.calcTax();
		
		printLine(1);
		
		Product product = new Product(scan);
		
		printLine(1);
		
		product.calcTax();
		
		scan.close();
	}
	
	
	//prints 'n' dotted lines
	private static void printLine(int n) {
		while(n > 0) {
			System.out.println("-----------------------------");
			n--;
		}
	}
	
}
