package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServiceImpl implements Service{
	
	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		// viewpage
		String viewPage = "WEB-INF/views/view01.jsp";
		
		//���� ������ ó��
		String result = "�ȳ��ϼ���";
		
		
		// request �Ӽ��� ����
		request.setAttribute("result", result);
		
		return viewPage;
	}

	

}
