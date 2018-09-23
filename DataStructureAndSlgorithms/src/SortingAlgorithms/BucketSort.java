package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Random;

public class BucketSort {
	static int num1 = 10;
	static int[] ar = new int[num1];

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(num1);

		}

		for (int n : ar) {
			System.out.print(n + " ");
		}

		bucketSort(ar);

		System.out.println();
		for (int n : ar) {
			System.out.print(n + " ");
		}

	}

	public static int[] bucketSort(int[] array) {
		int[] list = array;
		// implement here

		int size = list.length;

		// creating the buckets
		buckets[] b = new buckets[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = new buckets();
		}

		// adding elements to the bucket
		for (int n : list) {
			int bi = (n * 10) / (num1 + 1);
			b[bi].bkt.add(n);
		}

		int index = 0;
		for (buckets n : b) {
			BIS(n.bkt);

			for (int num : n.bkt) {
				list[index] = num;
				index++;
			}
		}

		return list;
	}

	public static void BIS(ArrayList<Integer> array) {

		// Insertion Sort
		// Best Time O(n)
		// worst time complexity O(n^2)
		for (int i = 1; i < array.size(); i++) {
			int temp = array.get(i);
			int j = i - 1;
			while (j >= 0 && array.get(j) > temp) {
				array.set(j + 1, array.get(j));
				j--;
			}
			array.set(j + 1, temp);
		}

	}

//	public static void swap(ArrayList<Integer> array, int index1, int index2) {
//		int temp = array.get(index1);
//		array.set(index1, array.get(index2));
//		array.set(index2, temp);
//	}

}

class buckets {
	ArrayList<Integer> bkt = new ArrayList<Integer>();
}