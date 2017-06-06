<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>延長會員期限</h1>
會員帳號： ${result.member.contacterEmail}
${result.msg}
<br><br>
會員期限：${result.date}
<form action="postpone" method="POST">
<input type="hidden" name="id" value="${result.member.custId}"/>
延長至： <input type="date" name="postponeDate"/>
<input type="submit" value="送出" />
</form>
</body>
</html>