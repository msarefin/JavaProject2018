package SortingAlgorithms;

import java.util.Random;

public class ms {

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

	static int[] mergeSort(int[] ar) {

		int[] list = ar;

//		temp = new int [list.length];
		ms(list, 0, list.length - 1);

		return list;
	}

	static int [] x; 
	
	static int[] ms(int[] ar, int s, int e) {

		
		if(s!=e) {

		int m = s+(e-s) / 2;

		int[] a = ms(ar, s, m);
		int[] b = ms(ar, m+1, e);
		int[] c = merge(a, b);
		
		x= c; 
		}
		
		return x; 
	}

	static int[] merge(int[] a, int[] b) {

		int i = 0;
		int j = 0;
		int k = 0;
		int[] r = new int[a.length + b.length];

		while (i != a.length && j != b.length) {

			if (a[i] < b[j]) {
				r[k] = a[i];
				i++;
				k++;
			} else if (a[i] == b[j]) {
				r[k] = a[i];
				i++;
				j++;
				k++;
			} else if (a[i] > b[j]) {
				r[k] = b[j];
				j++;
				k++;

			}
			
			
		}
		
		if(i<a.length) {
			while(i!=a.length) {
				r[k] = a[i];
				k++; i++; 
			}
		}else if(j<b.length) {
			while(j!=b.length) {
				r[k] = b[j]; 
				k++; j++; 
			}
		}

		return r;
	}
}
