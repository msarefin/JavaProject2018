package hashmaps;

import java.util.HashMap;

public class CHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("Amy", 154);
		points.put("Dave", 42);
		points.put("Rob", 733);
		points.remove("Dave");
		System.out.println(points.get("Dave"));
	
		System.out.println(points.size());
		System.out.println(points.containsKey("Rob")); // Checks if the key already exist
		System.out.println(points.containsValue(154)); // Checks if the value already exist
		
		
		
	}
}
