import java.util.*;
import java.util.Scanner;
class Book{

	int bookId;
	String title,author;
	boolean isAvailable;

	public Book(int bid, String btitle, String bauthor, boolean a){
		bookId = bid;
		title  = btitle;
		author = bauthor;
		isAvailable = a;
	}	
	
	public Book(){
		bookId = 0;
		title = "null";
		author = "null";
		isAvailable = false;
	}
}

class User{

	int userId;
	String name;
	int[] booksBorrowed;
	
	public User(int uid, String uname, int[] b){
		userId = uid;
		name = uname;
		booksBorrowed = (b != null) ? b : new int[0];
	}

	public User(){
		userId = 0;
		name = "null";
		booksBorrowed = null;
	}
}

class VirtualLibrary{
	static User[] users = new User[2]; 
    	static Book[] books = new Book[4];

public static void borrowBook(Scanner sc){
	System.out.print("Enter your user ID: ");
	int userId = sc.nextInt();
	User user = findUser(userId, users);
	
	if (user != null) {
        	System.out.print("Enter the book ID you want to borrow: ");
        	int bookId = sc.nextInt();
		Book book = findBook(bookId, books);
		if(book != null && book.isAvailable){
			for(int i=0; i<user.booksBorrowed.length; i++){
				if(user.booksBorrowed[i] == book.bookId){
				user.booksBorrowed[i] = book.bookId;
				}
			}
			book.isAvailable = false;
			System.out.println("Book borrowed successfully!");
		} else {
			System.out.println("Unable to borrow book");
		}
	}else {
		System.out.println("User not found!");
	}
}

public static void returnBook(Scanner sc){
	System.out.print("Enter your user ID: ");
	int userId = sc.nextInt();
	System.out.print("Enter book ID you want to return: ");
	int bookId = sc.nextInt();

	User user = findUser(userId,users);
        Book book = findBook(bookId,books);

	if(user != null && book != null && !book.isAvailable){
		for(int i=0; i< user.booksBorrowed.length; i++){
			if(user.booksBorrowed[i] == bookId){
				book.isAvailable = true;
				user.booksBorrowed[i] = 0;
				System.out.println("Book returned successfully");
				return;
			}
		}
	} else{
		System.out.println("Unable to return book!");
	}
}

public static void displayAvailableBook(){
	for(Book book : books){
		if(book.isAvailable){
			System.out.println("Book Id: "+ book.bookId);
			System.out.println("Title: " + book.title);
			System.out.println("Author: "+ book.author);
			System.out.println();
		}
	}
 
}

public static void displayBorrowedBook(){
        for(User user : users){
        for(int bookId : user.booksBorrowed){
            Book book = findBook(bookId, books);
            if(book != null && !book.isAvailable){
                System.out.println("Book Id: "+ book.bookId);
                System.out.println("Title: " + book.title);
                System.out.println("Author: "+ book.author);
                System.out.println("Borrower: " + user.name);
                System.out.println();
            }
        }
    }
}

public static User findUser(int userId, User[] users){
	for(User user: users){
		if(user.userId == userId){
			return user;
		}
	}
	return null;
}

public static Book findBook(int bookId, Book[] books){
	for(Book book: books){
		if(book.bookId == bookId){
			return book;
		}
	}
	return null;
}

public static void displayMenu() {
        System.out.println("Welcome to the Virtual Library Management System!");
        System.out.println("1. Borrow a Book");
        System.out.println("2. Return a Book");
        System.out.println("3. Display Available Books");
        System.out.println("4. Display Borrowed Books");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");}

public static void main(String[] args) {

	users[0] = new User(101,"mark",null);
	users[1] = new User(102,"Ella",null);

	books[0] = new Book(201,"The Alchemist","Paulo Coelho",true);
	books[1] = new Book(202,"Kite Runner","Khaled Hosseini",true);
	books[2] = new Book(202,"Mocking Jay","Suzanne Collins",true);
	books[3] = new Book(202,"What if?","Randall Manroe",true);


	int n;
	Scanner sc = new Scanner(System.in);
	
	do{
		displayMenu();
		n = sc.nextInt();
	
	switch(n){
		case 1:
			borrowBook(sc);
			break;
		case 2:
			returnBook(sc);
			break;
		case 3:
			displayAvailableBook();
			break;
		case 4:
			displayBorrowedBook();
			break;
		case 5:
			System.out.println("Exiting Virtual Library Management System. Thank you!");
			break;
		default:
		
			System.out.println("Enter Valid Choice");
	}
	} while(n!= 5);

	sc.close();
}
}















