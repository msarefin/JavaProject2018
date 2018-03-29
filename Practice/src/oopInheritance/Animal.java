package oopInheritance;

class Animal {

	Animal(){
		System.out.println("This is from the parent Animal Class");
	}
	
	protected int legs; 
	private int eyes; // private variable are not visible to the sub-class
	String color; 
	public void eat() {
		System.out.println("Animal eats");
		
	}
	
	public void makeSound() {
		System.out.println("Hi !");
	}
}
