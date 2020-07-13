package service;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServiceImpl implements Service{
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		
		// viewpage
				String viewPage = "WEB-INF/views/view02.jsp";
				
				//览翠 单捞磐 贸府
				Date now = new Date();
				
				
				// request 加己俊 历厘
				request.setAttribute("result", now);
		
		return viewPage;
	}

	

}
