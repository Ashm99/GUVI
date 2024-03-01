package studentManagementSystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	private int rollNo = 0;
	private String name = "";
	private int age = 0;
	private String course = "";
	private static Scanner scan = new Scanner(System.in); //Only to be used inside the class for scanning inputs
	
	//parameterized constructor
	public Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
		this.setRollNo(rollNo);
		this.setName(name);
		this.setAge(age);
		this.setCourse(course);
	}

	//return the rollNo
	public int getRollNo() {
		return rollNo;
	}

	//return the name
	public String getName() {
		return name;
	}

	//return the age
	public int getAge() {
		return age;
	}

	//return the course
	public String getCourse() {
		return course;
	}

	//set the rollNo
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//set the name
	//step 1. if the given name is not acceptable, throws error, handles the error and prints the error message
	//step 2. Afterwards, receives new input from the user and uses it, if acceptable
	//if not, then from step 1 again
	public void setName(String name){
		Pattern pattern = Pattern.compile("[\\d\\p{Punct}]");
		Matcher matcher = pattern.matcher(name);
		while(this.name.equals("")) {
			try {
				if(matcher.find()) {
					throw new NameNotValidException("Name should not contain any numbers or special cases!");
				}
				this.name = name;
			}
			catch(NameNotValidException e){
				System.err.println(e.getMessage());
				System.out.println("Enter a valid name without numbers or special characters: ");
				name = scan.nextLine();
				pattern = Pattern.compile("[\\d\\p{Punct}]");
				matcher = pattern.matcher(name);
			}
		}
	}

	//set the age
	//step 1. if the given age is not acceptable, throws error, handles the error and prints the error message
	//step 2. Afterwards, receives new input from the user and uses it, if acceptable
	//if not, then from step 1 again
	public void setAge(int age){
		while(this.age == 0) {
			try {
				if(age < 15 || age > 21) {
					throw new AgeNotWithinRangeException("Age must be in the range from 15 to 21!");
				}
				this.age = age;
			}
			catch(AgeNotWithinRangeException e) {
				System.err.println(e.getMessage());
				System.out.println("Enter a valid age from 15 to 21(inclusive): ");
				age = Integer.parseInt(scan.nextLine());
			}
		}
	}

	//set the course
	public void setCourse(String course) {
		this.course = course;
	}
	
	//prints user name, age, roll no and his/her course
	public void displayData() {
		System.out.println("Name   : " + this.name 
		               + "\nAge    : " + this.age 
		               + "\nRoll No: " + this.rollNo 
		               + "\nCourse : " + this.course);
	}
}
