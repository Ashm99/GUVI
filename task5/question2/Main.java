package question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		//Given list:
		List <String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		//filtering out empty strings
		List <String> result = listStrings.stream()
				.filter(n -> !n.isEmpty())
				.collect(Collectors.toList());
		
		//Printing the result
		System.out.println(result);
		
	}
}