package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	private static DBManager instance;
	
	public static DBManager getInstance() {
		if(instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	
	public DBManager() {
		init();
	}
	
	private Connection conn = null;
	String url = "jdbc:mysql://gitmms.mysql.database.azure.com:3306/test?useSSL=true&requireSSL=false";
	String user = "myadmin@gitmms";
	String pass = "admin123@";
	
	private void init() {
		String url = "jdbc:mysql://gitmms.mysql.database.azure.com:3306/test?useSSL=true&requireSSL=false";
		String user = "myadmin@gitmms";
		String pass = "admin123@";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		try {
			init();
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("접속성공");
		}	catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void dbClose() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
