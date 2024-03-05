class Student{
	String name;
	int[] marks = new int[3];

	public Student(String n, int a, int b, int c){
		name = n;
		marks[0] = a;
		marks[1] = b;
		marks[2] = c;
		
	}

	public  void value(){
		name = "null";
		marks[0] = 0;
		marks[1] = 0;
		marks[2] = 0;
	}

	public int avg(){
		int s =0;
		for(int i=0; i<3; i++){
			s = s+marks[i];
		}

		return s/3;
	}

	public void display(){
		System.out.println("Name: " + name);
		for(int i=0; i<3; i++){
			System.out.println("Marks in subject"+(i+1)+": "+marks[i]);
		}
	}

	public static void main(String []args){
	
	Student st = new Student("Ash",84,65,75);

	st.display();

	System.out.println("Average marks: "+st.avg());
	}
}