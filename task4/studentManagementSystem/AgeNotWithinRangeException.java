package studentManagementSystem;

public class AgeNotWithinRangeException extends Exception {
	
	//A constructor that sets the error message in the Exception class
	public AgeNotWithinRangeException(String message) {
		super(message);
	}

}
