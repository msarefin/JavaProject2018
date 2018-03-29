package math;

public class Addition {

	public static void main (String[] args) {
		
		int a, b , c; 
		a= 20; 
		b= 100; 
		c = a+b; 
		System.out.println("The Sum of two numbers is "+c);
		
		String str = "cat";
		String str1 = "I am Happy";
		String str2 = "Dont worry we will get a jo b soon!";
		String str3 = "This is just a sample string";
		String str4 = "This is the fourth String";
		String str5 ="This is a new string String Str5";
		
		
		str1.indexOf("i");
		
		System.out.println(str1.indexOf('a'));
//		System.out.println(str1.substring(str1.indexOf('h')));
		
//		System.out.println(str3.length());
		
		if(str3.contains("job")) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println(str2.replace("Dont", "Don't"));
		
		for(int i = str4.length()-1; i>=0; i--) {
			System.out.print(str4.charAt(i));
		}
		
		System.out.println();
		
		System.out.println(str4.trim());
		
		System.out.println(str3.compareTo(str4));
		
		System.out.println(str5.length());
		
		
		String str6 = "This is new This is new This is new";
		
		System.out.println(str6.split("This").length);
		
		for(int i = 0; i<str6.split("This").length;i++) {
			System.out.println(str6.split("This")[i]);
		}
		
	}
	
	
	
}
