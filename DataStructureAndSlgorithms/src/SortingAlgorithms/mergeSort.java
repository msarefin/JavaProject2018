package SortingAlgorithms;

import java.util.Random;

public class mergeSort {

	static int[] ar = new int[14];

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);

		}

		for (int n : ar) {
			System.out.print(n + " ");
		}

		mergeSort(ar);

		
		System.out.println();
		for (int n : ar) {
			System.out.print(n + " ");
		}

	}

	static int [] temp;
	
	static int[] mergeSort(int[] ar) {

		int[] list = ar;

		temp = new int [list.length];
		ms(list, 0, list.length - 1);

		return list;
	}

	
	static void ms(int[] ar, int s, int l) {
		
		if(s!=l) {
			int m = s+(l-s)/2;
			ms(ar, s, m);
			ms(ar,m+1,l);
			
			sort(temp,ar,s,m,l);
		}
		
	}

	static void sort(int [] t, int [] a, int s, int m , int  l ) {
		for( int i =0 ; i<=l; i++) {
			t[i] = a[i];
		}
		

		
		int p1 = s;
		int p2 = m + 1;
		int ic = s;

		while (p1 <= m && p2 <= l) {
			if (t[p1] >= t[p2]) {
				a[ic] = t[p2];
				p2++;
			} else {
				a[ic] = t[p1];
				p1++;

			}

			ic++;
		}

		while (p1 <= m) {
			a[ic] = t[p1];
			ic++;
			p1++;

		}
		
		
	}

}
