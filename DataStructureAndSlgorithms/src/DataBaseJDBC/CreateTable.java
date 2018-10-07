package DataBaseJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
	
	static String jdbcDrver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost/PNT?serverTimezone=UTC&useSSL=false";
	static String user = "root";
	static String password = "abc123";
	
	static Connection con = null; 
	static PreparedStatement ps = null; 
	
	
	static void CreateTable(String tableName) throws ClassNotFoundException, SQLException {
		Class.forName(jdbcDrver);
		con = DriverManager.getConnection(url, user, password);
//		ps = con.prepareStatement("drop table if exists '"+Table Name+"'");
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
	}
}
