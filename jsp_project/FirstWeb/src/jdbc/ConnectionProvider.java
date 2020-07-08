package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ConnectionProvider {
	
	
	
	
	
		public static Connection getConnection() throws SQLException {
			
			String jdbcUrl = "jdbc:apache:common:dbcp:pool";
			
			return DriverManager.getConnection(jdbcUrl);
			
			// DB Connection Á¤º¸
			//String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			//String user = "scott";
			//String pw = "tiger";
			
			//return DriverManager.getConnection(dbUrl, user, pw);
			
		}
		
}
