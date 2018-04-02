package casting;

public class Program {
	public static void main(String[] args) {
		
		Animal b = new Animal();
		
		b.makeSound();// Output - Sound
		// Cannot call this method b.color();
//---------------------------------------------------
		Animal c = new Cat();

		c.makeSound();// Output - Meow
		// Cannot call this method c.color();
//---------------------------------------------------
		Cat d = (Cat) c;

		d.makeSound(); //Output - Meow
		d.color();// Output - Black
		((Cat) c).makeSound();//Output - Meow
		((Cat) c).color();//Output - Black
	}
}
