package member.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.model.LoginInfo;
import member.model.Member;
import service.Service;
import util.CookieBox;

public class MemberLoginServiceImpl implements Service {

	MemberDao dao;
	
	@Override
	public String getViewPage(
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		// ����� ��û ������ �޴´�.
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		String chk = request.getParameter("remember"); 
		
		String rediectUri = request.getParameter("redirecUri");
		
		Connection conn = null;
		
		// �α��� ó��
		Member member = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			member = dao.selectByIdpw(conn, uid, pw);
			
			System.out.println(member);
			
			if(member != null){
				
				LoginInfo loginInfo = new LoginInfo(member.getUid(), member.getUname(), member.getUphoto());
				
				request.getSession().setAttribute("loginInfo", loginInfo);

				// ��Ű ������ ����� ����
				String cookieName = "uid";
				String cookiepath = request.getContextPath();
				
				// ȸ�� ���̵� ��Ű ���� 
				if(chk!=null){
					response.addCookie(CookieBox.createCookie(cookieName, uid, cookiepath, 60*60*24*365));
				} else {
					response.addCookie(CookieBox.createCookie(cookieName, uid, cookiepath, 0));
				}
				
				// �α��� �� �ʿ��ߴ� ���� ������
				String result = "<script>"
						+ "alert('�α��εǾ����ϴ�.');"
						+ "location.href='"+rediectUri+"'"
						+ "</script>";
				request.setAttribute("result", result);
					
			} else {
				String result = "<script>"
						+ "alert('���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.');"
						+ "history.go(-1);"
						+ "</script>";
				request.setAttribute("result", result);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "/WEB-INF/views/member/login.jsp";
	}

}