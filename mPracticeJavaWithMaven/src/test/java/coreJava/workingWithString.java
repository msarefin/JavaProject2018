package coreJava;

public class workingWithString {

	public static void main(String [] args) {
		
		String a = "Lets try to work with java string functions";
		String a1 = "Lets try to work with java string functions";
		char c = 67;  
		int num = 100;
		
		String trim = "                 This string has spaces in the fronst and back                       ";
		
		String b = "This is going to be really hard";
		
		System.out.println(a+" "+b+" "+num);
		
		System.out.println("character at the 12th index is : "+a.charAt(12)); // character at the 12th index, index always starts with 0 
		System.out.println("Compares two string using concat function: "+ a.equals(b)); // compares two strings 
		System.out.println("Compares two string using == sign:"+a==a1); //compares two strings
		System.out.println("Determines the length of the String : "+a.length()); // How long is the string
		System.out.println("returns the unicode of the character: "+a.codePointAt(0)+" which is " +(char)76); // returns the unicode of the character 
		System.out.println();
		System.out.println(a.concat(b)); // concatinate the two strings
		System.out.println(a.indexOf('t')); //Gets the index position of the character
		System.out.println(a.indexOf(" "));
		System.out.println(a.substring(5,26)); //substring of the string. Substring always returns a string
		System.out.println(a.substring(5,a.indexOf('g')+1));
		
		System.out.println(a.split(a));
		
		System.out.println(c); // This give you the character baesd on the unicode 
		
		System.out.println(b.codePointCount(5, 16));
		
		String upper = a.toUpperCase();
		System.out.println(upper);
		System.out.println(upper.toLowerCase());
		System.out.println(upper);
		
		System.out.println(a.contains("java")); // returns true if the sentence contains a desired word
		System.out.println(a.isEmpty()); // checks if the string is empty
		System.out.println(trim.replace(" ", "*")); // repalce all spaces with * 
		System.out.println(trim.trim()); // gets rid of the extra spaces at the begining and at the end
		
		System.out.println(a.startsWith("Lets")); // Asserts if the string starts with the specified word
		System.out.println(a.endsWith("functions")); // Asserts if the string ends with
		
		
	}
}
