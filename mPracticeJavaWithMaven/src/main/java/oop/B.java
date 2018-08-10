package oop;

public class B{

	B(){
		System.out.println("from B *******");
	}
	
void m() {
		
		
		System.out.println("m from B");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		
		a.input(23, 15);
		
		a.output();
	}
	
	
	
}
