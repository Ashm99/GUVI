package question1;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//Declaring a String Stream names
		Stream <String> names = Stream.of("aBc", "d", "ef");

		//using .map() method to convert the Strings to upper case
		List <String> result = names.map(n -> n.toUpperCase()).toList();
		
		//Printing the result
		System.out.println(result);
		
	}
}