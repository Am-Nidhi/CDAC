import java.util.*;

class que4{

	public static void main(String []args){

		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr= new int[n];
		
		
		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();	
			sum =sum + arr[i];
		}
		System.out.println(sum);
		
	}
}