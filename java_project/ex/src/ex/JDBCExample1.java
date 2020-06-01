package ex;

import java.sql.*;

public class JDBCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/malldb", "root", "");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl" , "scott", "tiger");
			System.out.println("데이터베이스에 접속했습니다.");
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

	}

}
