package oopsConcept;

public class Parent {

	public static String PSS = "This is a Public Static String!";
	static String ss = "This is a Static Sting!";
	public String ps = "This is a Public String"; // This need to 
	String s = "This is just a String";

	public static void comp(String a , String b) {
		if(a.equals(b)) {
			System.out.println("The Strings are Equal");
		}
		else {
			System.out.println("The Strings are not equal");
		}
	}
}
