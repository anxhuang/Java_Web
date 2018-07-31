<%@ page language="java"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/javaBean, j412.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		<form action="j413.jsp">
			水果: <input type="text" name="title" value="水蜜桃"><br>
			<input type="submit" name="go" value="送出"><br>
		</form>

				
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>