package Alphabet;

class B { // This is a default class only accessable by nay other class withing the package

	Byte b = 1; 
	short s = 12; 
	int i = 14; 
	long l = 100; 
	double d = 1000; 
	float f = 40000f; 
	
	String Greetings = "Hello ";
	
	public B () {
		System.out.println(Greetings);
	}
	
	protected B (String n,String m) {
		System.out.println(Greetings.concat(n).concat(" and ").concat(m));
	}
	
	B(String name){  //This is a Default constructor
		System.out.println(Greetings.concat(name));
	}
	
	private B(String a, String b, String c) {
		System.out.println(Greetings.concat(a).concat("and").concat(b).concat("and").concat(c));
	} 
//	This constructer cannot be called in any other class. It can only be called in this class
	
	
	public char character = 'c';
	String msg = "This a string";

	public void PublicMethod() {
		System.out.println("Public methods are accessable by any other class");
	}
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protectedmethod(){
		System.out.println("This is a protected method");
	}
	
	void defaultmethod() {
		System.out.println("This is a default method");
	}
	
}
