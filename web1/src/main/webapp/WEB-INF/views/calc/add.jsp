<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
	<div>
		<input type="text" name="num1" id="num1" size="5" value="${numDTO.num1}"/>+
		<input type="text" name="num2" id="num2" size="5" value="${numDTO.num2}"/>=
		<input type="text" name="result" id="result" size="5"/>
		<button type="submit">전송</button>
	</div>
</form>
</body>
</html>