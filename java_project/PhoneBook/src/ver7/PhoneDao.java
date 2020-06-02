package ver7;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import manager.Dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneDao {
	
	public int PhoneEdit(PhoneInfor basic, Connection conn) {
		
		
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultCnt=0;
		
		try {
			String sql = "update phonebook set pbname=? pbnumber=?, pbaddr=? pbmail=?"
					+ "where pbname=?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, basic.getPbname());
			pstmt.setString(2, basic.getPbnumber());
			pstmt.setString(3, basic.getPbaddr());
			pstmt.setString(4, basic.getPbmail());
			
			resultCnt = pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			
			if(rs !=null) {
				try {
					rs.close();
					
				} catch (SQLException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
			if(stmt !=null) {
				try {
					stmt.close();
				} catch (SQLException e2) {
					// TODO: handle exception
				}
				
			}
		}
			return resultCnt;
			
		}
		
		
		public int phoneDelete(String pbname) {
			
			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int resultCnt=0;
			
			
			
			
			try {
			
			
				conn = ConnectionProvider.getConnection();
				
			
				String sql = "delete from phonebook where pbname=?";
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, pbname);
				
				
				resultCnt = pstmt.executeUpdate();
				
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				
				if(rs !=null) {
					try {
						rs.close();
						
					} catch (SQLException e1) {
						// TODO: handle exception
						e1.printStackTrace();
					}
				}
				if(stmt !=null) {
					try {
						stmt.close();
					} catch (SQLException e2) {
						// TODO: handle exception
					}
					
				}
				
		}
			return resultCnt;
}
		
		
		
		
public List<PhoneInfor> phoneSearch(String pbname){
			
			Connection conn = null;
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			
			List<PhoneInfor> list = new ArrayList<PhoneInfor>();
			
		
			try {
				conn = ConnectionProvider.getConnection();
				
				String sql = "select * from phonebook  where pbname like '%'||?||'%'";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pbname);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					list.add(new PhoneInfor(
							rs.getString("pbname"), 
							rs.getString("pbnumber"), 
							rs.getString("pbaddr")),
							rs.getString("pbmail"));
				}
							
			} catch (SQLException e) {
				// TODO: handle exception
			}
		
		
		
			
			
			return List;
	}
	

	
	
	
	
	
}
