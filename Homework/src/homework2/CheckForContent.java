package homework2;

public class CheckForContent {

	public static void main(String[] args) {
		String p1 = "peoplentech";
		String p2 = "people";
		
		boolean check = p1.equalsIgnoreCase(p2);
		
		
		if(check == true) {
			System.out.println(p1+" contains "+p2);
		}
		else {
			System.out.println(p1+" does not contain "+p2);
		}
	}
}
