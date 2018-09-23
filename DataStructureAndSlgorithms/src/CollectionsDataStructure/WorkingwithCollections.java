package CollectionsDataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WorkingwithCollections {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>(); 
		
		
		c.add("Hello");
		c.add("My Deer");
		c.add("my dear!");
		c.remove("My Deer");
		
	
		Iterator<String> sc = c.iterator();
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
	}
	
}

