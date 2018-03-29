package oopsConcept;

public class BankAccount {

	private double balance = 0;

	public void deposit(double x) {
		if (x > 0) {
			balance += x;
		}
	}

	private int age = 0;

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	// ---------------------------------------------

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();

		ba.deposit(50000);
		ba.setAge(25);
		
		
	}

}
