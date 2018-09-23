package InputOutput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class usingInputStream {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(r);
		String n ="";
		
		while(!n.equalsIgnoreCase("stop")) {
		
			System.out.println("What is you name?");
			n = br.readLine();
			System.out.println("You entered: "+n);
		}
		
		br.close();
		r.close();
	}
}
