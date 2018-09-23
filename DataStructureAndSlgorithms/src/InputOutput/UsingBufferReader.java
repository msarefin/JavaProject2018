package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferReader {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"/DataFile/sample.txt");
		
		FileReader reader = new FileReader(file); 
		
		BufferedReader br = new BufferedReader(reader);
		
		String st; 
		while((st = br.readLine())!=null) {
			System.out.println(st);
		}
	}

}
