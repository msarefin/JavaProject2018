package casting;

public class Animal {

	Animal(){
		System.out.println("This is an Animal Constructor");
		
		
	}
	
	void makeSound() {
	
		System.out.println("Sound");
	}
	
	void legs(int l) {
		System.out.println(l);
	}
	
	public static void main (String [] args) {
		Animal a = new Cat(); 
		// This is UpCasting . Java Automatically UpCast the Cat variable to the Animal Variable
		Animal b = new Animal ();
		
		((Cat)b).makeSound();
		
		
		a.makeSound();
		a.legs(2);
	}
}
