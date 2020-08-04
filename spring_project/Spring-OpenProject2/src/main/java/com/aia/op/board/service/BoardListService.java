package com.aia.op.board.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.board.dao.BoardDao;
import com.aia.op.board.model.Board;
import com.aia.op.board.model.BoardListView;
import com.aia.op.jdbc.ConnectionProvider;

@Service
public class BoardListService {

	@Autowired
	BoardDao dao;
	
	public BoardListView getView(
			HttpServletRequest request,
			HttpServletResponse response) {
		
		BoardListView listView = null;
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			//전체 게시물 개수 구하기
			int totalCnt = dao.selectTotalCount(conn);
			
			// 한 페이지 당 노출할 게시물 개수
			final int BOARD_CNT_PER_PAGE = 2;
			
			// 현재 페이지 번호
						int currentPageNumber = 1;
						String page = request.getParameter("page");
						if(page != null) {
							try {
								currentPageNumber = Integer.parseInt(page);
							} catch (NumberFormatException e) {
								System.out.println("숫자 타입의 문자열이 전달되지 않아 예외 발생");
							}
						}
						// 게시물의 첫번째 행의 index
						int startRow = 0;
						
						// 한 페이지에 누출할 리스트
						List<Board> boardList = null;
						
						if(totalCnt > 0) {
							startRow = (currentPageNumber-1)*BOARD_CNT_PER_PAGE;
							
							System.out.println(startRow);
							
							boardList = dao.selectList(conn, startRow, BOARD_CNT_PER_PAGE);
						} else {
							currentPageNumber = 0;
							boardList = Collections.emptyList();
						}
						
						
						listView = new BoardListView(
								totalCnt, 
								currentPageNumber, 
								boardList, 
								BOARD_CNT_PER_PAGE, 
								startRow);
						
								
						
						System.out.println(listView);
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	
		
		
		
		return listView;
		
	}
		
	
	

}
