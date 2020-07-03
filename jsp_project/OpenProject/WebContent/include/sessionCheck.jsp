<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.LoginInfo" %>

	<%
		
		LoginInfo loginInfo = (LoginInfo)session.getAttribute("loginInfo");
	
	if(loginInfo==null){
		%>
		
		<script>
		alert('로그인이 필요한 페이지 입니다.');
		location.href='<%=request.getContextPath()%>/member/loginForm.jsp';
		</script>
		<%
	}
	   %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>