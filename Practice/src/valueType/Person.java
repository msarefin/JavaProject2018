package valueType;

public class Person {
	
	private String name;
	private int age; 
	
	Person(){
		System.out.println("This a constructor from the Person class");
	}
	
	Person(String name){
		this.name= name;
		System.out.println(this.name);
		
	}
	
	public int getAge() {
		return age; 
	}
	
	public void setAge(int age) {
		this.age=age; 
	}
}
