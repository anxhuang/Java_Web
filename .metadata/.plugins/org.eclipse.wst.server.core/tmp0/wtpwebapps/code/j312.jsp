<%@ page language="java"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/EL, j312.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		<form action="j313.jsp">
			數1: <input type="text" name="n1" value="7"><br>
			數2: <input type="text" name="n2" value="24"><br>
			<input type="submit" value="Add"><br>
		</form>

				
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>