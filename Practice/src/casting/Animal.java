package casting;

public class Animal {

	Animal(){
		System.out.println("This is an Animal Constructor");
		
		
	}
	
	void makeSound() {
	
		System.out.println("Sound");
	}
	
	void legs(int l) {
		System.out.println(l);
	}
	
	public static void main () {
		Animal a = new Cat();
	}
}
