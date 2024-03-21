package in.classwork;

public class Que3 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,20,30,40,50};
		int num = 50;
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]+arr[i+1])==num) {
				System.out.println(arr[i]+" + "+arr[i+1]+" = "+num+" (given number)");
			}
		}
	}

}
