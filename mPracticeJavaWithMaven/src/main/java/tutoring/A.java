package tutoring;

public class A {

	
	A(){
		System.out.println("parent");
	}
	// you cannot override a constructor but you can overload them
	A(String msg){
		System.out.println(msg);
	}
	
	
	
	String a = "This is an instance variable";
	static String b = "Static Variable";
	
	int num1; 
	static int num2; 
	
	String dogs() {
		String name = "sandy";
		return name;
	}
	
	void cal(int num1, int num2) {
		this.num1= num1; 
		this.num2= num2; 
		
		int dif = this.num1-this.num2;
	
		System.out.println(dif);
		
	}
	
	
	 void person() {
		System.out.println("This is a person");
	}
	
	 void person(String name, int age) {
			System.out.println("my name is "+name+" I am "+age+" years old");
		}
	
	public static void main(String[] args) {
		
		String c = "local variable";
		
		A obj = new A();
		A obj1 = new A();
		
		obj.a = "Hello";
		b = "Bye";
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj.b);
		System.out.println(obj1.b);
		
		System.out.println(c);
		
		System.out.println(obj.dogs());
		
	}
	
}
