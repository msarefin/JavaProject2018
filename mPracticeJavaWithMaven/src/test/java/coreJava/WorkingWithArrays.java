package coreJava;

import java.util.Scanner;

public class WorkingWithArrays {
	
	public static void main(String[] args) {
		
		int [] a = {2,3,5,23,22,42,54,23,13};
		
		System.out.println("Number of items in the Array: "+a.length);
		
		for(int i :a) {
			System.out.print(i+" | ");
		}
		
		System.out.println();
		int [] b = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		for(int x:b) {
			System.out.println("you entered "+ x);
		}
	}

}
