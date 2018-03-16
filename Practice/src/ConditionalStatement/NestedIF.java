package ConditionalStatement;

import java.util.Scanner;

public class NestedIF {

	public static void main(String[]args) {
		
		String q = "How old are you?";
		
		
		
		System.out.println(q);
		
		Scanner num = new Scanner(System.in);
		
		int age = num.nextInt(); 
		
		if(age<21) {
			if(age<16) {
				System.out.println("You cannot get Learner Permit!");
			}
			else if(age == 16) {
				System.out.println("You can only get a learner Permit!!");
			}
			else {
				System.out.println("You can Drive with Your Parents Premission!!");
			}
		}
		else if(age >70) {
			System.out.println("You are no Longer Elegable to Drive!!!");
		}
		else {
			System.out.println("You can Drive!!");
		}
		
		
	}
}
