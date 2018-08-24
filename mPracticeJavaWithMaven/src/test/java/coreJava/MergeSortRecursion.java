package coreJava;

import java.util.Random;

public class MergeSortRecursion {

	static int[] arr;
	static int[] temp;

	public static void main(String[] args) {
		arr = new int[13];
		temp = new int[arr.length];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}

		System.out.println("\n");

		mergeSort(0, arr.length - 1);

		for (int in : arr) {
			System.out.print(in + " ");
		}

	}

	static void mergeSort(int l, int h) {

		for (int i = 0; i <= h; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("");

		if (l != h) {
			int m = l + (h - l) / 2;
			mergeSort(l, m);
			mergeSort(m + 1, h);

			sort(l, m, h);
		}

	}

	static void sort(int l, int m, int h) {

		for (int i = l; i <= h; i++) {

			temp[i] = arr[i];

		}

		int p1 = l;
		int p2 = m + 1;
		int ic = l;

		while (p1 <= m && p2 <= h) {
			if (temp[p1] >= temp[p2]) {
				arr[ic] = temp[p2];
				p2++;
			} else {
				arr[ic] = temp[p1];
				p1++;

			}

			ic++;
		}

		while (p1 <= m) {
			arr[ic] = temp[p1];
			ic++;
			p1++;

		}

	}

}
