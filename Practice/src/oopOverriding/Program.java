package oopOverriding;

public class Program {

	public static void main(String[] args) {
		
		Animal x = new Lion();
	
		x.makeSound(); // Executed the method from the class Lion
		x.name("Alex"); //Executed the method from the class Animal because lion inherits Animal
		
		Animal y = new Animal();
		
		y.makeSound(); // only executes method from the class Animal 
		
		
		Lion l = new Lion();
		
		l.makeSound(); // only picks up methods from the class Lion
	}
	
}
