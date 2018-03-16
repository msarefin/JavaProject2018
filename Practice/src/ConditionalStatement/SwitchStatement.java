package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String [] args) {
		
		String com = "Please Select a Number from 1 to 7 ";
		String Sun = "Sunday";
		String Mon = "Monday";
		String Tue = "Tuesday";
		String Wed = "Wednesday";
		String Thu = "Thursday";
		String Fri = "Friday";
		String Sat = "Saturday";
		
		System.out.println(com);
		Scanner i = new Scanner(System.in);
		
		int day = i.nextInt();
		
		switch(day) {
		case 1:
			System.out.println(Sun);
			break;
		
		case 2:
			System.out.println(Mon);
			break;
		
		case 3:
			System.out.println(Tue);
			break;
			
		case 4:
			System.out.println(Wed);
			break;
			
		case 5:
			System.out.println(Thu);
			break; 
			
		case 6:
			System.out.println(Fri);
			break; 
			
		case 7: 
			System.out.println(Sat);
			
		default:
			System.out.println("You have not select a number from 1 to 7 !");
			
		}
		
	}

}
