package coreJava;

import java.util.ArrayList;
import java.util.Random;

public class bktSort {

	static int range = 500; // setting the range
	static int size = range / 10;
	static int[] ar = new int[size]; // setting the size of the array
	public static void main(String[] args) {
//		Filling the array with random numbers within range
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Random().nextInt(range);
		}
		for (int array : ar) {
			System.out.print(array + " ");
		}
		System.out.println("\n");
//		Finding the largest number within the array
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			if (temp < ar[i]) {
				temp = ar[i];
			}
		}
		int ind = size / 3; // Setting the number of the buckets
		Buckets[] buck = new Buckets[ind]; // creating an array of buckets
		for (int i = 0; i < buck.length; i++) {
			buck[i] = new Buckets(); // initializing using object of buckets
		}
		for (int a : ar) {
			int bi = a * ind / (temp + 1); // Creating a bucket index number
			buck[bi].bkt.add(a);
		}
		for (Buckets n : buck) {
			System.out.print("Bucket ");
			for (int val : n.bkt) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		// Sorting using insertion sort
		System.out.println();
		for (Buckets b : buck) {
			for (int i = 0; i < b.bkt.size() - 1; i++) {
				int p = i;
				while (p >= 0 && b.bkt.get(p) > b.bkt.get(p + 1)) {
					temp = b.bkt.get(p);
					b.bkt.set(p, b.bkt.get(p + 1));
					b.bkt.set(p + 1, temp);
					p--;
				}
			}
		}
		System.out.println("--------------------------- \n");
		int index = 0;
		for (Buckets n : buck) {
			System.out.print("Bucket ");
			for (int val : n.bkt) {
				System.out.print(val + " ");
			}
			System.out.println();
			for (int val : n.bkt) {
				ar[index] = val;
				index++;
			}
		}
		System.out.println("\n");
		for (int num : ar) {
			System.out.print(num + " ");
		}
	}
}
class Buckets {
	ArrayList<Integer> bkt = new ArrayList<Integer>();
}
