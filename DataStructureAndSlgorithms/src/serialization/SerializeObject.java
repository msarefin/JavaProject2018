package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("John David");
		emp1.setEmpAddress("31-10 37th ave");
		emp1.setEmpDOB("10-09-1990");
		emp1.setEmpID(500);
		
		
		/* Create the .ser file using FileOutputStream
		 * write the into the .ser file using ObjectOutputStream
		 * 
		*/
		try { 
			FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir")+"/DataFile/Serialize.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(emp1);
			System.out.println("Employees object is serialized!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
