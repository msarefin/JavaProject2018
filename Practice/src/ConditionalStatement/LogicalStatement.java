package ConditionalStatement;

import java.util.Scanner;

public class LogicalStatement {
	public static void main(String[]args) {
		/*
		System.out.println("How old are you ?");
		
		Scanner a = new Scanner(System.in);
		
		int age = a.nextInt();
		
		if(age >=18) {
			System.out.println("How much money do you have ?");
			Scanner b = new Scanner(System.in);
			
			double money = b.nextDouble();
			
			if(money >=500) {
				System.out.println("welcome!");
			}
			
			}
			*/
		
		
		System.out.println("how old are you?");
		
		Scanner a = new Scanner(System.in);
		
		int age = a.nextInt();
		
		System.out.println("How much money you have ?");
		
		Scanner b = new Scanner(System.in);
		
		double money = b.nextDouble();
		
		/*
		if (age >18 && money>=500) {
			
			System.out.println("Welcome!!");
			
		}
		*/
		
		/*
		if(age >=18 || money >=500) {
			System.out.println("That will do !!");
		}
		*/
		
		if(!(age<18)) {
			
			System.out.println("You are old enough !!");
			
		}
		else {
			System.out.println("You are not old enough !!");
		}
		
		}

}
