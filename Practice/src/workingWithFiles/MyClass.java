package workingWithFiles;

import java.io.File;

public class MyClass {

	public static void main (String[] args) {
		File x = new File("C:\\Users\\Aney\\Documents\\QTP.txt");
		if(x.exists()) {
			System.out.println(x.getName()+" Exists!");
		}
		else {
			System.out.println("The file doesn't exist");
		}
		
		
	}
}
