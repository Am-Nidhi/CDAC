package com.work;

class Vehicle{

	public void Display(String string, int i, String string2) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle 1 type: "+string);
		System.out.println("Vehicle 1 has: "+i+" wheels");
		System.out.println("Vehicle 1 is: "+string2+" color");
	}

	public void Display(String string, String string2) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle 2  is: "+string+" color");
		System.out.println("Vehicle 2 type: "+string2);
	}

	public void Display(String string, int i) {
		// TODO Auto-generated method stub
		System.out.println("Vehicle 3 type: "+string);
		System.out.println("Vehicle 3 has: "+i+" wheels");
	}
	
	
	
}

public class Qusetion2 {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();

		v1.Display("Bike",4,"Red");
		v2.Display("Black","car");
		v3.Display("Bus",4);
	}

}
