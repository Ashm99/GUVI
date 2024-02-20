package task2;

public class Person { 
	//This same person class is used in 
	//question 1 (Main1.java) to create an object and
	//question 4 (Employee.java) as base class for the Employee class
	//so, this class is written in such a way to be used in both questions
	
	private String name;
	private int age = 18; //Default age
	
	public void setName(String name) { //sets the given string as the name
		this.name = name;
	}
	public String getName() { //returns current name
		return this.name;
	}
	public void setAge(int age) { //sets given number as age
		this.age = age;
	}
	public int getAge() { //returns current age
		return this.age;
	}
	public void displayDetails() { //displays current name and age
		System.out.println("My name is " + name + " and age is " + age);
	}
}
