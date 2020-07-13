package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController2 extends HttpServlet{

	// 1. Http�� ��û�� �޴´�.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// 2. ����� ��û �ľ� : request ��ü�� �̿�
		//    request.getParameter(name)
		//    request.getRequestURL()
		//    request.getRequestURI() �ڡڡڡڡ�
		//String type = request.getParameter("type");
		String type = null;
		String command = request.getRequestURI();
		System.out.println(command);
		System.out.println(command.indexOf(request.getContextPath()));
		
		// /fc/date
		if(  command.indexOf(request.getContextPath()) == 0 ) {
			type = command.substring(request.getContextPath().length());
		}
		
		
		System.out.println("��û �ľ� : " + type);
		
		// 3. �ٽ� ó�� : ��� ����
		Object resultObj = null;
		String page = "/WEB-INF/views/simple_view.jsp";
		
		// http://localhost:8080/fc/greeting
		// http://localhost:8080/fc/date
		if(type == null || type.equals("/greeting") ) {
			resultObj = "�ȳ��ϼ���";
			page="/WEB-INF/views/view01.jsp";
		} else if(type.equals("/date")) {
			resultObj = new Date();
			page="/WEB-INF/views/view02.jsp";
		} else if(type.equals("/")) {
			page = "/WEB-INF/views/index.jsp";
		} else {
			resultObj = "Invalid Type";
		}
		System.out.println("�ٽ� ó�� ��� : " + resultObj);
		
		// 4. ��� �����͸� �Ӽ��� ���� : view �������� ����(����)
		request.setAttribute("result", resultObj);
		System.out.println("�Ӽ��� ����");
		
		// 5. ������
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}

	
	
	
}