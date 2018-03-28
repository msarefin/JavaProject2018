package staticKeyword;

public class MyClass {

	public static void main(String[]args) {
		
		Counter c = new Counter();
		Counter d = new Counter();
		Vehicle v = new Vehicle();
		
		System.out.println(Counter.COUNT); // the variable is public static . Public means it can be access by all. Static means that you can call it without creating an instance for the class
		
		Vehicle.horn(); // You can call static method without creating an instance of the class
		
		v.horn();
		
	}
}
