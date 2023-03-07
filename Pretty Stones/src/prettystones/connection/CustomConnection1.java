package prettystones.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomConnection1 {

	public static Connection getConnection() throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/prettystones","root","Mounika21#");
		return connection;
		}catch(ClassNotFoundException ce) {
			System.out.println(ce.getMessage());
			return null;
		}catch(SQLException se) {
			System.out.println(se.getMessage());
			return null;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
