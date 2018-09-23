package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.mysql.cj.protocol.Protocol.GetProfilerEventHandlerInstanceFunction;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(System.getProperty("user.dir")+"/DataFile/sample.txt");
		
		int i;
		
		while((i=fr.read())!=-1) {
//			System.out.print(i+" ");
			System.out.print((char)i);
		}
		fr.close();
	}
}
