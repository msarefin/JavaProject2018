package casting;

public class Program {
	public static void main (String[] args) {
//		Animal a = new Cat();
		Animal b = new Animal();
		
		Animal c = new Cat();
		
		Cat d = (Cat)c;
		
		((Cat)c).makeSound();
		
		
		b.makeSound();
//Cannot call this method		b.color();
		c.makeSound();
//Cannot call this method		c.color();
		d.makeSound();
		d.color();
		((Cat)c).color();
	}
}
