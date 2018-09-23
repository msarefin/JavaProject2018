package SortingAlgorithms;

import java.util.Random;

public class QuickSort {

	static int [] ar = new int[14];
	
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = rand.nextInt(100);
		}
		
		for(int i: ar) {
			System.out.print(i+" ");
		}
		
		quickSort(ar);
		
		System.out.println();
		
		for(int i: ar) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] quickSort(int[] array) {
		int[] list = array;
		// implement here

		qs(list, 0, list.length - 1);

		return list;
	}

	static void qs(int[] ar, int l, int r) {

		if (l >= r) {
			return;
		} else {
//			int pivot = ar[(l+r)/2];
			int pivot = ar[r];
			int mid = partition(ar, l, r, pivot);
			qs(ar, l, mid - 1);
			qs(ar, mid, r);
		}
	}

	static int partition(int[] a, int left, int right, int pivot) {
		int lft = left; 
		int rft = right-1; 
		
		while (lft <= rft) {
			while (a[lft] < pivot) {
				lft++;
			}

			while (rft>= 0 && a[rft] > pivot) {
				rft--;
			}
			if (lft <= rft) {
				int temp = a[lft];
				a[lft] = a[rft];
				a[rft] = temp;

				lft++;
				rft--;
			}
		}


		int temp = a[lft];
		a[lft] = a[right];
		a[right] = temp;
		return lft;
	}
}
