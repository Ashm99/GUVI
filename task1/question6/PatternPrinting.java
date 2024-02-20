package question6;

//A PROGRAM TO PRINT BELOW PATTERN
//55555
//54444
//54333
//54322
//54321
public class PatternPrinting {

	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			for(int j = 5; j > 0; j--) {
				System.out.print(Math.max(i,j));
			}
			System.out.println();
		}
	}

}
