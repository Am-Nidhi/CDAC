import java.util.*;

class que6{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements of array");

		for (int i=0; i<n ; i++){  
			arr[i] = sc.nextInt();
		}
		int j= n-1;
		for (int i=0; i<n/2; i++){  

			int temp=0;
			temp = arr[i];	
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
			
		}

		for (int i=0; i<n ; i++){  
			System.out.println(arr[i]);
		}
	}
}