package question1;
//A PERSON CLASS WITH NAME AND AGE PROPERTIES
public class Person { 
	
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
