package objectsAndClasses;

public class A {

//	public class 
//	private attributes
	
	private int maxSpeed; 
	private int wheels; 
	private String color;
	private double fuelCapacity; 
	
	String p = "This is a Default String From Class A";
	public String x = "This is a public Stirng From Class A";
	private String y = "This is a private Stirng From Class A";
	protected String z = "This is a protected String From Class A";
	
	
//	public method 
	public void horn() {
		System.out.println("Beep!");
	}
	
	public static void main (String[] args) {
		
		A a = new A();
		a.horn();
		
		System.out.println(a.p); //default String an be accessed 
		System.out.println(a.x); //public String can be accessed
		System.out.println(a.y); //private String can be accessed
		System.out.println(a.z); //protected String can be accessed 
	}
}
