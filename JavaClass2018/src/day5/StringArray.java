package day5;

public class StringArray {

	public static void main(String[] args) {
		
		char[] a = {'p','e','o','p','l','e'};
		
		try {
		
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		for(int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]);
		}}
		catch(Exception e){
			System.out.println("Fiailing");
		}
		
		
		
	}
	
}
