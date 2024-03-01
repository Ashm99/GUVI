package hashMapExcercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//A Main class that holds the main method
//No inputs asked, only prints values for invoked methods inside main method
//contains a static HashMap object 'students' with name as key and grade as value
//also contains static methods to add, remove or display a student data
public class Main {
	static HashMap<String, Integer> students = new HashMap<>();
	
	public static void main(String[] args) {
		
		System.err.println("ADDITION: ");
		addStudent("Ameer", 87);
		addStudent("Mani", 79);
		addStudent("Vishal", 92);
		addStudent("Vishnu", 84);
		
		System.err.println("REMOVAL: ");
		removeStudent("Mani");
		
		
		System.err.println("DISPLAY: ");
		displayGrade("Ameer");
	}
	
	//adds a student name and grade pair to the static students HashMap
	//after addition prints all the students data in the HashMap
	public static void addStudent(String name, int grade) {
		students.put(name, grade);
		System.out.println("Added " + name + " to the HashMap.");
		for(String i : students.keySet()) {
			displayGrade(i);
		}
		printline();
	}
	
	//removes a student name and grade pair to the static students HashMap
	//after removal, prints all the remaining students data in the HashMap
	public static void removeStudent(String name) {
		students.remove(name);
		System.out.println("Removed " + name + " from the HashMap.");
		for(String i : students.keySet()) {
			displayGrade(i);
		}
		printline();
	}
	
	//prints the name and grade of the student name provided
	public static void displayGrade(String name) {
		System.out.println("Student data: ");
		System.out.println("Student name: " + name);
		System.out.println("Grade       : " + students.get(name));
		System.out.println();
	}
	
	//prints a single dashed line in the output for result seperation
	public static void printline() {
		System.out.println("----------------------\n");
	}
}
