package question3;

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
		
		//checking if input number is -ve
		//if yes, converting it into +ve for execution
		if(n < 0) { 
			isNegative = true; 
			n *= -1;
		}
		int m = 0;
		while(n >  0) {
			m = (m * 10) + (n % 10);
			n/=10;
		}
		
		//printing the num as -ve if it was -ve.
		if(isNegative) System.out.println(-m); 
		else System.out.println(m);
		scan.close();
	}
}
