package homework2;

public class CompareStrings {

	public static void main (String[] args) {
		String a = "peopleloving";
		String b = "peoplefloving";
		
		boolean n = a.equals(b);
		
		System.out.println(n);
		
		if(n == true) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
	}
	
}
