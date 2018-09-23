package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestString {

	public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        
        String [] w = s.split(" ");
        
        for(String st: w) {
        	System.out.println(st);
        }
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement


        String[] words = wordGiven.split(" ");


        return map;
    }
}
