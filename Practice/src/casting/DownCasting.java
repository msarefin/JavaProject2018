package casting;

class A{
	void mks() {
		System.out.println("Noise");
	}
}

class B extends A{
	void mks() {
		System.out.println("Meow");
	}
	
	void lgs(int l) {
		System.out.println(l);
	}
}

public class DownCasting {

	public static void main(String[] args) {
		A a = new A();
		a.mks();
		
		B b = new B();
		b.mks();
		b.lgs(4);
		
		
//		Upcasting
		
		A a1 = b; // Same as A a1 = new B();
		a1.mks();
		
//		Downcasting
		
		B b1 = (B)a1;
		b1.mks();
		b1.lgs(3);
		
		
	}
}
