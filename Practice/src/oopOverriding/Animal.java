package oopOverriding;

public class Animal {

	Animal(){
		System.out.println("This is the animal kingdom");
	}
	
	public void makeSound() {
		System.out.println("Grr....");
	}
	
	public void name(String name){
		System.out.println("Hello "+name);
	}
}
