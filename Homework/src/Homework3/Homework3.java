package Homework3;

import java.util.Arrays;

public class Homework3 {

	public static void main(String[] args) {
		int [] a = {3,7,9,10,6};
		
		System.out.println(a.length);
		
//		Array Values
		System.out.println("Unsorted Array");
		for (int n: a) {
			System.out.println(n);
		}
		
		System.out.println();
		System.out.println("Sorted Array");
		Arrays.sort(a);
		
		for (int n: a) {
			System.out.println(n);
		}
	}
}
