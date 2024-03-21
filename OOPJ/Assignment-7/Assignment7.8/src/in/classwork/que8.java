package in.classwork;

import java.util.Scanner;

public class que8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements: ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int avg[] = new int[n-2];
		
		for(int i=0;i<n-2;i++) {
			avg[i] = (arr[i]+arr[i+1]+arr[i+2])/3;
		}
		
		for(int i=0;i<n-2;i++) {
			System.out.print(avg[i]+" ");
		}
		
		
		sc.close();
	}

}
