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

public class MemberLogoutServiceImpl implements Service {

	MemberDao dao;
	
	@Override
	public String getViewPage(
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		// ���� ������ �Ҹ��ŵ�ϴ�.
		request.getSession().invalidate();
		
		
		return "/WEB-INF/views/member/logout.jsp";
	}

}
