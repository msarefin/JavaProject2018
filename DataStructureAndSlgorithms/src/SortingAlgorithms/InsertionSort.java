package SortingAlgorithms;

import java.util.Random;

public class InsertionSort {

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

	  public static int[] insertionSort(int [] array){
	        final long startTime = System.currentTimeMillis();
	        int [] list = array;
	        //implement here

	        for(int i = 1; i<list.length; i ++){
	            int temp = list[i];
	            int j = i-1; 
	            while(j>=0 && list[j]>temp) {
	            	list[j+1] = list[j];
	            	j--;
	            }
	            list[j+1] = temp; 
	        }

//	        final long endTime = System.currentTimeMillis();
//	        final long executionTime = endTime - startTime;
//	        this.executionTime = executionTime;
	        return list;
	    }
}