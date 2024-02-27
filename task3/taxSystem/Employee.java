package taxSystem;

import java.text.NumberFormat;
import java.util.Scanner;

public class Employee implements Taxable{
	private String name;
	private int empID;
	private double salary; //yearly salary
	
	//A constructor that initializes data members with the setter with the help of a Scanner object
	Employee(Scanner scan){
		System.out.println("Enter employee name: ");
		this.name = scan.nextLine();
		
		System.out.println("Enter employee id: ");
		String temp = scan.nextLine();
		this.empID = Integer.parseInt(temp);
		
		System.out.println("Enter employee salary: ");
		temp = scan.nextLine();
		this.salary = Double.parseDouble(temp);
	}
	
	//returns the name
	public String getName() {
		return name;
	}


	//returns the empID
	public int getEmpID() {
		return empID;
	}


	//returns the salary
	public double getSalary() {
		return salary;
	}


	//sets the name
	public void setName(String name) {
		this.name = name;
	}


	//sets the empID
	//accepts a integer as input
	public void setEmpID(int empID) {
		this.empID = empID;
	}


	//sets the salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	//calculates and prints yearly income tax of an employee, formatted by NumberFormat class
	@Override
	public void calcTax() {
		double tax = Employee.incomeTax * this.salary;
		NumberFormat numFormat = NumberFormat.getCurrencyInstance();
		String formattedSalary = numFormat.format(this.salary);
		String formattedTax = numFormat.format(tax);
		System.out.println("Employee name    : " + this.name +
		                 "\nSalary (p.a.)    : " + formattedSalary +
		                 "\nIncome Tax (p.a.): " + formattedTax);
	}
}
