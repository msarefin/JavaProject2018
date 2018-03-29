package oopInheritance;

class Dog extends Animal{

	Dog(){// This is a constructor
		legs =4;
		//eyes = 2; // cannot be accesses from the parent class
		color = "gray";
	}
	
	public static void main(String[] args) {
	
		Dog a = new Dog();
		
		System.out.println();
		System.out.println("Dogs have "+a.legs+" legs");
		System.out.print(a.color);
	}
	

}
