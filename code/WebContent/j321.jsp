<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center">
		<h2>JSP/Servlet , j321.jsp</h2>
		
		<h3>
			<form action="S322">
				#ID: <input type="text" name="no" value="11"><br>
				名稱: <input type="text" name="name" value=""><br>
				價格: <input type="text" name="price" value=""><br>
				數量: <input type="text" name="qty" value=""><br>
				日期: <input type="text" name="date" value="2018/07/26"><br>
				<input type="submit" value="新增"><br>
			</form>
		</h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>