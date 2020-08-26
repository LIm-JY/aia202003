<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<li><a href="<c:url value="/board/boardList"/>">게시글 리스트</a></li>
<li><a href="<c:url value="/board/boardWrite"/>">게시글쓰기</a></li>
<li><a href="<c:url value="/member/memberReg"/>">회원가입</a></li>
<li><a href="<c:url value="/login/login"/>">로그인</a></li>

<li><a href="<c:url value="/comment/comment"/>">댓글</a></li>


</body>
</html>