<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<h2>JSP, j213.jsp</h2><h3>
	
	<img alt="" src="JSP.bmp"><br><br>
	
	<%@ page import="java.util.Random" %> <%-- directive --%>
	
	<% 
		Random r=new Random();
		int n=r.nextInt(9)+1; //n will be (0~8)+1 = 1~9
		out.println(n);				
	%> <%-- scriptlet --%>
	
	<br>
	<%=n %> <%-- expression --%>
	<br><br>
	<a href="<%=request.getRequestURI() %>">Try again </a>
	
	</h3>

</body>
</html>