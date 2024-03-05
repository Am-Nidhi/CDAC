import java.util.*;

class que5{

	public static void main(String []args){

	System.out.println("Enter no. of elements:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.println("Enter elements of array");
	for(int i=0; i<n; i++){
		
		arr[i] = sc.nextInt();
	}

	for(int i=0; i<n; i++){
		
		for(int j=i+1; j<n; j++){
			int temp=0;
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
	}
	
	
	/*for(int i=0; i<n; i++){
		
		System.out.println(arr[i]);
	}*/
	System.out.println("Second largest element: " + arr[1]);
	}
}