package sortingList;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(3);
		nums.add(36);
		nums.add(73);
		nums.add(40);
		nums.add(1);
		
		Collections.sort(nums);
		
		System.out.println(nums);
	}
}
