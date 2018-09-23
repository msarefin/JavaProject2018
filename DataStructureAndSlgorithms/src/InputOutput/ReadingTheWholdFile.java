package InputOutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadingTheWholdFile {

	
	public static List<String> readFileInList(String Filename){
		
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(Filename),StandardCharsets.UTF_8);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return lines;
		
	}
	
	
	public static void main(String[] args) {
		List l = readFileInList(System.getProperty("user.dir")+"/DataFile/sample.txt");
		
		Iterator<String> it = l.iterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
