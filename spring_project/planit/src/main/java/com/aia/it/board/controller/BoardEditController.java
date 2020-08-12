package com.aia.it.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aia.it.board.model.BoardEditRequest;
import com.aia.it.board.service.BoardEditService;

@Controller
@RequestMapping
public class BoardEditController {
	
	@Autowired
	BoardEditService editService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getBoardEditForm() {
		
		return"board/boardEditForm";
	}
	
	public String getBoardEdit(
			BoardEditRequest editRequest,
			HttpServletRequest request,
			Model model
			) {
		
		
		model.addAttribute("result" editService.boardEdit(editRequest,request));
				return "board/boardEdit";
		
		
	}
	

}
