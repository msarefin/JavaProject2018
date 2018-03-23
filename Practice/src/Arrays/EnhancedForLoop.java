package Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// Enhanced for loop
		
		int[] a = {1,3,5,7};
		String[] b = {"James", "John", "alex","Jonathan"};
		for(int t: a) {
			System.out.println("The value of Array is "+t);
			
		}
		// Enhanced for loop is also known as For each loop
		for(String i: b) {
			System.out.println("The Vale of b is "+i);
		}
	}
}
