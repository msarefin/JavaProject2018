package staticKeyword;

public class Counter {

	public static void main (String[] args) {
		
		Counter c = new Counter();
		
		System.out.println(COUNT);
		System.out.println(c.COUNT);
	}
	
	public static int COUNT =0; // Count will be share by all objects of the class
	Counter(){
		COUNT++;
		
		System.out.println("This is going to print no matter what!");
	}
	
}
