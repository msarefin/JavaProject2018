package Homework3;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = { 3, 7, 9, 10, 6 };
		
		int n = arr.length; 
		
		for (int i = 1; i<=n; i++) {
			for(int j = 0; j<(n-1); j++) {
				int k = j+1; 
				int a = arr[j]; 
				int b = arr[k];
				if(b<a) {
					int temp1 = a; 
					int temp2 = b; 
					arr[j]= b; 
					arr[k]= a; 
					
				}
			}
		}
		for(int d = 0 ; d<n; d++) {
			System.out.println(arr[d]);
		}
	}

	
}
