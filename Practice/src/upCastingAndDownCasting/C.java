package upCastingAndDownCasting;

public class C {

	C(){
		System.out.println("This is from class C");
	}
	void C1() {
		System.out.println("Hello From C");
	}
	
	public static void main (String[] args) {
		System.out.println("A a = new A();");
		System.out.println();
		A a = new A();
		a.A1();
		
		System.out.println();
		System.out.println("B b = new B();");
		System.out.println();
		B b = new B();
		b.A1();
		b.B1();
		b.B2();
		
//		upcasting
		
		System.out.println();
		
		System.out.println("upcasting :: A ab = b; || the same as A ab = new B();");
		System.out.println();
		A ab = b; // the same as A ab = new B();
		ab.A1();
		
//		downcasting
		
		System.out.println();
		System.out.println("Downcasting");
		System.out.println();
		
		B bb = (B)ab;
		bb.A1();
		bb.B1();
		bb.B2();
		
		
	}
}
