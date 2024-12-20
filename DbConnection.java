package busResv;

import java.sql.*;


public class DbConnection{
	public static final String url="jdbc:mysql://localhost:3306/busresv";
	public static final String userName = "root";
	public static final String password = "1234";
	
	public  static Connection  getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
}
