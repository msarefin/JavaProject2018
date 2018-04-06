package casting;

class A{
	void mks() {
		System.out.println("This from class A");
		
		B b2 = new B();
		b2.mks();
		b2.lgs(5);
		
		A aa = new B();
		aa.mks();
		
		B bb = (B)aa;
		
	}
}

class B extends A{
	void mks() {
		System.out.println("This is from clas B ");
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
		b.mks(); // Meow
		b.lgs(4); //4
		
		System.out.println();
//		Upcasting
		
		A a1 = b; 
		
		// Same as A a1 = new B();
		a1.mks(); // This is from class B 
		
		System.out.println();
//		Downcasting
		
		B b1 = (B)a1;
		b1.mks(); // This is from class B 
		b1.lgs(3); // 3
		
		
	}
}
