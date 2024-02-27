package managementSystem;

import java.util.Scanner;

public class Library {
	private Book[] books;
	private int bookCount;
	private int bookCapacity;
	
	public Library() {
		this.books = new Book[5];
		this.bookCount = 0;
		this.bookCapacity = 5;
//		System.out.println("Library object created!");
	}
	
	
	//return the bookCount
	public int getBookCount() {
		return bookCount;
	}


	//return the bookCapacity
	public int getBookCapacity() {
		return bookCapacity;
	}
	
	//A method to create and add a book into the library
	//invokes the single parameterized constructor from Book class
	//if the capacity is already filled, extends the book array by calling extend() method
	public void addBook(Scanner scan) {
		//extending the size of the books array if full capacity is reached
		if(this.bookCount == (this.bookCapacity)) {
			System.out.println("Book storage limit reached!\nExtending book capacity in the library!");
			extend(books);
			System.out.println("Extended book capacity by 5 books!");
		}
		//Passing the default ID of the next book to the Book constructor
		Book book = new Book(this.bookCount + 1, scan);
		books[this.bookCount] = book;
		System.out.println("New Book successfully added to the library!");
		this.bookCount++;
	}
	
	
	//To increase the book capacity by 5 books
	//creating a new book array, copying the data and assigning it into the books data member
	private void extend(Book[] books) {
		Book[] newBooks = new Book[bookCapacity + 5];
		for(int i = 0; i < this.bookCount; i++) {
			newBooks[i] = books[i];
		}
		this.books = newBooks;
		bookCapacity += 5;
	}

	
	//Removing a book with the given book ID
	//by finding the index of the Book with given ID
	//and moving the Books present after this ID, one step backward
	public void removeBook(int ID) {
		int index = findBookIndex(ID);
		if(index == -1) {
			System.out.println("Book with the given ID not found!\nPlease check the given ID.");
			return;
		}
		System.out.println("\nRemoving the below book from library: ");
		this.books[index].displayBookData();
		for(int j = index; j < this.bookCount - 1; j++) {
			this.books[j] = this.books[j + 1];
		}
		this.bookCount--;
		System.out.println("Book removed.");
	}

	
	//Display all the books in the library
	public void displayBooks() {
		if(this.bookCount == 0) {
			System.out.println("Library does not have any books currently. Add some!");
			return;
		}
		System.out.println("\nBelow are the books in the library: ");
		for(int i = 0; i < bookCount; i++) {
			this.books[i].displayBookData();
		}
		System.out.println("-End of book list-\n");
		
	}

	
	public void searchBook(int i) {
		int bookIndex = findBookIndex(i);
		if(bookIndex == -1) {
			System.out.println("Search completed!\nNo book found with the given Book ID.");
		}
		else {
			System.out.println("Search completed!\nBelow is the required Book: ");
			this.books[bookIndex].displayBookData();
		}
	}
//	
//	
//	//returns true if already a book exists with the given id
//	//Used only when we need to know whether a book is present in the array
//	private boolean idIsAvailable(int id) {
//		for(int i = 0; i < this.bookCount; i++) {
//			if(this.books[i].getBookID() == id) {
//				return true;
//			}
//		}
//		return false;
//	}
	

	//to find the index of a Book object in the books Array with a given Book ID
	//in order to perform actions on that Book object
	//returns -1 if the book is not found
	private int findBookIndex(int id) {
		for(int i = 0; i < this.bookCount; i++) {
			if(this.books[i].getBookID() == id) {
				return i;
			}
		}
		return -1;
	}

	//A method to replace a book object
	//
	public void replaceBook(int id, Scanner scan) {
		int index = findBookIndex(id);
//		Scanner scan = new Scanner(System.in);
		if(index == -1) {
			System.out.println("Book with the given ID not found!\nPlease check the given ID.");
			return;
		}
		System.out.println("Enter details of the new book: ");
		System.out.println("Enter Book title: ");
		String title = scan.nextLine();
		this.books[index].setTitle(title);

		System.out.println("Enter Author name: ");
		String name = scan.nextLine();
		this.books[index].setAuthor(name);
		
		//since a new book is added, it will be available in the library by default
		this.books[index].setAvailability(true);
		System.out.println("Replaced the book with the new one.\n");
	}

}