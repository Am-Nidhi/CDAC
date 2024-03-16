package com.work;

class Employee{

	public void Display(String string, int i, double d) {
		// TODO Auto-generated method stub
		System.out.println("Employee 1 name: "+string+", id: "+i+", salary: "+d);
	}

	public void Display(String string, double d) {
		// TODO Auto-generated method stub
		System.out.println("Employee 2 name: "+string+", id: "+d);
	}

	public void Display(int i, double d) {
		// TODO Auto-generated method stub
		System.out.println("Employee 3 id: "+i+", salary: "+d);
	}

	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		
		emp1.Display("James",20025,25036.64);
		emp2.Display("Sam",104852.00);
		emp3.Display(30245,15000.22);
	}

}
