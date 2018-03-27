package getterAndSetterMethods;

public class GetterSetter {

	public static void main (String[] args) {
		Vehicle v = new Vehicle();
		
		v.setColor("red");
		System.out.println(v.getColor());
		
		
		v.setColor("Blue");
		
		System.out.println(v.getColor());
	}
	
	
}
