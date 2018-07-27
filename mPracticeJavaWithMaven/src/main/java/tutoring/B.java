package tutoring;

public class B extends A {

	
	B(){
		System.out.println("child");
	}
	
	B(String msg){
		System.out.println(msg);
	}
	
	
	void person() {
		System.out.println("This is another person");
	}
	
	void people() {
		super.person();
	}

	void cal(int num1, int num2) {
		super.num1 = num1;
		super.num2 = num2;
		int dif = num2 - num1;
		System.out.println(dif);
	}
	
	
	
	void calculation(int num1, int num2) {
		this.cal(num1, num2);
		super.cal(num1,num2);
		
	}
	
	
	

	public static void main(String[] args) {
		A a = new A();
		a.person();

		B b = new B();
		b.person();

		A x = new B();
		x.person("Alex", 34);

		x.cal(32, 43);

	
		
		System.out.println(x.num1);
		System.out.println(x.num2);

		
		b.calculation(12, 32);
		b.people();
		
	}
}
