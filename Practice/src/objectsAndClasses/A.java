package objectsAndClasses;

public class A {

//	public class 
//	private attributes
	
	private int maxSpeed; 
	private int wheels; 
	private String color;
	private double fuelCapacity; 
	
	String p = "This is a Default String";
	public String x = "This is a public Stirng";
	private String y = "This is a private Stirng";
	protected String z = "This is a protected String";
	
	
//	public method 
	public void horn() {
		System.out.println("Beep!");
	}
	
	public static void main(String[] args) {
		A.a = new A();
		
		
	}
}
