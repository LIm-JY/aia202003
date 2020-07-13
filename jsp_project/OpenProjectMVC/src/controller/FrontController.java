package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.NullServiceImpl;
import service.Service;

public class FrontController extends HttpServlet{
	
	private Map<String, Service> commands = new HashMap<String, Service>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		// 1. commandService.propertise(�ܺ� ����) =>  Propertise
		// /index=service.IndexServiceImpl
		// 2. Ŭ���� ������ Ŭ�������� ���� -> �ν��Ͻ� ����
		// 3. map �� ����� ��û command �� �ν��Ͻ��� ����
		
		
		// 1. �ܺ� ���� ������ ������ �޸��� �����ͷ� �̵� 
		
		Properties prop = new Properties();
		
		FileInputStream fis = null;
		
		// ���������� �� ���
		String path = "/WEB-INF/commandService.properties";
		// ���������� �ý��� ������
		String configFile = config.getServletContext().getRealPath(path);
		
		
		try {
			fis = new FileInputStream(configFile);
			// ������Ƽ ��ü�� ������ �о� �´�.
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator itr = prop.keySet().iterator();
		
//		while(itr.hasNext()) {
//			String command = (String) itr.next();
//			String serviceClassName = prop.getProperty(command);
//			System.out.println(command + "=" + serviceClassName);
//		}
		
		while(itr.hasNext()) {
			// ����� ��û URI
			String command = (String) itr.next();
			// ����� ��û�� ó���� ���� Ŭ���� �̸�, ����
			String serviceClassName = prop.getProperty(command);
			
			try {
				// �ν��Ͻ� ������ ���� Class ��ü
				Class serviceClass = Class.forName(serviceClassName);
				
				// �ν��Ͻ� ����
				Service service = (Service) serviceClass.newInstance();
				
				commands.put(command, service);
				System.out.println(command + "=" + service );
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
//		commands.put("/", new IndexServiceImpl());
//		commands.put("/index", new IndexServiceImpl());
//		commands.put("/greeting", new GreetingServiceImpl());
//		commands.put("/date", new DateServiceImpl());
//		commands.put("null", new NullServiceImpl());
		
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

		Service service = commands.get(type);
		
		if(service == null) {
			service = new NullServiceImpl();
		}
		

//		if(type.equals("/greeting") ) {
//			service = new GreetingServiceImpl();
//		} else if(type.equals("/date")) {
//			service = new DateServiceImpl();
//		} else if(type.equals("/") || type.equals("/index") ) {
//			service = new IndexServiceImpl();
//		} else {
//			service = new NullServiceImpl();
//		}
		
		String page = service.getViewPage(request, response);
		
	
		// 5. ������
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}


	// 1. Http�� ��û�� �޴´�.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	
	
}