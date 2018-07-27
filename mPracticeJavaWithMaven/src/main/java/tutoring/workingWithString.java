package tutoring;

import net.bytebuddy.description.modifier.SynchronizationState;

public class workingWithString {

	public static void main(String[] args) {
		
		String a = "Hello all "; 
		String b = "Welcome to java Tutorial";
		String c = a+b;
		String d = a.concat(b);
		int num1 = 12; 
		int num2 = 12;
		String empty = ""; 
		
		//Connecting staring
		/*
		 * There are two ways of concatenating strings 
		 * using +
		 * and 
		 * using concat
		 */
		
		System.out.println("Concatinating using + and concat");
		System.out.println(a+b);
		System.out.println(a.concat(b));
		 
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println("length of strings using length()");
		System.out.println("\""+c+"\""+ " is "+c.length()+" characters along inclusing spaces");
		
		System.out.println("Finding the character at the index number, all indexes start with 0");
		System.out.println("The character in the 12th index in "+"\""+c+"\""+" is "+c.charAt(12));
		
		System.out.println("compare two strings");
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(c==d); // This will give you false even though they contain the same string
		System.out.println(num1==num2); // when comparing two numbers the == operators can be used
		
		
		/*
		 * The difference between a==b and a.equals(b)
		 * == is an operator and equals() is a method
		 * == compares the reference points of the variables in the memory  and equals() compares the values within the variables
		 */
		
		System.out.println("Index of a character in a srting");
		System.out.println("The first index # of o in "+"\""+c+"\""+" is "+c.indexOf("o"));
		
		System.out.println("Substring");
		System.out.println(d.substring(10,17));
		
		System.out.println("upper".toUpperCase());
		System.out.println(a.toUpperCase());
		
		System.out.println("lower".toLowerCase());
		System.out.println(a.toLowerCase());
		
		System.out.println("Check if a string is empty! That means not it doesn't even have an empty space");
		System.out.println(empty.isEmpty());
		
		System.out.println("returns true if a string contains a certain word");
		System.out.println(d.contains("java"));
		
		
		System.out.println("Split the string based on a character or phrase");
		for(String x: d.split(" ")) {
			System.out.println(x);
		}
		
		
		System.out.println("Get the unicode of the character at the index point");
		System.out.println(d.codePointAt(4));
		System.out.println((char)111);
		
		System.out.println("replaceing a string with another");
		System.out.println(d.replace(" ", "*"));
		
		System.out.println("             trim simply trims the extra spaced before and afte the string                  ".trim());;
		
		System.out.println("startswith()  checks if the string starts with a certain word and it is case sensetive");
		System.out.println(d.startsWith("Hello"));
		System.out.println(d.toLowerCase().startsWith("hello"));
		
		
		
		System.out.println("endsWith() checks if the srting ends with a certain word");
		System.out.println(d.endsWith("Tutorial"));
		
	}
}
