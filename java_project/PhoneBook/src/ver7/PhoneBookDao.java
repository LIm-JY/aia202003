package ver7;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneBookDao {
	
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
							rs.getString("pbaddr"),
							rs.getString("pbmail")));
				}
							
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();

			}finally {

				// 4. 데이터베이스 연결 종료
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}
		
		
		
			
			
			return list;
	}
	

public int phoneInsert(PhoneInfor phone) {
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int resultCnt = 0;
	
	try {

		// Connection 객체 생성
		conn = ConnectionProvider.getConnection();

		// 3. SQL 처리
		// Statement or PreparedStatement
		// pstmt = conn.prepareStatement(SQL 문장)

		String sql = "insert into dept  (deptno, dname, loc)  values (?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, phone.getPbname());
		pstmt.setString(2, phone.getPbnumber());
		pstmt.setString(3, phone.getPbaddr());
		pstmt.setString(4, phone.getPbmail());

		resultCnt = pstmt.executeUpdate();


		// 4. 데이터베이스 연결 종료
		// pstmt.close();
		// conn.close();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {

		// 4. 데이터베이스 연결 종료
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	
	
	
	
	return resultCnt;
	
	
}
	
	

public List<PhoneInfor> phoneList(){
	
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	List<PhoneInfor> phoneList = new ArrayList<>();
	
	try {

		// Connection 객체 생성
		conn = ConnectionProvider.getConnection();

		// 3. SQL 처리
		// Statement or PreparedStatement
		// pstmt = conn.prepareStatement(SQL 문장)

		String sql = "select * from phonebook order by pbname";

		stmt = conn.createStatement();
		
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			
			PhoneInfor phone = new PhoneInfor(
					rs.getString("pbname"), 
					rs.getString("pbnumber"), 
					rs.getString("pbaddr"),
					rs.getString("pbmail"));
					
				phoneList.add(phone);
			
		}

		System.out.println("=======================================================================");
		// 4. 데이터베이스 연결 종료
		// pstmt.close();
		// conn.close();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {

		// 4. 데이터베이스 연결 종료
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	
	
	
	
	return phoneList;
	
}
	


	public int phoneSearchCount(String searchName, Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rowCnt = 0;
		try {
			//conn = ConnectionProvider.getConnection();
			
			String sql = "select count(*) from phonebook where pbname=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				rowCnt = rs.getInt(1);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return rowCnt;
	}



public PhoneInfor phoneSearchName(String searchName, Connection conn) {
		
		
		PhoneInfor phone = null;
		
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//conn = ConnectionProvider.getConnection();
			
			String sql = "select * from dept where dname=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				phone = new PhoneInfor(
						rs.getString(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return phone;
		
		
	}







	
	
}
