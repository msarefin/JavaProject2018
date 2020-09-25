package userInput;

import java.util.Scanner;

public class UserForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How Old are you:\n");
		Scanner sc = new Scanner(System.in);
		byte b = sc.nextByte();
		if (b < 18) {
			System.out.println("You are not old enough to drive !");
		} else if (b > 60) {
			System.out.println("You Are too old to drive!");

		} else {
			System.out.println("You can Drive!!");
		}
	}

}
