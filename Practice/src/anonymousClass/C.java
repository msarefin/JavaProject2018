package anonymousClass;

class C {

	C()	{
		System.out.println("Hello from C");
	}
	
	public static void main(String [] args) {
		
		
		
		A a = new A() {
			public void status() {
				System.out.println("Shutting down... ");
			}
		};
		
		B  b = new B() {
			public void status () {
				System.out.println("Suspended");
			}
		};
		
		// The classes are extended on the fly
		
		A a1 = new A();
		a.status();
		a1.status();
		b.status();
	}
}
