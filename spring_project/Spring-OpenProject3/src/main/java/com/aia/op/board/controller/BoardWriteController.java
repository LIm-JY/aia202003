//package com.aia.op.board.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.aia.op.board.model.Board;
//import com.aia.op.board.service.BoardWriteService;
//
//@Controller
//@RequestMapping("/board/boardForm")
//public class BoardWriteController {
//
//	@Autowired
//	BoardWriteService writeService;
//	
//	
//	@RequestMapping(method = RequestMethod.GET)
//	public String getBoardForm() {
//		return "board/boardForm";
//	}
//	@RequestMapping(method = RequestMethod.POST)
//	public String getBoard(
//			Board board, 
//			HttpServletRequest request, 
//			Model model) {
//		
//		System.out.println("controller: "+board);
//		
//		model.addAttribute("result" , writeService.boardWrite(board, request));
//		
//		return "board/board";
//		
//	}
//	
//	
//}
