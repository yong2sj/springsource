<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<div> <!-- 링크를 눌러서 들어가는건 대부부 GET방식 -->
	<%-- 모든 요청은 컨트롤러로 들어감 --%>
 	<p><a href="/sample/basic">basic</a></p>
	<p><a href="/sample/doA">doA</a></p>
	<p><a href="/sample/login">login</a></p>
	<p><a href="/sample/insert">insert</a></p>
</div>
<div>
	<p><a href="/board/insert">insert</a></p>
	<p><a href="/board/modify">modify</a></p>
	<p><a href="/board/read">read</a></p>
	<p><a href="/board/list">list</a></p>
</div>
</body>
</html>
