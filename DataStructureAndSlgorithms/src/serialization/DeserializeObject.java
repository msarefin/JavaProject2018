package serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializeObject {

	public static void main(String[] args) {
		Employee emp1 = null; 
		
		try {
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/DataFile/Serialize.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			emp1 = (Employee)objectInputStream.readObject();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Object Deserialized");
		System.out.println("Employee Name: " + emp1.getEmpName());
		System.out.println("Employee Address: "+ emp1.getEmpAddress());
		System.out.println("Employee Date Of Birth: "+emp1.getEmpDOB());
		System.out.println("Employee ID: "+emp1.getEmpID());
	}
}
