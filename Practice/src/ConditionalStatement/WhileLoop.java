package ConditionalStatement;

import java.util.Scanner; 
public class WhileLoop {

	public static void main (String [] args) {
		// While Loop!!!
		
		
		String msg ="Please enter a number 1 and 25";
		
		System.out.println(msg);
		
		Scanner a = new Scanner(System.in);
		
		
		int i = a.nextInt(); 
		
		if(i<=25 || i < 0) {
			System.out.println("The nnumber is within range!!!");
			while(i>0) {
				
				System.out.println(i);
				i--;
			}
			System.out.println("The Loop ended!");
		}
		else {
			System.out.println("The number is not within range!!!");
		}
		
		
	}
}
