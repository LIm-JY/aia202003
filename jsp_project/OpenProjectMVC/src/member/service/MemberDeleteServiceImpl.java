package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import service.Service;

public class MemberDeleteServiceImpl implements Service {
	
	MemberDao dao;
	

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String msg="";
		
		Connection conn = null;
		
		
		
		try {
			
			int idx = Integer.parseInt(request.getParameter("idx"));
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			int resultCnt = dao.memberDelete(conn, idx);
			
//			switch (resultCnt) {
//			case 0:
//				msg = "��û�Ͻ� �Խù��� �������� �ʽ��ϴ�.";
//			case 1:
//				msg = "���������� �����Ǿ����ϴ�.";
//			}
			
			if(resultCnt==1) {
				msg = "���������� ���� �Ǿ����ϴ�.";
			}else {
				msg = "��û�Ͻ� �Խù��� �������� �ʽ��ϴ�";
			}
			

			
		} catch (SQLException e) {
			System.out.println("SQL����");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("���� ������ �ƴ� ������ ��.û�Դϴ�.");
			msg = "�߸��� ��û�Դϴ�. �������� ��θ� �̿��� �ּ���";
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		request.setAttribute("msg", msg);
		
		
		
		return "/WEB-INF/views/member/memberDelete.jsp";
	}
	
	
	
	
	
	
	

}
