package sortingList;

import java.util.ArrayList;
import java.util.Collections;

public class nSortingLists {

	public static void main (String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Snake");
		animals.add("Dog");
		
		Collections.sort(animals);
		
		System.out.println(animals);
	}
}
