package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("WAS ���� !!!");

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("WAS ���� !!!");
		ServletContext context = sce.getServletContext();
		String path = context.getInitParameter("uploadPath");
		String realPath = sce.getServletContext().getRealPath(path);
		System.out.println(realPath);
		
		System.out.println("���� ���ε� ���: "+path);
	}

}
