package managementSystem;

import java.util.Scanner;

//Remove the copy constructor and normal constructor if not used anywhere
public class Book {
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	
	public Book(int ID) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the Book title: ");
			this.title = scan.nextLine();
			
			System.out.println("Enter the Author's name : ");
			this.author = scan.nextLine();
			
			this.bookID = ID;
			
			isAvailable = true;
			
			System.out.println("New book created successfully with Book ID: " + this.bookID);
		}
	}

	
//	//A constructor that initializes a Book object with provided attributes
//	public Book(int bookID, String title, String author, boolean isAvailable) {
//		this.bookID = bookID;
//		this.title = title;
//		this.author = author;
//		this.isAvailable = isAvailable;
////		System.out.println("Book object created!");
//	}
	
	
	//Copy constructor for creating a new book with a different book ID
	//As a library can have many numbers of the same book but with different IDs
//	public Book(Book book) {
//		this.bookID = book.getBookID();
//		this.title = book.getTitle();
//		this.author = book.getAuthor();
//		this.isAvailable = true;
//		System.out.println("Book object created!");
//	}

	
	//return the bookID
	public int getBookID() {
		return bookID;
	}

	//set the bookID
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	//return the title
	public String getTitle() {
		return title;
	}

	//set the title
	public void setTitle(String title) {
		this.title = title;
	}

	//return the author
	public String getAuthor() {
		return author;
	}

	//set the author
	public void setAuthor(String author) {
		this.author = author;
	}

	//return if book is available in library
	public boolean getAvailability() {
		return isAvailable;
	}

	//set book availability
	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	//Displaying the books details i.e.Class members
	public void displayBookData() {
		System.out.println("Book title   : " + this.title 
				+ "\nAuthor       : " + this.author 
				+ "\nBook ID      : " + this.bookID 
				+ "\nAvailability : " + ((this.isAvailable)? "Available":"Unavailable"));
		System.out.println();
		
	}
	
	
}
