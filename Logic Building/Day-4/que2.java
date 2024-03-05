class que2{

	public static void main(String []args){
	
	int array[] = {5,4,3,9,1,7,9};
	int min = array[0];
	int max = array[0];

	for(int i=0; i<=6; i++){
		if(array[i] < min){
			min = array[i];
		}
		else if(array[i] > max){
			max = array[i];
		}
	}

	System.out.println("Min: " + min);
	System.out.println("Max: " + max);

	}

}