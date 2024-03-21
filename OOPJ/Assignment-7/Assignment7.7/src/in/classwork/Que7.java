package in.classwork;

import java.util.Scanner;

public class Que7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int n = sc.nextInt();
		
		System.out.print("Enter "+n+" elements for 1st array: ");
		int arr1[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter number2: ");
		int m = sc.nextInt();
		
		System.out.println("Enter "+m+" elements for second: ");
		int arr2[] = new int[m];
		
		for(int i=0;i<m;i++) {
			arr2[i] = sc.nextInt();
		}
		
		int []arrMerge = new int[m+n];
		
		int i=0,j=0,k=0;
		
		while (i<n && j<m) {
			arrMerge[k++] = arr1[i++];
			arrMerge[k++] = arr2[j++];
		}
		
		if(i<n) {
			arrMerge[k++] = arr1[i++];
		}
		
		if(i<n) {
			arrMerge[k++] = arr2[j++];
		}
		
		
		for(int l=0;l<m+n;l++) {
			System.out.println(arrMerge[l]);
		}
		
		sc.close();
	}

}
