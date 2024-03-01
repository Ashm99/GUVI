package stackExcercise;

import java.util.Stack;

//A Main class that holds the main method
//No inputs asked, only prints values for invoked methods inside main method
//contains a static Stack object 'stack' containing random integers
//also contains static methods to push, pop or check if stack is empty
public class Main {
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		//PUSHING DATA INTO THE STACK
		System.err.println("PUSHING: ");
		push(1);
		push(3);
		push(5);
		push(7);
		push(9);
		push(0);
		System.out.println("stack after pushing: " + stack);
		
		//POPPING 3 VALUES FROM THE STACK
		System.err.println("POPPING: ");
		int i = 3;
		while(i-- > 0) {
			pop();
		}
		System.out.println("stack after popping 3 values: " + stack);
		
		//CHECKING IF STACK IS EMPTY
		System.err.println("CHECKING IF EMPTY: ");
		if(isEmpty()) {
			System.out.println("stack is currently empty.");
		}
		else {
			System.out.println("stack is not empty. stack: " + stack);
		}
		
		printline();
		
		//POPPING ALL REMAINIG VALUES
		System.err.println("POPPING: ");
		while(!isEmpty()) {
			pop();
		}
		System.out.println("stack after popping all values: " + stack);

		//CHECKING IF STACK IS EMPTY
		System.err.println("CHECKING IF EMPTY: ");
		if(isEmpty()) {
			System.out.println("stack is currently empty.");
		}
		else {
			System.out.println("stack is not empty. stack: " + stack);
		}
	}
	
	//pushes the given integer into the stack object
	//calls the push method of the static stack object for adding data
	private static void push(int i) {
		stack.push(i);
		
	}
	
	//removes the last integer added to the stack object
	//calls the pop method of the static stack object to perform removal
	private static void pop() {
		stack.pop();
	}
	
	//checks if stack is empty and if empty, returns true
	private static boolean isEmpty() {
		return stack.empty();
	}
	
	//prints a single dashed line in the output for result seperation
	public static void printline() {
		System.out.println("----------------------\n");
	}
}
