package iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");

		Iterator<String> it = animals.iterator();

		// String value = it.next();
		// System.out.println(value);
		// System.out.println(it.hasNext());

		for (int i = 0; i <= animals.size(); i++) {

			while (it.hasNext() == true) {
				System.out.println(it.next());
			}

		}
	}

}
