package SortingAlgorithms;

import java.util.Random;

public class InsertionSort1 {

	static int[] ar = new int[14];

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);

		}

		for (int n : ar) {
			System.out.print(n + " ");
		}

		insertionSort(ar);

		System.out.println();
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static int[] insertionSort(int[] array) {
//		final long startTime = System.currentTimeMillis();
		int[] list = array;
		// implement here

		for (int i = 0; i < list.length-1; i++) {
			int index = i;

			while (index >= 0 && list[i] > list[i + 1]) {
				int temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp; 
				index--;
			}
		}

//	        final long endTime = System.currentTimeMillis();
//	        final long executionTime = endTime - startTime;
//	        this.executionTime = executionTime;
		return list;
	}
}