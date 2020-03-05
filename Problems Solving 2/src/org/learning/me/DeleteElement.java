package org.learning.me;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		
		int arr[]= {22,24,30,45,10,14};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index to delete");
		int index=sc.nextInt();
		
		System.out.println("Before deletion: ");
		printArray(arr);
		int [] arr1=deleteElement(arr, index);
		System.out.println("After deletion: ");
		printArray(arr1);
	}
		
		 static void printArray (int arr[]) {
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+"");
			}
			System.out.println();
		}

		 static int[]deleteElement(int arr[], int index){
			 int []arr1= new int[arr.length-1];
			 
			 //copy all previous elements into new array
			 for (int i=0;i<index;i++) {
				 arr1[i]=arr[i];
			 }
			 
			 //skip the specified index by initiating i=index+1 and copy subsequent elements
			 for (int i=index+1; i<arr.length; i++) {
				 System.out.println("Array index is out of bounds");
			 }
			 return arr1;
		 } 
	}


