package coreJava;

import java.util.Random;

//Java implementation of ShellSort
class ShellSort {

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static int loopcount;

	int sort(int arr[]) {

		int n = arr.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < n; i += 1) {

				int temp = arr[i];

				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				arr[j] = temp;

				loopcount++;
			}
		}
		return 0;
	}

	public static void main(String args[]) {
		int arr[] = new int[10];

		Random rand = new Random();
		
		

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}

		System.out.println("Array before sorting");
		printArray(arr);

		ShellSort ob = new ShellSort();
		ob.sort(arr);

		System.out.println("Array after sorting");
		printArray(arr);

		System.out.println("Loop Counter : \n" + loopcount);
	}
}
