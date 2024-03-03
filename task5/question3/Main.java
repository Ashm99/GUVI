package question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//Declaring 10 student names
		List <String> listStrings = Arrays.asList(
				"Anand", 
				"Mathi", 
				"Karthi", 
				"Aaron", 
				"Aruvi", 
				"Arunachalam", 
				"Jagdish", 
				"Agvika", 
				"Babu", 
				"Santhosh" 
				);

		//filtering out empty strings using lambda expressions
		List <String> result = listStrings.stream()
				.filter(s -> s.startsWith("A")) //lambda expression for invoking startsWith() method
				.collect(Collectors.toList());
		
		//Printing the result
		System.out.println(result);
		
	}
}