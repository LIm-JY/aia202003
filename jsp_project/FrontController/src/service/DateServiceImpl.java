package service;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServiceImpl implements Service{
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		
		// viewpage
				String viewPage = "WEB-INF/views/view02.jsp";
				
				//���� ������ ó��
				Date now = new Date();
				
				
				// request �Ӽ��� ����
				request.setAttribute("result", now);
		
		return viewPage;
	}

	

}
