package task1;

//A PROGRAM TO REVERSE THE GIVEN NUMBER
//Have considered negative inputs as well
//Also, have considered the input as numbers only. So for 1000 as input 1 will be printed. Not 0001.

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		boolean isNegative = false;
		if(n < 0) { //checking if input number is -ve
			isNegative = true; //if yes, converting it into +ve for execution
			n *= -1;
		}
		int m = 0;
		while(n >  0) {
			m = (m * 10) + (n % 10);
			n/=10;
		}
		if(isNegative) System.out.println(-m); //printing the num as -ve as it was.
		else System.out.println(m);
		scan.close();
	}
}
