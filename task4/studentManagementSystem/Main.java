package studentManagementSystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NameNotValidException, AgeNotWithinRangeException{
		
		//creating a student object
		//checks if the provided values are valid through logic provided in the Student class
		//if invalid, gets valid input from the user
		Student student1 = new Student(12, "Ashok!", 23, "BT");
		
		student1.displayData();
	}
}
