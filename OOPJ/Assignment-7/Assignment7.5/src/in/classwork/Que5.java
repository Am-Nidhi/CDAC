package in.classwork;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" elements: ");
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0;i<n-1;i++) {
				if(arr[i]<smallest) {
					smallest = arr[i];
				} else if(arr[i]>largest) {
					largest = arr[i];
				}
			}
		
		System.out.println("Smallest Value : "+smallest);
		System.out.println("Largest Value : "+largest);
		
		sc.close();
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[n-1]);*/
	}

}
