import java.util.*;

class Book {
	int bookId;
	String title;
	String author;
	boolean isAvailable;


public Book(int bookId, String title, String author, boolean isAvailable){
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.isAvailable = true;
 }
}
class User {
	int userId;
	String name;
	int[] booksBorrowed;


public User(int userId, String name, int[] booksBorrowed) {
	this.userId = userId;
	this.name= name;
	this.booksBorrowed= new int[5];
 }
}

class virtualLib {

static void list() {
	
    System.out.println("Welcome to the Virtual Library Management System");
	System.out.println("1. Borrow a Book");
	System.out.println("2. Return a Book");
	System.out.println("3. Display Available Books");
	System.out.println("4. Display Borrowed Books");
	System.out.println("5. Exit");
  }

public static void main(String []args) {

	list();
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
	switch(n){
		case 1:
			System.out.println("Enter your user ID:");
			int userId = sc.nextInt();
			System.out.println("Enter the book ID you want to borrow:");
			int bookId = sc.nextInt();

			
			break;
		case 2:
		
			break;
		case 3:
		
			break;
		case 4:
		
			break;
		case 5:
			System.out.println("Exiting Virtual Library Management System. Thank you!");
			break;
		default:
		
			System.out.println("Enter Valid Choice");
	}

	
 }

 }