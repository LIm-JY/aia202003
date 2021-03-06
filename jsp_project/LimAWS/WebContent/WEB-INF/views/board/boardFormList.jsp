<%@page import="member.model.Member"%>
<%@page import="board.model.Board"%>
<%@page import="java.util.List"%>
<%@page import="login.LoginInfo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<Board> listAll = (List) request.getAttribute("listAll");
request.setAttribute("listAll", listAll);
Member member = (Member) request.getAttribute("member");
List<Member> list = (List) request.getAttribute("list");
request.setAttribute("member", member);
%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>List</title>
  <!-- Bootstrap -->
   <style>
     #container {
     /*  width: 70%; */
      /* margin: 0 auto;  */    /* 가로로 중앙에 배치 */
     /*  padding-top: 10%; */   /* 테두리와 내용 사이의 패딩 여백 */
    }
     
    #list {
      text-align: center;
    }
   
    #write {
      text-align: right;
    }
     
    /* Bootstrap 수정 */
    .table > thead {
      background-color: #b3c6ff;
    }
    .table > thead > tr > th {
      text-align: center;
    }
    .table-hover > tbody > tr:hover {
      background-color: #e6ecff;
    }
    .table > tbody > tr > td {
      text-align: center;
    }
    .table > tbody > tr > #title {
      text-align: left;
    }
     
    div > #paging {
      text-align: center;
    }
     
    .hit {
      animation-name: blink;
      animation-duration: 1.5s;
      animation-timing-function: ease;
      animation-iteration-count: infinite;
      /* 위 속성들을 한 줄로 표기하기 */
      /* -webkit-animation: blink 1.5s ease infinite; */
    } 
     
    /* 애니메이션 지점 설정하기 */
    /* 익스플로러 10 이상, 최신 모던 브라우저에서 지원 */
    @keyframes blink {
      from {color: white;}
      30% {color: yellow;}
      to {color: red; font-weight: bold;}
      /* 0% {color:white;}
      30% {color: yellow;}
      100% {color:red; font-weight: bold;} */
    }
  </style> 
</head>
<body>
  <div id="container">
    <div align="right">
      <!-- Login 검증 -->
      <!-- jstl의 if문은 else가 없어서 따로 검증해야함. -->
      <c:if test="${info != null}">
        <%-- <%@include file="loginOk.jsp" %> --%>
      </c:if>
      <c:if test="${info == null}">
        <%-- <%@include file="login.jsp" %> --%>
      </c:if>
    </div>
   
    <div id="list">
      <b>게시판 (전체 글: ${cntAll})</b>
    </div>
     
   <%--  <div id="write">
      <a href="/bbs/writeForm.bbs?pageNum=${pageNum}">글쓰기</a>
    </div> --%>
     
    <div>
      <table class="table table-striped table-bordered table-hover">
        <thead>
          <tr>
            <th width="10%">idx</th>
            <th width="10%">userId</th>
            <th width="50%">title</th>
            <th width="15%">date</th>
            <th width="10%">delete</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="board" items="${listAll}" varStatus="status">
            <tr>
              <td>${board.idx}</td>
              <td>${board.userId}</td>
              <td><a href="boardContentDetails.do?idx=${board.idx}">${board.title}</a></td>
              <td>${board.content}</td>
              <td><a href="editBoardContent.do?idx=${board.idx}">수정</a> <a href="javascript:memberDel(${board.idx})">삭제</a></td>
            <tr>
          </c:forEach>
        </tbody>
      </table>
           <span><button  onclick="moveToBoard()">글쓰기</button></span>
         <%--  <span><button >검색</button><input type="text"></<span> --%>
	       
       	<script>
       	function moveToBoard(){
       		location.href='board.do';
       	}
		function memberDel(idx) {
			if (confirm('선택한 게시글을 삭제하시겠습니까?')) {
				location.href = 'deletBoardContent.do?idx=' + idx;
			}
		}
	</script>
       
      <!-- Paging 처리 -->
    </div>
  </div>
</body>
</html>