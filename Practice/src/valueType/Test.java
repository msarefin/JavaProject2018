package valueType;

public class Test {

	public static void main(String[]args) {
		
		Person p = new Person();
		
		p.setAge(25);
		
		System.out.println(p.getAge());
		
		change(p);
		
		
		System.out.println(p.getAge());
		
	}
	
	static void change(Person x) {
		x.setAge(10);
	}
	
}
