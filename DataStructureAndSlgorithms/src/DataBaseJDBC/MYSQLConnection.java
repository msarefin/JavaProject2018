package DataBaseJDBC;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxResultset;

public class MYSQLConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost/MSArefin?serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "abc123";
		String sql = "select * from Bubble_sort";
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement st = conn.createStatement(); 
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.println(rs.getInt(2));
			
		}
		
		st.close();
		conn.close();
	}

}
