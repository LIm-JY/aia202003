//package com.aia.op.board.service;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.aia.op.board.dao.BoardDao;
//import com.aia.op.board.model.Board;
//import com.aia.op.jdbc.ConnectionProvider;
//
//@Service
//public class BoardWriteService {
//	
//	@Autowired
//	BoardDao dao;
//	
//	public int boardWrite(Board board, HttpServletRequest request){
//		
//		int result=0;
//		
//		
//		
//		try {
//						
//			Connection conn;
//			conn = ConnectionProvider.getConnection();
//			System.out.println(board);
//			
//			result = dao.insertBoard(conn, board);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		return result;
//		
//	}
//	
//
//}
