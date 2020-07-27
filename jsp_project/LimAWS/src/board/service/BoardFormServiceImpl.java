package board.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDao;
import board.model.Board;
import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import service.Service;

public class BoardFormServiceImpl implements Service {

MemberDao dao;
	
	@Override
	public String getViewPage(
			HttpServletRequest request, 
			HttpServletResponse response) {
		
		System.out.println("타니");
//		String title=(String)request.getParameter("title");
//		String content=(String)request.getParameter("content");
//		System.out.println("title:"+title);
//		System.out.println("content:"+content);
//		System.out.println("--------------------");
//		
//		Board board=new Board();
//		board.setTitle(title);
//		board.setContent(content);
//		
//		request.setAttribute("board",board);
//		
//		BoardDao dao=BoardDao.getInstance();
//		
//		Connection conn;
//		try {
//			conn = ConnectionProvider.getConnection();
//			dao.insertBoard(conn, board);
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
		return "/WEB-INF/views/board/boardForm2.jsp";
	}

}
