<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul class="actions vertical">
		<li><h5>회원가입</h5></li>
		<form action="joinService.do" method="post">
			<li><input type="text" placeholder="Email을 입력하세요" name="email">
			<li><input type="password" placeholder="PW를 입력하세요" name="pw"></li>
			<li><input type="text" placeholder="전화번호를 입력하세요" name="tel"></li>
			<li><input type="text" placeholder="집주소를 입력하세요" name="addr"></li>
			<li><input type="submit" value="JoinUs" class="button fit"></li>
		</form>
	</ul>
</body>
</html>