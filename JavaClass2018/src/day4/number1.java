package day4;

public class number1 {

	public static void main(String[]args){
		

		sumofint(20);
	}
	
	public static void sumofint(int a){
		int sum = 0; 
		
		for (int i = 0; i<=a; i++){
			sum = sum+i; 
		}
		System.out.println("Here is the sum of 1 to "+a+":::::: "+sum);
	}
}
