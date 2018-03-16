package ConditionalStatement;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		
		String Q ="How old are you?";
		
		Scanner num = new Scanner(System.in);
		
		int age = num.nextInt();
		
		if(age < 21) {
			System.out.println("You Cannot Drink");
		}
		else if(age > 70){
			System.out.println("You are too old to drink !!!!");
		}
		else {
			System.out.println("You can Drink !!!");
		}
		
		
	}
	
}
