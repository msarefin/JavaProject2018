package Day2;

public class WorkingWithString {

	public static void main (String []args) {
		
		// working with String function
		
		String a = "This is a String ";
		int b= 23; 
		
		System.out.println(a+b);
		
		String c = " Just working with Strings !!";
		
		System.out.println(a+b+c);
		System.out.println(a.concat(c)); 
		
		System.out.println(a.length());
		
		String region ="United States Of America";
		String country = "is a country in North Amercia!";
		
		System.out.println(region.length());  //Constantinople >14 
		System.out.println(region.charAt(5)); // the 5th position is "a"
		System.out.println(region.indexOf('n')); // n is in the 2nd position
		System.out.println(region.indexOf("x")); // if the character doesn't exist > -1
		
		System.out.println(region.substring(8,11)); // the string position 8 to 11 . The First number needs to be smaller than the second number !!!
		System.out.println(region.substring(region.indexOf("S"),11));
		System.out.println(region.substring(4,region.indexOf("A")+1)); 
		
		System.out.println("-----------------------------------------");
		
		String phrase ="State of States";
		
		System.out.println(phrase.indexOf("States")); 
		
		System.out.println(region.concat(country));// Concatinates the String data with spaces between them
		
		char d = 'A';
		System.out.println(d); // only takes one character
		
		char x = '1';
		int y = 1;
		
		System.out.println(region+x+y);
		System.out.println((""+x+y));
		System.out.println(x+1);
		System.out.println(region+y+1);
		System.out.println(region+(y+1));
		
		
		String a1 = "free lol"; // e is 101 on ANSI
		String b1 = "fred lol"; // d is 100 on ANSI
		System.out.println(a1.compareTo(b1)); // returns 1 . Compares only the first character
		
		System.out.println("Check for equals!");
		System.out.println(a1.equals(b1)); // compares two  strings to determine if they are the same
		
		boolean t = true; 
//		boolean f = false; 
		
		System.out.println(t);
		
		String a2 ="USA";
		String b2 = "usa";
		
		System.out.println(a2.compareTo(b2)); // Compares two strings 
		System.out.println(a2.equals(b2)); // Checks if the characters are the same. It's a Boolean 
		System.out.println(a2.compareToIgnoreCase(b2)); // Compares two strings; not case sensitive
		System.out.println(a2.equalsIgnoreCase(b2)); // checks if the characters are the same; not case sensitive. It's a Boolean  
		
		System.out.println(region.contains("ion")); // checks if the string contains an expected value. it's a Boolean Data type
		System.out.println(a1.contains(b1));
		System.out.println(a1.contains("free")); // Doesn't have to be an exact match
		
		
		System.out.println(region.toLowerCase()); //converts to lower case
		System.out.println(region.toUpperCase()); //converts to upper case 
		
		System.out.println(a1.isEmpty()); // checks if the string is empty. It's a Boolean Data type!
		
		String empty =""; 
		String noEmpty = "  ";
		
		System.out.println(empty.isEmpty()); // The String is empty
		System.out.println(noEmpty); // The string is not empty
		
		String sp = "            This has Wide space              ";
		
		System.out.println(sp.trim());// gets rid if the extra spaces before and after the text
		region = "United Kingdom";
		System.out.println(a1.startsWith("free")); // Check if the String starts with
		System.out.println(region.startsWith("united"));
		System.out.println(region.startsWith("United"));
		
		System.out.println(region.endsWith("America")); // Checks if the string ends with
		
		System.out.println(sp.indexOf('T'));
		
		
	}
}
