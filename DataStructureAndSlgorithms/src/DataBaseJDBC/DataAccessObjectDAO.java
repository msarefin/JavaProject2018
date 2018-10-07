package DataBaseJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataAccessObjectDAO {

	
	public static void main(String[] args) {
		
		studentDAO dao = new studentDAO();
		student s1 = dao.getStudent(12);
	}
}


class studentDAO{
	
	public student getStudent(int rollno) {
		student s = new student();
		s.rollno = rollno;
		
		try {
			Class.forName("com.mysql.jdbc.driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/msarefin", "root", "abc123");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return s; 
	}
}

class student{
	int rollno;
	String sname; 
}