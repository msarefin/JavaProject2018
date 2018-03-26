package objectsAndClasses;

public class B {

	public static void main (String [] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.horn();
		a.aDefault();
		a.aPublic();
		a.aProtected();
		c.cDefault();
		c.cPublic();
		c.cProtected();
		
		
		System.out.println(a.DefaultString); //default string from class A can be accessed here
		System.out.println(a.PublicString); //public String  from class A can be accessed here
		
//		a.y private cannot be accessed from class A 
		
		System.out.println(a.DefaultString);
		System.out.println(a.PublicString);	
		System.out.println(a.ProtectedString);
		//Private strings are not accessable from here
		
		System.out.println(c.defaultStringsC);
		System.out.println(c.publicStringsC);
		System.out.println(c.protectedStringsC);
		//private string is not accessable
	}
	
}
