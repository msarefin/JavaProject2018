package Homework3;

public class Child extends parent{

	public static void main (String[] args) {
		parent p = new Child();
		
		p.Children(2);
		p.age(20);
		p.Spouse(true);
		
		p.name = "John";
		
		p.education("B Com");
		p.education("MIS", "Business Management");
		p.Profession();
		
	}
	void Profession() {
		System.out.println("QA Tester");
	}
	
	
	
}
