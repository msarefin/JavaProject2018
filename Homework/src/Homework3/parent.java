package Homework3;

public class parent extends GrandParent {

	public static void main(String[] args) {

		GrandParent g = new GrandParent();
		
		g.Children(5);
		g.Spouse(true);
		g.age(45);
		
		g.name = "Danny";
		
		System.out.println(g.children);
		System.out.println(g.spouseAlive);
		System.out.println(g.age);
		
	}
	
	void Profession() {
		System.out.println("Doctor");
	}
	
	void education(String d) {
		System.out.println(d);
	}
	
	void education(String d1, String d2) {
		System.out.println(d1);
		System.out.println(d2);
	}

}
