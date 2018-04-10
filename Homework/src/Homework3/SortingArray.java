package Homework3;

import java.util.Arrays;

public class SortingArray {

	SortingArray(){
		System.out.println("Sorting the Array Q1");
	}
	
	public static void main(String [] args) {
		Homework3 h = new Homework3();
		
//		Unsorted Array
		System.out.println("Unsorted Array");
		for(int a:h.a1) {
			System.out.print(a +" ");
		}
		
		System.out.println();
		
//		Sorted using sort
		System.out.println("Sorted Array usng sort");
		
		Arrays.sort(h.a1);
		for(int a:h.a1) {
			System.out.print(a+" ");
		}
		System.out.println();
		
//		Sorting using for loop 
		
		System.out.println("Descending");
		int temp; 
		for(int i = 0; i <h.a1.length; i++) {
			for(int j = 0; j<h.a1.length;j++) {
				if(h.a1[i]>h.a1[j]) {
					temp = h.a1[i];
					h.a1[i] = h.a1[j];
					h.a1[j] = temp;
				}
			}
		}
		for(int a: h.a1) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Acending");
		
		for(int i = 0; i <h.a1.length; i++) {
			for(int j = 0; j<h.a1.length;j++) {
				if(h.a1[i]<h.a1[j]) {
					temp = h.a1[i];
					h.a1[i] = h.a1[j];
					h.a1[j] = temp;
				}
			}
		}
		for(int a: h.a1) {
			System.out.print(a+" ");
		}
	}

}
