package oop;

public abstract class Transportation implements Dashboard {

	// super class or parent class

	protected String Mycar = "I love my Fararri !";
	
	
	
	Transportation() {

	}

	Transportation(String a) {
		System.out.println(a);
	}

	void wheels(int a) {
		System.out.print("The mode of transportatios has " + a + " wheels \n");
	}

	void wheels(int a, String b) {
		System.out.print("The mode of transportatios has " + a + b + "  \n");
	}

	void engine(String a) {
		System.out.println("The engine is a " + a);
	}

	abstract void body(String color);

}
