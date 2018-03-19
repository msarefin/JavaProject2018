package homework2;

public class indexing {

	public static void main(String[] args) {
		
		String n ="The quick brown fox jumps over the lazy dog.";
		int l = n.length();
		char c =n.charAt(l-1);
		
		System.out.println(c);
		System.out.println("last index of the string is "+(l-1));
		
	}
}
