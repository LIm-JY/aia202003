package com.aia.op.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.op.board.model.BoardRequest;
import com.aia.op.board.service.BoardWriteService;

@Controller
@RequestMapping("/board/boardForm")
public class BoardWriteController {

	@Autowired
	BoardWriteService writeService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String getBoardForm() {
		return "board/boardForm";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String getBoard(
			BoardRequest boardRequest, 
			HttpServletRequest request, 
			Model model) {
		
		System.out.println("controller: "+boardRequest);
		
		model.addAttribute("result" , writeService.boardWrite(boardRequest, request));
		
		return "board/board";
		
	}
	
	
}
