package PracticeingJava;

public class Nokia3310 extends nokia implements NokiaInterface {

	private static String ep = "Ear piece doubles as a speaker phone";

	Nokia3310(String model) {
		super(model);
	}

	String model = super.model;

	public static void main(String[] args) {

		Nokia3310 n3 = new Nokia3310("Nokia 3310");
		System.out.println();
		n3.mic();
		n3.EarPiece();
		n3.NumKey();
		n3.receiver();
		n3.homekey();
		n3.cancelKey();
		n3.leftkey();
		n3.rightkey();
		n3.screen();

		Phone p = new Phone();

		Phone.barcode bc = p.new barcode();
		
		int price = (int) bc.price(325.00);

		String model = n3.model; 
		
		System.out.println("The price of " + model + " is $" + price);
	}

	public void homekey() {
		System.out.println("one Key to with multiple functions");

	}

	public void cancelKey() {
		System.out.println("Cancels previous actions");

	}

	public void leftkey() {
		System.out.println("navigates left");

	}

	public void rightkey() {
		System.out.println("navigates right");

	}

	public void screen() {
		System.out.println("The screens displays everything !");

	}

}
