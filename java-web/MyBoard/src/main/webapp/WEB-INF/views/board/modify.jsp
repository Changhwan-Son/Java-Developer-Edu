<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 </title>
</head>
<body>

	<form action="/board/modify" method="post">
		
		<div>
			<label>글 번호 </label>
			<input name="bno" value="${board.bno }"/>
		</div>
		<div>
			<label>Title</label>
			<input name="title"/>
		</div>
		
		<div>
			<label>Text area</label>
			<textarea rows="3" name="content"></textarea>
		</div>
		
		
		
		<button type="submit">게시글 수정</button>
	</form>
</body>
</html>