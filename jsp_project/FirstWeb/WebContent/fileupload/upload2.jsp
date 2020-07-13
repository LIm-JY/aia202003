<%@page import="service.ReportRegService"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	ReportRegService service = ReportRegService.getInstance();
	int result = service.regReport(request);
	System.out.println("jsp파트" + result);
	request.setAttribute("result", result);
%>

	<jsp:forward page="upload_view.jsp"/>