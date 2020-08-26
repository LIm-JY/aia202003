<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>댓글쓰기</h1>

<div>
		<h1 class="subtitle">댓글 작성</h1>
		<form action="<c:url value='/comment/comment'/>" method="post" enctype="multipart/form-data">
			<table>
				<!-- <tr>
					<td><label for="cidx">댓글인덱스</label></td>
					<td><input type="text" id="cidx" name="cidx" required></td>
				</tr> -->
				<tr>
					<td><label for="bidx">보드인덱스</label></td>
					<td><input type="text" id="bidx" name="bidx" value ="${viewBoard.bidx}" required></td>
				</tr>
			
				<tr>
					<td><label for="cmsg">메시지</label></td>
					<td><textarea name="cmsg" id="cmsg" rows="10" cols="20"
							required></textarea></td>
				</tr>
				<tr>
					<td><label for="uname">이름</label></td>
					<td><input type="text" name="uname" id="uname"></td>
				</tr>
				<tr>
				<td></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="글쓰기"> <input
						type="reset"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>