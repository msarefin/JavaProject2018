package getterSetterMethods;

public class Person {

	private String name; 
	private int age;
	
	Person(){
		System.out.println("This is constructor from Person class !");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int x) {
		this.age = x; 
	}
}
