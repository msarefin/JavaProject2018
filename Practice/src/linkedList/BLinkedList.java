package linkedList;

import java.util.LinkedList;

public class BLinkedList {

	public static void main (String[] args) {
		LinkedList<String> c = new LinkedList<String>();
		
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Orange");
		
		c.remove("Green");
		c.size(); 
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains("Blue"));
		System.out.println(c.get(2));
	}
}
