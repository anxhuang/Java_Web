<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<h2>EL, j212.jsp</h2><h3>
	
	<img alt="" src="JSP.bmp"><br><br>
	
	<%//scriptlet
	
		String[]	fruits={"melon", "kiwi", "pear"};
		request.setAttribute("fruits", fruits);
	%>
	
	Fruits: ${requestScope.fruits[0] }<br> <!-- EL can only output "implicit variables"  -->
	水果: ${requestScope["fruits"][2] }<br><br>
	</h3>

</body>
</html>