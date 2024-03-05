class RoomDemo{
	int height, weight, breadth;

	public RoomDemo(int a, int b, int c){

		height = a; 
		weight = b; 
		breadth = c;
	}

	public int volume(){
		return height*weight*breadth;
	}

	public static void main(String []args){

		RoomDemo r = new RoomDemo(10,15,21);
		System.out.println("Volume of room: "+r.volume());	

	}

}