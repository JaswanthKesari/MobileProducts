package ConnectionManager;

import java.sql.*;

public class ConnectionManager {
	Connection cn = null;
	public Connection establishConnection() throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","Kesari@2004");
		return cn;
	}
	
	public void closeConnection() throws SQLException
	{
		cn.close();
	}
}