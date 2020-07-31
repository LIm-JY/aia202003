package com.aia.mvc.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ReportController {

	@RequestMapping("/report/reportForm")
	public String getReportForm() {
		
		return "/report/reportForm";
	}
	
	@RequestMapping("/report/upload1")
	public String upload1(
			@RequestParam("sno") String sno,
			@RequestParam("report") MultipartFile report
			) {
		
		
		String fileName = report.getOriginalFilename();
		long fileSize = report.getSize();
		
		
		model.addAttribute("report", fileName+"("+fileSize+")");
		
		return "report/upload";
	}
	
	
}
