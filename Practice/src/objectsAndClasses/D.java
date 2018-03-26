package objectsAndClasses;

public class D {

	public static void main (String[] args) {
		C c = new C();
		
		c.cDefault();
		c.cPublic();
		c.cProtected();
		
		
		System.out.println(c.defaultStringsC);
		System.out.println(c.publicStringsC);
		System.out.println(c.protectedStringsC);

	}
	
}
