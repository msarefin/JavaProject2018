package oopEncapsualtion;

public class BankAccount {

	private double bal;
	private final String msg = "Your balance is $";

	public void deposit(double x) {
		if (x > 0) {
			bal += x;

		}
		System.out.println(msg + bal);
	}

	BankAccount() { // This is a java constructor
		System.out.println("This is Encapsualtion");
	}

}
