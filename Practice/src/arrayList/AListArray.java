package arrayList;

import java.util.ArrayList;

public class AListArray {

	public static void main(String[]args) {
		ArrayList <String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Orange");
		
		color.remove("Green");
		
		System.out.println(color);
	}
}
