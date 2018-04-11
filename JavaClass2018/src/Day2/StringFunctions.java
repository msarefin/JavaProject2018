package Day2;

public class StringFunctions {

	public static void main (String[]args) {
		String a = "This is a String! ";
		int b = 23;
		String c = " I love working in java ";
		
		
		System.out.println(a+b+c); // this is concatination
		System.out.println(a.concat(c));
		System.out.println(a.length());
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf('a'));
		System.out.println(a.substring(4,10));
		System.out.println(a.substring(a.indexOf('a'),15));
		System.out.println();
		System.out.println(a.compareTo(c));
		System.out.println(a.equals(c));
		System.out.println(a.compareToIgnoreCase(c));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a.toLowerCase());
		System.out.println(a.isEmpty());
	}
}
