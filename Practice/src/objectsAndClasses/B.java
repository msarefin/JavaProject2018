package objectsAndClasses;

public class B {

	public static void main (String [] args) {
		
		A a = new A();
		
		a.horn();
		
		System.out.println(a.p); //default string from class A can be accessed here
		System.out.println(a.x); //public String  from class A can be accessed here
		
//		a.y private cannot be accessed from class A 
		
		System.out.println(a.z);
	}
	
}
