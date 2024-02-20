package question1;

//QUESTION 1
//TO CREATE A PERSON OBJECT WITH NAME, AGE AND A METHOD TO DISPLAY THE PROPERTIES
public class Main1 {
	
	public static void main(String[] args) {
		Person person = new Person(); //The person class is written inside Person.java file
		person.setName("Aaron");
		person.setAge(23);
		person.displayDetails();
	}
}