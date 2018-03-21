package day4;

public class number1 {

	public static void main(String[]args){
		

		sumofint(20);
		sumofint(32);
		
		adding(23,12);
	}
	
//	Here is how to create a Java function or java Method
	
	public static void sumofint(int a){
		int sum = 0; 
		
		for (int i = 0; i<=a; i++){
			sum = sum+i; 
		}
		System.out.println("Here is the sum of 1 to "+a+":::::: "+sum);
	}
	
//	Creating a new method 
	public static void adding(int a, int b){
		int c = a+b; 
		System.out.println("The Sum id "+ c);
	}
}
