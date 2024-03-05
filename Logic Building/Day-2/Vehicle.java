class Vehicle{
	int price, model;
	String color;
	
	public Vehicle(int x, int y, String s){
		price = x;
		model = y;
		color = s;
	}
	
	public Vehicle(){
		price = 0;
		model = 0;
		color = "null";
	}

	public void display(){
		System.out.println("Price: " + price);
		System.out.println("Model number: " + model);
		System.out.println("Color: " + color);
	}
	
	public static void main(String []args){
		Vehicle v = new Vehicle(50000,100256,"red");
		v.display();

	}
}