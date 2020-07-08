package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Emp;

public class EmpDao {
	
	
	// �ܺο��� ��ü ���� �ϴ� ���� ���´�.
	// �������� �������������� �̿�: private
	private EmpDao() {
	}

	// ����� �ν��Ͻ� �ϳ��� �����Ѵ�.
	static EmpDao dao = new EmpDao();
	
	// EmpDao �ν��Ͻ��� �������� ��ȯ�ϴ� �޼���
	public static EmpDao getInstance() {
		return dao;
	}
	
	
	// Connection �� �Ű������� �޴� ������ Ʈ������ ó�� ����.
	public List<Emp> getEmpList(Connection conn) throws SQLException {
		
		Statement stmt = null;
		ResultSet rs = null;

		List<Emp> empList = new ArrayList();

		
		
		
		// 3. Statement ����
		stmt = conn.createStatement();

		String sql = "select * from emp02 order by ename desc";

		// select �� ��� ResultSet ��ü�� ��´�.
		rs = stmt.executeQuery(sql);

		// ��� ���
		while (rs.next()) {
			empList.add(new Emp(
					rs.getInt("empno"), 
					rs.getString("ename"), 
					rs.getInt("sal"), 
					rs.getString("job")));
		}
		
		return empList;
		
	}

}