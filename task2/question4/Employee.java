package question4;

public class Employee extends Person{
	
	private int employeeID;
	private double salary;
	
	Employee(String name, int age, int eID, double salary){
		//using super keyword to initialize the Person attributes
		super.setName(name);
		super.setAge(age);
		this.employeeID = eID;
		this.salary = salary;
	}
	
	//A method to display the details of the employee object
	public void displayDetails() {
		System.out.println("Details ");
		System.out.println("Employee name: " + super.getName());
		System.out.println("Age          : " + super.getAge());
		System.out.println("Employee ID  : " + this.employeeID);
		System.out.format("Salary       : Rs. %.2f per month\n",this.salary);
	}
	public static void main(String[] args) {
		//Creating an Employee object and printing his details
		Employee e = new Employee("Aaron", 23, 707, 50000);
		e.displayDetails();
	}

}
