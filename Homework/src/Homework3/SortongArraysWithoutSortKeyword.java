package Homework3;

import java.util.Arrays;
import java.util.Collections;

public class SortongArraysWithoutSortKeyword {

	public static void main(String[] args) {

		

		int[] arr = { 3, 7, 9, 10, 6 };
		int temp = 0;
		
//		unsorted array
		
		System.out.println("Unsorted Array");
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		System.out.println("sorting array using sort function");
		
		Arrays.sort(arr);
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
		
	
		System.out.println("Reverse order arrays only possible if the array is defines using Integer [] a = {12,25,4,28,2,3,45,401,-14};");
//		System.out.println("Array in reverse order");
//		Arrays.sort(arr,Collections.reverseOrder());	
//		for(int a: arr) {
//			System.out.print(a+" ");
//		}
		
		// sorting arrays without the sort function

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		System.out.println();
		System.out.println("Array in descending order");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println();
		System.out.println("Array in ascending order");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
