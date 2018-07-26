<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center">
		<h2>JSP/Servlet , j221.jsp</h2>
		
		<h3>
			<form action="S222">
				Id: <input type="text" name="id" value="jsp"><br>
				密碼: <input type="password" name="password" value="1234"><br>
				<input type="submit" value="登入"><br>
			</form>
		</h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>