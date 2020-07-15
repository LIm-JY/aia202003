package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.print.Collation;
import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;
import member.model.MemberListView;
import service.Service;

public class MemberListServiceImpl implements Service {

	MemberDao dao;
	
	@Override
	public String getViewPage(
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		//view�� ������ ��� ������
		MemberListView listView = null;
		
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			
			// ��ü �Խù� ���� ���ϱ�
			int totalCnt = dao.selectTotalCount(conn);
			
			// �� ������ �� ������ �Խù��� ����
			
			final int MEMBER_CNT_PER_PAGE = 30;
			
			// ���� ������ ��ȣ
			int currentPageNumber =1;
			String page = request.getParameter("page");
			
			if(page!=null) {
				try {
					currentPageNumber = Integer.parseInt(page);
				} catch (NumberFormatException e) {
					System.out.println("���� Ÿ���� ���ڿ��� ���޵��� �ʾ� ���� �߻�");
				}
				
			}
			// �Խù��� ù��° ���� index
			
			int startRow = 0;
			
			// �� �������� ������ ����Ʈ
			List<Member> memberList = null;
			
			if(totalCnt>0) {
				startRow = (currentPageNumber-1)*MEMBER_CNT_PER_PAGE;
				System.out.println(startRow);
				memberList = dao.selectList(conn, startRow, MEMBER_CNT_PER_PAGE);
			} else {
				currentPageNumber = 0;
				memberList = Collections.emptyList();
			}
			
			
			listView = new MemberListView(
					totalCnt, 
					currentPageNumber, 
					memberList, 
					MEMBER_CNT_PER_PAGE, 
					startRow);
			System.out.println(listView);
			
			
			
			
		} catch (SQLException e) {
			System.out.println("SQL �����߻�");
			e.printStackTrace();
		}
		
		request.setAttribute("listView", listView);
			
		
		
		
		
		return "/WEB-INF/views/member/memberList.jsp";
	}

}
