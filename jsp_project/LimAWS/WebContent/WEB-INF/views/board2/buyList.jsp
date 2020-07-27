<%@page import="guestbook.model.MessageListView"%>
<%@page import="guestbook.service.GetMessageListService"%>
<%@page import="login.LoginInfo"%>
se
<%@ page language="java" contentType="text/html; chart=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%
	LoginInfo info = (LoginInfo) request.getAttribute("info");
    
    
    
%>

<head>
<meta charset="UTF-8">
</head>
<body>

		<table>
			
				<tr>
					<th>아이디 </th>
					<td> ${info.uid}<input type="hidden" name="uid" value="${info.uid}"> </td>
				</tr>
				<tr>
					<td>제목</td>
					<td> <input type="text" name="title" required> </td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea name="content"col="20" row="20" required></textarea></td>
				</tr>
				<tr>
					<td></td>
					<td> 
						<input type="submit" name="작성">
						<input type="reset">
					</td>
				</tr>
			</table>
	
	
	

</body>
