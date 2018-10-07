package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

import javax.sound.midi.Soundbank;

public class linkedList1 {

	static Random r = new Random(); 
	
	static List<Integer> ll = new LinkedList<>();
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i<=10; i++) {
			ll.add(r.nextInt(100));
		}
		
		ll.sort(null);
		
		ll.forEach(ll -> System.out.println(ll));
		
	}
	
}
