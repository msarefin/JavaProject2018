package Arrays;

public class Array {

	public static void main (String[] args ) {
		
		// Arrays 
		
		String[] a = {"Sam","John", "Alex"}; // Declaring array without a specified length
		
		String[] b = new String[5]; // Declaring an array and specifying the length 
		// Adding Values to the array 
		b[0] = "Jenny"; //Array index always starts with 0  and not 1 
		b[1] = "Kelly";
		b[2] = "Sandra";
		b[3] = "Cassey";
		b[4] = "Neena";
		
		System.out.println(a[1]); // Getting  data from array 
		System.out.println(a.length); // Getting the length of the array 
		System.out.println(b.length);
		
		
		// for looping an Array 
		for(int i = 0; i<5;i++) {
			System.out.println("array "+i+" is "+b[i]);
		}
		
	}
}
