package Homework3;

public class GrandParent {

	GrandParent(){
		System.out.println("Access Modifiers, Overloading, overriding, inheritance Q5");
	}
	
	String name; 
	int age;
	int children;
	boolean spouseAlive = true;
	
	
	
	
	public void Children (int a) {
		this.children = a; 
		System.out.println("I have "+this.children+" Children");
		
	}
	
	private void name (String name) {
		this.name = name; 
		System.out.println("Name is "+this.name);
	}
	
	void age(int a) {
		this.age = a; 
		System.out.println(this.age+" years old");
	}
	
	protected  boolean Spouse(boolean alive) {
		this.spouseAlive = alive;
		if(this.spouseAlive == true) {
			System.out.println("Spouse is still alive");
		}
		else {
			System.out.println("Spouse is Dead");
		}
		return spouseAlive;
		
		
	}
	
	
	
	public static void main(String [] args) {
		GrandParent gp = new GrandParent();
		
		gp.name("Alexander");
		gp.Children(15);
		gp.Spouse(false);
		gp.age(73);
		
		System.out.println(gp.name);
		System.out.println(gp.children);
		System.out.println(gp.age);
		System.out.println(gp.spouseAlive);
		
	}
}
