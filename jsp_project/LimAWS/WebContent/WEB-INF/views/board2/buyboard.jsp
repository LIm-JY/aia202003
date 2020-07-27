<%@page import="login.LoginInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	LoginInfo info = (LoginInfo) request.getAttribute("info");
    
    
    
%>
<!doctype html>
<html lang="ko">
  <head>
  	<title>Sidebar 03</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/sidebar-03/css/style.css">
  </head>
  <body>
		
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar" class="active">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	          <i class="fa fa-bars"></i>
	          <span class="sr-only">Toggle Menu</span>
	        </button>
        </div>
				<%@ include file="/sideMenu.jsp" %>
    	</nav>

        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5 pt-5">
        <h2 class="mb-4"><a href="${pageContext.request.contextPath}/index.html">홈으로</a></h2>
        <h1>구매게시판</h1>
        
        
        
        	<c:if test="${empty info}">
		<script>
			alert('로그인이 필요합니다');
		</script>
		</c:if>
		<c:if test="${!empty info}">
		
		<h3><a href="write.jsp">글쓰기</a></h3>
		
		<%@ include file="buyListView.jsp" %>
		
		
		
	</c:if>
        
      </div>
		</div>

    <script src="<%=request.getContextPath() %>/sidebar-03/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/sidebar-03/js/popper.js"></script>
    <script src="<%=request.getContextPath() %>/sidebar-03/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/sidebar-03/js/main.js"></script>
  </body>
</html>