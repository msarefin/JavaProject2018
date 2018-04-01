package oopOverridingAndOverloading;

public class Program {

	public static void main(String[] args) {

		Animal x = new Lion();
		Lion l = new Lion();
		Animal y = new Animal();

		x.makeSound(); // Executed the method from the class Lion
		x.name("Alex"); // Executed the method from the class Animal because lion inherits Animal

		y.makeSound(); // only executes method from the class Animal

		l.makeSound(); // only picks up methods from the class Lion

		x.max(12, 25);
		x.max(13.51, 65.4);
		l.max(12, 17, 35);
		y.max(35, 25);
		
		System.out.println(x.max(12, 25));
		System.out.println(x.max(13.51, 65.4));
		System.out.println(l.max(12, 17, 35));
		System.out.println(y.max(35, 25));
	}

}
