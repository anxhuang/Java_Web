<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
<style type="text/css">
	div{
		width: 80%;
		height: 250px;
		margin-right: 130px;
	}
</style>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center">
		<h2>JSP/Servlet , j222.jsp</h2>
		
		<h3>
			<form action="S223">
				姓名: <input type="text" name="user" value="Anx Huang"><br>
				性別: <input type="text" name="gender" value="男"><br>
				水果: <input type="text" name="fruit" value="西瓜, cherry"><br>
				飲料: <input type="text" name="drink" value="Coffee, 茶"><br>
				<input type="submit" value="送出"><br>
			</form>
		</h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>