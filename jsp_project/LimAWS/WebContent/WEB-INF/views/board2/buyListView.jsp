<%@page import="board.model.Board"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<Board> listAll = (List) request.getAttribute("listAll");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	

		<style>
td>img {
	width: 50px;
	height: 50px;
}
</style>
		</head>
		<body>

			리스트 ${listAll}
			<hr>
			<c:if test="${not empty listAll}">
				<h1>전체 게시글 수: ${cntAll} 개</h1>
				<hr>
				<hr>

				<c:if test="${not empty listAll}">
					<c:forEach items="${listAll}" var="board">
						<table>
							<tr>
								<td><h3>${board.idx}</h3></td>
								<td><h3>${board.userId}</h3></td>
								<td><h3>${board.title}</h3></td>
								<td><h3>${board.content}</h3></td>
							</tr>
							<tr>
								<td><h3>${board.idx}</h3></td>
								<td><h3>${board.userId}</h3></td>
								<td><h3>${board.title}</h3></td>
								<td><h3>${board.content}</h3></td>
							</tr>
						</table>

					</c:forEach>
				</c:if>

			</c:if>

			<c:if test="${empty listAll}">
작성된 게시글이 없습니다
</c:if>
	

</body>
</html>