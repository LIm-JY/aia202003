package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDao;
import board.model.Board;
import jdbc.ConnectionProvider;
import login.LoginInfo;
import member.dao.MemberDao;
import member.model.Member;
import service.Service;

public class BuyerBoardContentServiceImpl implements Service {

MemberDao dao;
	
	@Override
	public String getViewPage(
			HttpServletRequest request, 
			HttpServletResponse response) {
//		title content
		
		LoginInfo info=(LoginInfo)request.getAttribute("info");
		System.out.println("정보확인:"+info);
		Member member=(Member)request.getAttribute("member");
		System.out.println("member정보확인:"+member);
		List<Member> list=(List)request.getAttribute("list");
		System.out.println("list정보확인:"+list);
		System.out.println("--------------------");
		
		String uid=(String)request.getParameter("uid");
		System.out.println("uid:"+uid);
		
		
		String title=(String)request.getParameter("title");
		String content=(String)request.getParameter("content");
		System.out.println("title:"+title);
		System.out.println("content:"+content);
		System.out.println("--------------------");
		
//		board.setTitle(title);
//		board.setContent(content);
//		board.setUserId(uid);
//		
		//System.out.println("게시물 등록 완료");
		BoardDao dao=BoardDao.getInstance();
		
		int idx=Integer.parseInt(request.getParameter("idx"));
		
//		List<Board> listAll=new ArrayList<>();
		Board board=new Board();
		Connection conn;
		try {
			conn = ConnectionProvider.getConnection();
			//dao.insertBoard(conn, board);
			//listAll=dao.selectAllList(conn);
			board=dao.selectByIdx(conn, idx);
			int cntAll=dao.selectTotalCount(conn);
			request.setAttribute("cntAll",cntAll);
			request.setAttribute("board",board);
			
			System.out.println("선택된 board:"+board);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		request.setAttribute("board",board);
		System.out.println("board:"+board);
		

		return "/deleteContent.jsp";
	}

}









