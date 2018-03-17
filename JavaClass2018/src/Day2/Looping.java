package Day2;

public class Looping {

	public static void main (String[] args) {
		int i = 9;
		
		if(i >10) {
			System.out.println(i);
		}
		else {
			System.out.println("The number is less than 10!");
		}
		
		String c = "";
		
		if(c==null) {
			System.out.println("No value");
		}
		else {
			System.out.println("Has value");
		}
		
		c= null; 
		
		if (c==null) {
			System.out.println("There is no value");
		}
		else {
			System.out.println("There is value");
		}
	}
}
