<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

<table class="">
					<tr>
						<th>번호</th>
						<th>작성자</th>
						<th>대분류</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
					<c:if test="${sortArticles ne null}">
						<tbody>
							<c:forEach items="${sortArticles.articleList}" var="at">
								 <tr>
									<th>${at.idx}</th>
									<th>${at.user_id}</th>
									<th>${at.item_category}</th>
									<th><a href="<c:url value="/board/sellerBoardViewer.do"/>?idx=${at.idx}">${at.title}</a></th>
									<th>${at.reg_date}</th>
									<th>${at.view_count}</th>
								</tr>
							</c:forEach>
						</tbody>
					</c:if>
				</table>
		<c:if test="${sortArticles eq null}">
					<hr>
					<h1>출력 할 게시물이 없습니다!</h1>
				
					<hr>
					</c:if>