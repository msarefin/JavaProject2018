package stringFunctions;

public class StringFunctions {

	public static void main(String[]args) {
		String x = "peoplentech";
		String y = "";

		for(int i = x.length()-1; i >= 0; i--){
		y=y + x.charAt(i);
		}
		
		System.out.print(y);
	}
	
}
