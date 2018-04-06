package comparingObjects;

public class MyClass {

	/*
	 * when you compare objects using the equality testing operator (==), 
	 * it actually compares the references and not the object values.
	 */
	
	public static void main (String[] args) {
		Animal a1 = new Animal("Robby");
		Animal a2 = new Animal("Robby");
		System.out.println(a1==a2);
		System.out.println(a1.name==a2.name);
		System.out.println(a1.equals(a2));
	}
}
