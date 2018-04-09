package creatingFile;

import java.util.Formatter;

public class FileCreater {

	public static void main(String[] args) {
		try {
			Formatter f = new Formatter("C:\\Users\\Aney\\Documents\\QTP1.txt");
			f.format("%s %s %s","1","John","Smith \r\n");
			f.format("%s %s %s","2","Amay","Brown \r\n");
			f.close();
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}
