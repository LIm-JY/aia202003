<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
</head>
<body>
	<h1>글쓰기</h1>
	
	<div>
		<h1 class="subtitle">방명록 작성</h1>
		<form method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td><label for="uidx">이름</label></td>
					<td><input type="text" id="uidx" name="uidx" required></td>
				</tr>
				<tr>
					<td><label for="btitle">제목</label></td>
					<td><input type="text" id="btitle" name="btitle" required></td>
				</tr>
				<tr>
					<td><label for="bmsg">메시지</label></td>
					<td><textarea name="bmsg" id="bmsg" rows="10" cols="20"
							required></textarea></td>
				</tr>
				<tr>
					<td><label for="bphoto">사진</label></td>
					<td><input type="file" name="bphoto1" id="bphoto1"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="file" name="bphoto2" id="bphoto2"></td>
				</tr>
				<tr>
				<td></td>
				<td><a href="view/${board.uidx}" >정보보기</a></td>
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