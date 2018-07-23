package coreJava;

import java.util.Scanner;

public class WorkingWinthScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(sc.nextLine());
		
		int a = sc.nextInt();
		String b = sc.nextLine();
		
		if(!String.valueOf(a).isEmpty()) {
			System.out.println(a);
		}else if(!b.isEmpty()) {
			System.out.println(b);
		}else {
			System.out.println("the value is empty");
		}
		
		
	}
}
