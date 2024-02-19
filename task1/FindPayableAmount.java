package task1;

//A PROGRAM TO FIND THE FINAL PAYABLE AMOUNT AFTER DISCOUNT
//Note: The input is considered as double as no constraint was given
import java.util.Scanner;

public class FindPayableAmount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the amount: ");
		double amount = scan.nextDouble();
		if(amount < 500) {//less than 500
			System.out.println("Final amount: Rs." + amount);
		}
		else if(amount < 1000) {//from 500 to 999
			amount *= 0.90;
			System.out.format("Final amount: Rs. %.2f", amount);
		}
		else {//greater than or equal to 1000
			amount *= 0.80;
			System.out.format("Final amount: Rs. %.2f", amount);
		}
		scan.close();
	}
}
