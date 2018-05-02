package Alphabet;

public class A { // This is a public class and can be accessed by any other class within the project
//	A class is a blueprint, description or a definition of an object
	
	String msg = "This is a message from A";
	
	public A(){
		System.out.println("This is a constructor");
	}
//	A constructor is a block of code that is similar to a method that has the same name as the class 
//	it is called when an instance of the class is created 
//	Constructors are non-return type 
	
	public A(String a) {
		System.out.println(a);
	}
	
	public static String StaticStringReturenType (String variable) {
		
		return "You said "+variable;
	}
	
	public static void PublicMethod() {
		System.out.println("Public methods are accessable by any other class");
	}
	/*
	 * static methods and variables belong to the class rather than to the instance
	 * only one instance of a static method or variable exist even if you create multiple objects of the class
	 */
	
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protectedmethod(){
		System.out.println("This is a protected method");
	}
	
	

	public static void main (String[] args) {
		
		String name = "Alexander";
		B b = new B(name);
		
		
		
		System.out.println("Hello world!");
	}
}
