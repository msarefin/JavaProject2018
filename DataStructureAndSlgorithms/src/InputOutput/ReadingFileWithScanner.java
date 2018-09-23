package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileWithScanner {

	public static void main(String[] args) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/DataFile/sample.txt");

		Scanner sc = new Scanner(file);
		
		
//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}
}
