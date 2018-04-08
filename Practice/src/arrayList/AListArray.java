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
		color.size();
		color.get(2);
		
		System.out.println(color);
		System.out.println(color.size());
		System.out.println(color.get(2));
		System.out.println(color.contains("Green"));
	}
}
