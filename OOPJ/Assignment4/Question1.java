package in.classwork;

import java.util.Scanner;

class Student{
	String name;
	int studid;
	float stmarks;
	
	public void enterDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		this.name = sc.nextLine();
		System.out.print("Enter student id: ");
		this.studid = sc.nextInt();
		System.out.print("Enter student marks: ");
		this.stmarks = sc.nextFloat();
		sc.close();
	}
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.printf("%-15s%-10d%-10.2f",this.name,this.studid,this.stmarks);
	}
	
}

public class Assignment1Q1 {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.enterDetails();
		
		std.displayDetails();
		
	}

}
