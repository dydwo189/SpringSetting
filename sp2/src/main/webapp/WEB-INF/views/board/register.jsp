<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/register" method="post">
<div>
	<label>Title</label>
	<input type="text" name="title" value="한글 제목">
</div>
<div>
	<label>Content</label>
	<input type="text" name="content" value="한글 내용">
</div>
<div>
	<label>Writer</label>
	<input type="text" name="writer" value="user00">
</div>
<div>
<input type="reset" value="초기화">
<input type="submit" value="제출">
<a href="/board/list">리스트</a>
</div>
</form>
</body>
</html>