package OOPS;

public class parents {
	
	public static String v = "Hello";
	public String c = "hahahahahahaha";
	static String s = "why?";
			

	public static void summ(int a ) {
		int sum = 0;
		
		
		for(int i = 0; i<=a; i++) {
		sum=sum+i; 
		}
		System.out.println(sum);
	}
	
	public void comp(String a, String b) {
		if(a.equals(b)) {
			System.out.println("The Strings are Equal");
		}
		else {
			System.out.println("They are not equal!");
		}
	}
}
