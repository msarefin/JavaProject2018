package Practice;

public class Food {

	// This a just a category or a CLASSifacation

	/*
	 * chocolatbars - sweet , nuts, cold, solid 
	 * samosa - veg, meat, spicy , salty ,solid 
	 * smoothie - fruit, sweet, cold, liquid
	 * 
	 */

	// -----------------------variable ara ------------------

	// primitive variable - byte, short, int, long, double and float, char, boolean
	// non-primitive - class, interfaces, enum, array

	String taste;
	static String content;
	String temp;

	// ---------------------constructor-----------------------

	Food() {
		System.out.println("I love my favorate Food!!");

		int num = 23;
		String greeting = "Hello";

		System.out.println(greeting);
	}
	
	
	
	Food(String msg) { //This constructor is  overloaded
		
		System.out.println(msg);

		int num = 23;
		String greeting = "Hello";

		System.out.println(greeting);
	}

	// -----------------------Method Area ---------
	// methods can have a return type or a non-return type

	void taste(String a, String msg1) {

		String msg = msg1;

		taste = a;
		System.out.println(msg + " " + taste);

	}

	void taste(String a) { // This method is over loaded

		taste = a;
		System.out.println(taste);

	}

	String fillings(String a) {

		content = a;
		return content;

	}

	String temperature(String Temperature) {
		return Temperature;

	}

	static void location() {
		System.out.println("Near my house");
	}

	static void reverse(int [] ar) {
		
		for(int i =(ar.length)-1;i >=0; i--) {
			System.out.println(ar[i]);;
		}
		
	}
	
	// ------------------------- main method ------------------------------

	public static void main(String[] args) {

		// -----------------------chocolatebar-----------------------------

		Food chocolatebar = new Food();

		chocolatebar.taste("Sweet", "chocolate bar tastes");

		String nut = chocolatebar.fillings("nuts");

		System.out.println(nut);
		System.out.println(chocolatebar.temperature("cold"));

		// ---------------------------------samosa------------------------

		Food samosa = new Food();
		samosa.taste("spicy", "samosa teates very");
		String meat1 = samosa.fillings("meat");

		System.out.println(samosa.fillings("meat"));
		System.out.println(meat1);

		location();

//		------------------------------ smoothie----------------
		
		Food smoothie = new Food("I like to get them form my local store");
		
		smoothie.taste("sweet");
		smoothie.taste("Very Very Sweet ", "I like them ");
		smoothie.taste("sweet");
	}

}
