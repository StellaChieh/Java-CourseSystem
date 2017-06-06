<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>延長會員期限</h1>
<h2>查單獨會員</h2>
<form method="POST" action="validaty/inspect">
	會員信箱: <input type="text" name="mailAddress"/>
	<input type="submit" value="查詢" />
</form>

<h2>查課程</h2>
<a href="/AMSpringMVC/class.jsp">按這裡</a>
</body>

<script>

</script>

</html>