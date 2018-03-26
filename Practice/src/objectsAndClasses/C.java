package objectsAndClasses;

class C {
//	This is a default class and can only be accessed within the same package
	
	String defaultStringsC = "This is a default string on a default class C";
	public String publicStringsC = "This is a public string in a default class C";
	private String privateStringsC = "This is a private String in a default class C";
	protected String protectedStringsC ="This is protected String in a default class C";
	
	void cDefault() {
		System.out.println("This is a default method from a default class C");
	}
	
	public void cPublic () {
		
		System.out.println("This is a public method from  a default class C");
	}
	private void cPrivate() {
		System.out.println("This is a private method from a default class C");
	}
	protected void cProtected() {
		System.out.println("This is a prtected method from a default class C");
	}
	
	public static void main (String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.aDefault();
		a.aPublic();
		a.aProtected();
		
		c.cDefault();
		c.cPublic();
		c.cPrivate();
		c.cProtected();
		
		System.out.println(c.defaultStringsC);
		System.out.println(c.publicStringsC);
		System.out.println(c.privateStringsC);
		System.out.println(c.protectedStringsC);
		
		
	}
	
}
