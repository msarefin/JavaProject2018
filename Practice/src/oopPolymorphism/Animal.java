package oopPolymorphism;

class Animal {

	void Animal() {
		System.out.println("This is a constructer from the Animal class");
	}

	public void makeSound() {

		System.out.println("Grr..");

	}

}

//class A extends Animal{
//	void A() {
//		System.out.println("Constructor from A");
//	}
//	
//	public void makeSound() {
//		System.out.println("AAA");
//	}
//}
//
//class B extends Animal{
//	void B() {
//		System.out.println("Constructor from B ");
//	}
//	
//	public void makeSound() {
//		System.out.println("BBB");
//	}
//}
//
//class P{
//	public static void main (String[] args) {
//		Animal x = new Dog();
//	}
//}