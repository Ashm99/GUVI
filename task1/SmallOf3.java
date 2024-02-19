package task1;

//A PROGRAM TO FIND THE SMALLEST OF THREE NUMBERS

import java.util.Scanner;

public class SmallOf3 {
	public static void main(String[] argS) {
//		System.out.println("Hello, world!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers with spaces between them: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a < b && a < c) {
			System.out.println(a + " is the smallest number.");
		}
		else if(b < c) {
			System.out.println(b + " is the smallest number.");
		}
		else {
			System.out.println(c + " is the smallest number.");
		}
		scan.close();
	}
}
