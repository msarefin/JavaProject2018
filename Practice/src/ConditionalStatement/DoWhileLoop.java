package ConditionalStatement;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String [] args) {
		// Do While Loop!!
		
		
		
		System.out.println("Please enter the first number");
		
		Scanner first = new Scanner(System.in);
		int a = first.nextInt();
		System.out.println("Please Enter the Second Number");
		
		Scanner second = new Scanner(System.in);
		int b = second.nextInt(); 
		
		if(a<b) {
		
			//Do while loop
			do {
				System.out.println(a);
				a++;
			}
			while(a<=b);
			
		}
		else {
			System.out.println("The first number must be smaller than the second number you entered!");
			
		}
	}
}
