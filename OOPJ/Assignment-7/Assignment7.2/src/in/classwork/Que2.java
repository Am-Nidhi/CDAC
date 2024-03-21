package in.classwork;

public class Que2 {

	public static void main(String[] args) {
		
		int arr1[] = new int[] {10,20,30,40,50};
		int arr2[] = new int[] {10,20,30,40,50};
		int count=0;
		
		for(int i=0; i<5;i++) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
		}
		
		if(count==5) {
			System.out.println("Both arrays are equal");
		}

	}

}
