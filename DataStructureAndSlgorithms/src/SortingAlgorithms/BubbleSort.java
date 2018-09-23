package SortingAlgorithms;

import java.util.Random;

public class BubbleSort {

	static int [] ar = new int [14];
	
	public static void main(String[] args) {
		Random rand = new Random(); 
		
		for(int i = 0; i<ar.length;i++) {
			ar[i] = rand.nextInt(100);
		}
		
		for(int n : ar) {
			System.out.print(n+" ");
		}
		
		bubbleSort(ar);
		
		System.out.println();
		for(int n : ar) {
			System.out.print(n+" ");
		}
		
		
	}
	
	static int [] bubbleSort (int [] ar){
		int[] list = ar; 
		
		for(int i =0; i<list.length-1; i++) {
			for(int j = 0; j<list.length-1; j++) {
				while(list[j]>list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp; 
				}
			}
			
		}
		
		
		return list;
	}
	
}
