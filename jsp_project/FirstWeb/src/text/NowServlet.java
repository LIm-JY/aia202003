package text;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1/서블릿 클래스를 만들기 위해서는 HttpServlet클래스를 반드시 상속해야 한다.
public class NowServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//응답처리: HTML문서를 만든다.
		
		resp.setContentType("text/html; charset=utf-8");
		

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("\t<head>");
		out.println("\t\\t<title>서블릿테스트</title>");
		out.println("\t<head>");
		out.println("<body>");
		out.println("\t\t<h1>안녕하세요. 서블릿클래스로 만들어진 페이지 입니다.</h1>");
		out.println("\t\t<p>현재시간은: "+new Date()+"입니다.</p>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(
			HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {

	
	}
	
	//2.요청에 맞는 처리를 위한 메서드를 선택 오버라이딩 해준다.

	
}
