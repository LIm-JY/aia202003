<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INDEX</title>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<link rel="stylesheet" href="<%= request.getContextPath() %>/css/default.css">

<style>

</style>
</head>
<body>

	<%@ include file="/WEB-INF/views/include/header.jsp" %>

	<div>
		<h1 class="subtitle">글쓰기</h1>
		<hr>
		<form id="regForm" method="post" enctype="multipart/form-data">
			<table class="table">
				<tr>
					<td>제목</td>
					<td> <input type="text" name="title" id="title" >
					 </td>
				</tr>
				<tr>
					<td>내용</td>
					<td> <input type="text" name="content" required> </td>
				</tr>
			<!-- 	<tr>
					<td>사진</td>
					<td> <input type="file" name="photo"> </td>
				</tr> -->
				<tr>
					<td></td>
					<td> 
						<input type="submit" name="글쓰기">
						<input type="reset">
					</td>
				</tr>
			</table>
		</form>
	</div>

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
</body>
</html>
<!-- <script>
	
	$(document).ready(function(){
		
		$('#regForm').submit(function(){
			
			if(!$('#idchk').prop('checked')){
				alert('아이디 중복 체크는 필수 항목 입니다');
				$('#uid').focus();
				return false;
			}
			
			
			
		});
		
		$('#uid').focusin(function(){
			
			$(this).val('');
			$('#idchk').prop('checked', false);
			
			$('#checkmsg').text('');
			
			$('#checkmsg').removeClass('check_not');
			$('#checkmsg').removeClass('check_ok');
		});
		
		$('#uid').focusout(function(){
			
			if($(this).val().length<1){
				$('#checkmsg').text("아이디 항목은 필수 항목입니다.");
				$('#checkmsg').addClass('check_not');
				return false;
			}
			
			// 비동기 통신
			$.ajax({
				url : 'idCheck',
				data : { uid : $(this).val()},
				success : function(data){
					if(data == 'Y'){
						$('#checkmsg').text("사용가능한 아이디 입니다.");
						$('#checkmsg').addClass('check_ok');
						$('#idchk').prop('checked', true);
					} else {
						$('#checkmsg').text("사용이 불가능한 아이디 입니다.");
						$('#checkmsg').addClass('check_not');
						$('#idchk').prop('checked', false);
					}
				}
			});
			
			
		});
		
		
	});
	
	
</script> -->









