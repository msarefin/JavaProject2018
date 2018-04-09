package workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] arigs) {
		try {
			File x = new File("C:\\Users\\Aney\\Documents\\QTP.txt");
			Scanner sc = new Scanner(x);
			
			while(sc.hasNext()) {
				System.out.print(sc.next()+" ");
			}
			sc.close();
			
		}
		catch(FileNotFoundException e){
			System.out.println("Error");
		}
	}
}
