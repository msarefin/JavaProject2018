package oopOverridingAndOverloading;

public class Animal {

	Animal(){
		System.out.println("This is the animal kingdom");
	}
	
	// --------------This is overloading------------------
	int max(int a, int b) {
		if (a>b) {
			return a; 
		}
		else {
			return b; 
		}
	}
	
	double max(double a, double b) {
		if (a>b) {
			return a;
		}
		else {
			return b; 
		}
	}
	
	//------------------- The method below will be overridden -----------------
	
	public void makeSound() {
		System.out.println("Grr....");
	}
	
	public void name(String name){
		System.out.println("Hello "+name);
	}
}
