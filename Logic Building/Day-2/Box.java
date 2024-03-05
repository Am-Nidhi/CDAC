class Box{
	int height,width,breadth;

	public Box(int x, int y, int z){
		height=x;
 		width=y;
		breadth=z;
	}

	public Box(){
		height=width=breadth=0;
	}
	
	public int getVolume(){
		return height*width*breadth;
	}

	public int getArea(){
		return width*breadth;
	}
	
	public static void main(String []args){
		
		Box a = new Box(2,8,3);
		Box b = new Box(5,4,3);
		
		System.out.println("Box1 Volume: "+ a.getVolume());
		System.out.println("Box2 Volume: "+ b.getVolume());

		System.out.println("Box1 Area: "+ a.getArea());
		System.out.println("Box2 Area: "+ b.getArea());
		
	}
}