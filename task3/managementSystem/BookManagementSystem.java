package managementSystem;

import java.util.Scanner;

//run and checkout the error due to newline
//implement a menu driven system
public class BookManagementSystem {

	public static void main(String[] args) throws InterruptedException {
		Library library = new Library();
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi User!\nWelcome to the Book Management System."
				+ "\nEnter a number and press 'Enter' to perform the below actions.\n");
		int input;
		do{
			System.out.println("\nChoose any action to perform:\n"
					+ "1 -> Add a Book to the library\n"
					+ "2 -> Remove a Book from the library\n"
					+ "3 -> Replace a Book from the library\n"
					+ "4 -> Search for a Book in the library\n"
					+ "5 -> Display all the Books in the library\n"
					+ "0 -> Close the program\n"
					+ "Input : ");
			input = scan.nextInt();
			switch(input){
				case 0: {
					System.out.println("Closing the program...");
					Thread.sleep(2000);
					break;
				}
				case 1:{
//					System.out.println("Added a book.\n\n");
					library.addBook();
					break;
				}
				case 2:{
					System.out.println("Enter ID of the book to be removed: ");
					int id = scan.nextInt();
					library.removeBook(id);
//					System.out.println("Removed a book.\n\n");
					break;
				}
				case 3:{
					System.out.println("Enter ID of the book to be replaced: ");
					int id = scan.nextInt();
					library.replaceBook(id);
//					System.out.println("Replaced a book.\n\n");
					break;
				}
				case 4:{
					System.out.println("Enter ID of the book to find: ");
					int id = scan.nextInt();
					library.searchBook(id);
//					System.out.println("Searched for a book.\n\n");
					break;
				}
				case 5:{
					library.displayBooks();
//					System.out.println("Displayed books.\n\n");
					break;
				}
				default:{
					System.out.println("Enter a valid number!\n\n");
				}
			}
		}while(input != 0);
		System.out.println("Program closed.");
		scan.close();
	}

}
