package tutoring;

import java.util.LinkedList;
import java.util.Queue;

public class workingWithQueue {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("Asia");
		q.add("Europe");
		q.add("Africa");
		q.add("North America");
		q.add("South America");
		q.add("Australia");
		q.add("Antartica");
		
		System.out.println(q.peek()+"\n");
		
		
		for(String a : q) {
			System.out.println(a);
		}
		
		
	}
}
