package math;

public class Exam1 {

	Exam1(){
		System.out.println("This is a Constructor method");
	}
	
	Exam1(String x){
		System.out.println("Hello "+x);
	}
	
	Exam1(int y, int z){
		int sum = y+z;
		System.out.println("The Sum of "+y+" and "+z+" is "+sum);
		
	}
	
	public void mod(int num1, int num2) {
		System.out.println("The Modeule of "+num1+" and "+num2 +" is "+ (num1%num2));
	}
	
	int Str(String a, String b) {
		
		int x =	a.compareTo(b);
		return x;
	}
	
	static String saa(String a, int i, int j) {
		
		return a.substring(i, j);
		
	}
	
	//--------------
	
	public static void main (String[] args) {
		
		String [] a = {"Class", "This","fun","yes"};
		
		Exam1 e1 = new Exam1();
		
		Exam1 e2 = new Exam1("Alex");
		
		Exam1 e3 = new Exam1(12,15);
		
		e1.mod(12, 4);
		
		System.out.println(a.length);
		
		System.out.println("Lets compare the strings");
		
//		e1.Str("Mohammed", "Muhammed");
		System.out.println(e1.Str("Michael", "Mikel"));
		
		System.out.println(e1.saa("My name is Sunny!", 3, 5));
		
	}
	
}
