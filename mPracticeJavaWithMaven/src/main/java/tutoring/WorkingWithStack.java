package tutoring;

import java.util.LinkedList;
import java.util.Stack;

public class WorkingWithStack {

	public static void main (String[] args) {
		
		Stack<String> stk = new Stack<String>();
		
		stk.add("Asia");
		stk.add("Europe");
		stk.add("Africa");
		stk.add("North America");
		stk.add("South America");
		stk.add("Australia");
		stk.add("Antartica");
		
		
		System.out.println(stk.peek()+"\n");
		
		
		for(String a : stk) {
			System.out.println(a);
		}
	}
	
}
