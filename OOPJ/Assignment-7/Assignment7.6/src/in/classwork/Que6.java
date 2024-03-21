package in.classwork;

import java.util.Scanner;

public class Que6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements: ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		//for 1st largest
		for(int i=1;i<n;i++) {
				if(arr[i]>first) {
					third = second;
					second = first;
					first = arr[i];
				}
				else if(arr[i]>second) {
					third = second;
					second = arr[i];
				} 
				else if(arr[i]>third) {
					third = arr[i];
				}
		}
		
		
		System.out.println("Third Largest Value : "+third);
		
		sc.close();
		/*
		System.out.println(arr[0]);
		System.out.println(arr[n-1]);*/
	}

}
