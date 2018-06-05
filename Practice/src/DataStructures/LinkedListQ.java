package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQ { 

	public static void main(String [] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(25);
		q.add(5);
		q.add(12);
		
		System.out.println(q.remove());
		
	}
	
}
