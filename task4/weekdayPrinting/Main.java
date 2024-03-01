package weekdayPrinting;

import java.util.Scanner;

//A Main class having main method and a weekdays String
public class Main {
	static String[] weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	//accepts index from the user to print the corresponding weekday
	//if index is out of array bounds, handles the exception, prints error message and closes program
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		for(String s : weekdays) {
//			System.out.println(s);
//		}
		System.out.println("Enter the index in range 0-6 to print the day of the week:");
		System.out.println("0 - Sunday");
		System.out.println("1 - Monday...)");
		System.out.print("Input:");
		int input = Integer.parseInt(scan.nextLine());
		try{
			System.out.println(weekdays[input]);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			System.out.println("Enter a valid number from 0 to 6.");
		}
		scan.close();
	}

}
