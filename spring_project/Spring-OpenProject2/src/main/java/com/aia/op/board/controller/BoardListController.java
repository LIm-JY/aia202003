package com.aia.op.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aia.op.board.service.BoardListService;

@Controller
@RequestMapping("/board/boardList")
public class BoardListController {
	
	
	@Autowired
	BoardListService listService;
	
	@RequestMapping("/board/noardList")
	public String getBoardList(Model model, 
			HttpServletRequest request,
			HttpServletResponse response
			) {
		
		model.addAttribute("listView",listService.getView(request, response));
		return "/board/boardList";
	}
	
	

}
