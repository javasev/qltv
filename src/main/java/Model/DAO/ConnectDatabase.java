package Model.DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.Statement;

public class ConnectDatabase {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException
	{
		String dbURL = "jdbc:mysql://localhost:3305/manage_library?useUnicode=true&characterEncoding=UTF-8";
		
		String username = "root";
		String password = "tuan1204";

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection(dbURL, username, password);
		if (conn != null) {
			System.out.println("Kết nối thành công");
			
			return conn;
		}
		return null;
	}
}
