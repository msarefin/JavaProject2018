package testing;

public class TestMyTest {
	
	public static void main (String[] args) {
//		System.out.println("Practicing array");
		
		
		String a = "When you have eleminated the impossible, what remain however imporbable must be the truth !";
		
		int x = a.length();
		
		
		System.out.println(x);
		
		char[] b = new char[a.length()];
		
	
		for(int i = 0; i<x; i++) {
			b[i] =a.charAt(i);
			
			System.out.println(i+" | "+b[i]);
		}
	}

}
