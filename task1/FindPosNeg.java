package task1;

//A PROGRAM TO FIND WHETHER A GIVEN NUMBER IS POSTIIVE OR NEGATIVE

import java.util.Scanner;

public class FindPosNeg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		if(n < 0) System.out.println(n + " is negative.");
		else System.out.println(n + " is positive.");
		scan.close();
	}
}
