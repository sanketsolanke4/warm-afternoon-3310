package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DButility {
	public static Connection provideConnection() {
		
		Connection conn=null;
	
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		String url="jdbc:mysql://localhost:3306/aution_database";
	
		try {
			conn= DriverManager.getConnection(url,"root","Sus@0213");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}
}
