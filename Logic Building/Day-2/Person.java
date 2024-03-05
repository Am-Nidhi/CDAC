class Person{
	int age,weight;
	float height;

	public Person(int x, float y, int z){
		age = x;
		height = y;
		weight = z;
	}

	public Person(){
		age=weight=0;
		height=0;
	}

	public void display(){
		System.out.println("Person's age: "+age+" years");
		System.out.println("Person's height: "+height+" ft");
		System.out.println("Person's weight: "+weight+" Kgs");
	}

	public static void main(String []args){
		Person p1 = new Person(20,5.42f,50);

		p1.display();
	}

}
