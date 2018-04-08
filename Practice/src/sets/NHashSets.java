package sets;

import java.util.HashSet;

class NHashSets {

	public static void main(String[] args) {
		HashSet<String>set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		
		System.out.println(set);
	}
}
