package tutoring;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithList {

	public static void main(String[] args) {
		List<String> Llist = new LinkedList<String>();

		Llist.add("Asia");
		Llist.add("Europe");
		Llist.add("Africa");
		Llist.add("North America");
		Llist.add("South America");
		Llist.add("Australia");
		Llist.add("Antartica");

		System.out.println("There are " + Llist.size() + " Continents \n");

		Iterator it = Llist.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println();

		for (int i = 0; i < Llist.size(); i++) {

			System.out.println(i + 1 + "\t" + Llist.get(i));

		}

	}

}
