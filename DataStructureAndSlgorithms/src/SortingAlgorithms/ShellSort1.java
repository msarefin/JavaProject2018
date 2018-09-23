package SortingAlgorithms;

import java.util.Random;

public class ShellSort1 {
	static int[] ar = new int[14];

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);

		}

		for (int n : ar) {
			System.out.print(n + " ");
		}

		shellSort(ar);

		System.out.println();
		for (int n : ar) {
			System.out.print(n + " ");
		}
	}

	public static int[] shellSort(int[] array) {
		int[] list = array;
		// implement here

		int n = list.length;

		for (int g = n / 2; g > 0; g /= 2) {
			for (int i = g; i < n; i++) {
				int temp = list[i];
				
				int j;
				for(j=i; j>=g && list[j-g]>temp;j-=g ) {
					list[j] = list[j-g];
				}
				list[j] = temp;
			}
		}
		return list;

	}

}
