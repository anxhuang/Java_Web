<%@ page language="java"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/JSTL/Database, j411.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/cost"
		 user="root" password="1234" />
		<sql:query var="rs" dataSource="${db }">
			SELECT * FROM t_cost;
		</sql:query>
		<table width="80%" border="1">
			<tr><td>#ID</td><td>名稱</td><td>價格</td><td>數量</td><td>日期</td></tr>
			<c:forEach var="row" items="${rs.rows }">
				<tr>
					<td><c:out value="${row.no }" escapeXml="false" /></td>
					<td><c:out value="${row.name }" escapeXml="false" /></td>
					<td><c:out value="${row.price }" escapeXml="false" /></td>
					<td><c:out value="${row.qty }" escapeXml="false" /></td>
					<td><c:out value="${row.date }" escapeXml="false" /></td>
				</tr>
			</c:forEach>
		</table>	
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>