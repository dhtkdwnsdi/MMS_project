package util;
import java.beans.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://gitmms.mysql.database.azure.com:3306/test?useSSL=true&requireSSL=false", "myadmin@gitmms", "admin123@");
			System.out.println("DB 연결 성공 : " + conn);

			
			/* MySQL 워크벤치 test 테이블 생성 */
//			create table test.test(
//				testname varchar(10) null,
//				testnum int null
//			);
			
			
			
			/* MySQL 워크벤치에 테이블 생성하고 실행 */
//			String sql = "insert into test values(?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			
//			pstmt.setString(1, "abc");
//			pstmt.setInt(2, 123);
//			
//			pstmt.executeUpdate();

			
			/* 마지막 테스트 */
//			String sql = "select * from test;";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery(sql);
//			
//			
//			while(rs.next()) {
//
//			System.out.print("testname : " + rs.getString("testname"));
//			System.out.print(", testnum : " + rs.getInt("testnum"));
//			System.out.println();
//
//			}

			
		} 
		
		catch (SQLException ex) {
			System.out.println("SQLException" + ex);
		}
		
		catch(Exception ex) {
			System.out.println("Exception" + ex);
		}
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		DBManager.getConnection();
	}
	
}
