package casting;
//------------------------Class A ----------------------------------

class A{
	void mks() {
		System.out.println("This from class A");
		
	}
	
	
}

//------------------------Class B ----------------------------------

class B extends A{
	void mks() {
		System.out.println("This is from clas B ");
	}
	
	void lgs(int l) {
		System.out.println(l);
	}
}

//------------------------Class DownCasting (main class) ----------------------------------


public class DownCasting {

	public static void main(String[] args) {
		A a = new A();
		a.mks();
		
		B b = new B();
		b.mks(); // Meow
		b.lgs(4); //4
		
		System.out.println();
//		Upcasting
		
		
		System.out.println("***************upcasting**************");
		A a1 = b; 
		
		// Same as A a1 = new B();
		a1.mks(); // This is from class B 
		
		System.out.println();
//		Downcasting
		
		System.out.println("*******************Downcasting****************");
		B b1 = (B)a1;
		b1.mks(); // This is from class B 
		b1.lgs(3); // 3
		
		
	}
}
