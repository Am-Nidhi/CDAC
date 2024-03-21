package in.classwork;

public class Que4 {

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30,40,50};
		int rev[] = new int[5];
		int count = 5-1;
		
		System.out.print("Array before reverse: ");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			rev[count] = arr[i];
			count--;
		}
		
		System.out.print("Array after reverse: ");
		for(int i=0;i<5;i++) {
			System.out.print(rev[i]+" ");
		}
	}

}
