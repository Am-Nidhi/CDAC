import java.util.*;

class que8{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements of 1st array");

		for(int i=0; i<n ; i++){  
			arr[i] = sc.nextInt();
		}

		int count = 1;
        	
		for (int i = 1; i < arr.length; i++) {
            		boolean isDuplicate = false;
            		for (int j = 0; j < count; j++) {
                		if (arr[i] == arr[j]) {
                    			isDuplicate = true;
                    			break;
                		}
            		}
            		if (!isDuplicate) {
                		count++;
            		}
        	}
		
		
        	int[] result = new int[count];
        	result[0] = arr[0];
		
		int index = 1;
        	for (int i = 1; i < arr.length; i++) {
            		boolean isDuplicate = false;
            		for (int j = 0; j < index; j++) {
                		if (arr[i] == result[j]) {
                    			isDuplicate = true;
                    			break;
                		}
            		}
            		if (!isDuplicate) {
                		result[index++] = arr[i];
            		}
        	}

		for(int i=0; i<count ; i++){  
			System.out.print(result[i]+",");
		}
	}
}