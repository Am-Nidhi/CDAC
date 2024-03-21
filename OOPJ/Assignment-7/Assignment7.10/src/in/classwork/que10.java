package in.classwork;

import java.util.Scanner;

public class que10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements: ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean ascending = true;
        boolean descending = true;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                descending = false;
            } else if (arr[i] < arr[i-1]) {
                ascending = false;
            }
        }

        if (ascending && !descending) {
            System.out.println("Ascending");
        } else if (descending && !ascending) {
            System.out.println("Descending");
        } else {
            System.out.println("Random");
        }
		
		sc.close();
	}

}
