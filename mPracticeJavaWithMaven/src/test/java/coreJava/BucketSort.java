package coreJava;

import java.util.ArrayList;
import java.util.Random;

public class BucketSort {

	public static void main(String[] args) {

		// Initializing array of random numbers
		int[] arr = new int[20];

		// Generating random numbers
		Random rand = new Random();

		for (int index = 0; index < arr.length; index++) {
			// Maximum 50 Minimum 1
			arr[index] = rand.nextInt(50);
		}

		// Display array
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();

		/*
		 * 13 46 26 20 4 14 17 40 29 14 19 45 23 6 30 6 2 25 13 15
		 * 
		 * Bucket 4 2 Bucket 6 6 Bucket 13 14 14 13 15 Bucket 20 17 19 Bucket 23 25
		 * Bucket 26 29 30 Bucket Bucket 40 Bucket 45 Bucket 46
		 * 
		 * 
		 * Bucket 2 4 Bucket 6 6 Bucket 13 13 14 14 15 Bucket 17 19 20 Bucket 23 25
		 * Bucket 26 29 30 Bucket Bucket 40 Bucket 45 Bucket 46
		 * 
		 * 2 4 6 6 13 13 14 14 15 17 19 20 23 25 26 29 30 40 45 46
		 * 
		 */

		// Bucket Sort
		// Time Complexity:
		// Best: Ω(n+k)
		// Average: ϴ(n+k)
		// Worst: O(n^2)
		Bucket[] b = new Bucket[10]; // Create an array of Bucket
		for (int index = 0; index < b.length; index++) {
			b[index] = new Bucket(); // Each array elements hold an object of Bucket
		}

		/*
		 * class Bucket { ArrayList<Integer> bkt = new ArrayList<Integer>(); }
		 */

		// Put numbers into buckets
		for (int n : arr) { // iterating through the values of the array arr
			int bucketIndex = n * 10 / 51; // creates index numbers of the buckets
			b[bucketIndex].bkt.add(n); // Each value of array are stored in the array of b using ArrayList
		}
		
		/*
		 * Bucket 4 2 
		 * Bucket 6 6 
		 * Bucket 13 14 14 13 15 
		 * Bucket 20 17 19 
		 * Bucket 23 25
		 * Bucket 26 29 30 
		 * Bucket 
		 * Bucket 40 
		 * Bucket 45 
		 * Bucket 46
		 */
		

		// Display numbers in each bucket
		for (Bucket n : b) {
			System.out.print("Bucket ");
			for (int num : n.bkt) {

				System.out.print(num + " ");
			}
			System.out.println();
		}

		System.out.println();

		int index = 0;
		// Sort each of the buckets using insertion sort
		for (Bucket n : b) {
			insertionSort(n.bkt);

			// put sorted number to the new array
			for (int num : n.bkt) {
				arr[index] = num;
				index++;
			}

		}

		System.out.println();
		// Display numbers in each bucket
		for (Bucket n : b) {
			System.out.print("Bucket ");
			for (int num : n.bkt) {

				System.out.print(num + " ");
			}
			System.out.println();
		}

		// Display array

		System.out.println();
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public static void insertionSort(ArrayList<Integer> array) {

		// Insertion Sort
		// Best Time O(n)
		// worst time complexity O(n^2)
		for (int indexCounter = 0; indexCounter < array.size() - 1; indexCounter++) {

			int placeHolder = indexCounter;

			while (placeHolder >= 0 && array.get(placeHolder) > array.get(placeHolder + 1)) {
				swap(array, placeHolder, placeHolder + 1);
				placeHolder--;
			}

		}

	}

	public static void swap(ArrayList<Integer> array, int index1, int index2) {
		int temp = array.get(index1);
		array.set(index1, array.get(index2));
		array.set(index2, temp);
	}

}

class Bucket {
	ArrayList<Integer> bkt = new ArrayList<Integer>();
}
