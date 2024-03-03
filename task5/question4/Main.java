package question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Getting input date from user
		System.out.println("Enter your birthdate(yyyy-mm-dd): ");
		Scanner scan = new Scanner(System.in);
		String stringDate = scan.nextLine();
		
		//creating a LocalDate object with the given input birthdate
		LocalDate date = LocalDate.parse(stringDate);
		scan.close();
		
		//creating a LocalDate object with current date
		LocalDate currDate = LocalDate.now();
		
		System.out.println();
		System.out.println("Output: ");
		
		//using Period class to print the age with between() method
		Period period = Period.between(date, currDate);
		System.out.println("Your age is: "
				+ period.getYears() + " years, "
				+ period.getMonths() + " months and "
				+ period.getDays() + " days"
				);
		
	}

}
