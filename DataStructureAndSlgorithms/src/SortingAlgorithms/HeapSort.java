package SortingAlgorithms;

import java.util.Random;

public class HeapSort {

	static int[] ar = new int[14];

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(100);

		}

		for (int n : ar) {
			System.out.print(n + " ");
		}

		heapsort(ar);

		
		System.out.println();
		for (int n : ar) {
			System.out.print(n + " ");
		}

	}
	
	
	public static int[] heapsort(int[]array){
		int[] list = array; 
		
		int n = list.length; 
		
		for(int i = n/2-1; i>=0; i--) {
			heapify(list, n, i);
		}
		
		for(int i = n-1; i>=0; i--) {
			int temp = list[0]; 
			list[0]= list[i]; 
			list[i] = temp;
			
			heapify(list, i, 0); 
		}
		
		return list; 
	}
	
	static void heapify(int [] arr, int n, int i) {
		int root = i; 
		int l = 2*i+1; 
		int r = 2*i+2; 
		
		if(l < n && arr[l]>arr[root]) {
			root = l; 
		}
		
		if(r < n && arr[r] > arr[root]) {
			root = r; 
		}
		if(root != i) {
			int temp = arr[i];
			arr[i] = arr[root];
			arr[root] = temp;
			
			heapify(arr, n, root);
		}
	}
	
}
