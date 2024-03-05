import java.util.*;

class que7{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		System.out.println("Enter elements of 1st array");

		for (int i=0; i<n ; i++){  
			arr1[i] = sc.nextInt();
		}

		int arr2[] = new int[n];
		System.out.println("Enter elements of 2nd array");

		for (int j=0; j<n ; j++){  
			arr2[j] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(arr1[i]==arr2[j]){
					System.out.print("Common elements {"+arr1[i] + "} ");
				}
			}
		} 
	}
}
