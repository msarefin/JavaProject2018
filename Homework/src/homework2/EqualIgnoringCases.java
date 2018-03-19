package homework2;

public class EqualIgnoringCases {

	public static void main (String[] args) {
		String a = "PeopleLoving";
		String b = "peopleloving";
		
		boolean c = a.equalsIgnoreCase(b);
		
		System.out.println(c);
		
		if (c == true) {
			System.out.println("The Strings are Equal");
		}
		else {
			System.out.println("The Strings are not Equal");
		}
	}
}
