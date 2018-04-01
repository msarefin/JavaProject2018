package oopOverridingAndOverloading;

public class Lion extends Animal {

	
	//---------------The method below will be overridden-----------------------------
	public void makeSound() {
		System.out.println("Roar");
	}
	
	// ---------------This is overloading -----------------
	
	int max(int a, int b , int c) {
		
		if(a>b && a>c) {
			return a; 
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c; 
			
		}
	}
	
	
	
}
