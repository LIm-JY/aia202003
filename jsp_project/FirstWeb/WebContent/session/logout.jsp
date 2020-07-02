<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그아웃: session 객체소멸
	session.invalidate();

	response.sendRedirect("../index.jsp");
%>