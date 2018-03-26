package objectsAndClasses;

public class A {

//	public class 
//	private attributes
	
	private int maxSpeed; 
	private int wheels; 
	private String color;
	private double fuelCapacity; 
	
	/*
	 * Class can either be public or default
	 * method and attributes can be public, default, protected and private
	 * 
	 * Public class - is accessable by any other class
	 * Default class - is accessable by any class within the same package
	 * 
	 * public class - accessable from any other class 
	 * default class - accessable from any other class within the same package
	 * protected class - accessable from any other class within the same package across sub-classes
	 * private class - accessable only from the declared class  
	 */
	
	String DefaultString = "This is a Default String From Class A";
	public String PublicString = "This is a public Stirng From Class A";
	private String PrivateString = "This is a private Stirng From Class A";
	protected String ProtectedString = "This is a protected String From Class A";
	
	
//	public method 
	public void horn() {
		System.out.println("Beep!");
	}
	
	void aDefault() {
		System.out.println("This is a default method in a public Class A");
	}
	
	public void aPublic() {
		System.out.println("This is a public method ia a public class A");
	}
	
	private void aPrivate() {
		System.out.println("This is private method in a public class A");
	}
	protected void aProtected() {
		System.out.println("This is a protected method in a public class A");
	}
	
	
	public static void main (String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.horn();
		a.aDefault();
		a.aPublic();
		a.aPrivate();
		a.aProtected();
		
		c.cDefault();
		c.cPublic();
		c.cProtected();
		
		System.out.println(a.DefaultString); //default String an be accessed 
		System.out.println(a.PublicString); //public String can be accessed
		System.out.println(a.PrivateString); //private String can be accessed
		System.out.println(a.ProtectedString); //protected String can be accessed
		
		System.out.println(c.defaultStringsC);
		System.out.println(c.publicStringsC);
		System.out.println(c.protectedStringsC);
		
		
	}
}
