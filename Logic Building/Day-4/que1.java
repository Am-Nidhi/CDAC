class que1{

	public static void main(String args[]){

		int array[] = {5,4,3,9,1,7,9};
		float sum=0;
		float avg;

		for(int i=0; i<=6; i++){
			sum = sum + array[i];
		}
		
		avg = (sum/7);
		
		System.out.println(avg);

	}

}