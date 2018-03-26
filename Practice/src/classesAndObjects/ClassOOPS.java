package classesAndObjects;

public class ClassOOPS {

	static void OOPSMethod(String name) {
		
		
		
		System.out.println("Hello "+ name);
	}
	
	public static void main (String[] args) {
		OOPSMethod("Sunny");
		OOPSMethod("Danile");
		OOPSMethod("Stanley");
		
		Animal dog = new Animal();
		
		
		System.out.print(dog.dogs);
		dog.bark();
		
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(); 
		v1.color = "red";
		v1.horn();
		v1.fuelCapacity = 12.5;
		v1.maxSpeed = 180;
		v1.wheels =4; 
		
		System.out.println(v1.color);
		System.out.println(v1.fuelCapacity);
		System.out.println(v1.maxSpeed);
		System.out.println(v1.wheels);
		
		v2.horn();
		
	}
	
}
