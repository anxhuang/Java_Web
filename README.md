# Java Web Practice 

**Exam code:** 1Z0-899  
**Exam name:** Oracle Certified Expert, Java EE 6 Web Component Developer (OCE-JWCD)  

## 7/14
**S121:** doGet(), java.io.PrintWriter, response.getWriter(), setCharacterEncoding(), setContentType()  
**j121:** JSP comment, declaration, expression, scriptlet, directive, out.print()  
**j122:** \<form> input submit by GET method (pure html) -> S122  
**S122:** \<form> j122.jsp -> request.getParameter()  

## 7/17
**F211:** Filter{}, doFilter() and setting \<filter> \<filter-mapping>in web.xml  
**S211:** getServletContext().getInitParameter("key") and setting \<context-param> in web.xml //global variables  
**j211:** Expression Language(EL) ${} => math operation, condition operation, empty check  
**S212:** getServletConfig().getInitParameter("key")  and setting \<servlet> \<servlet-mapping> in web.xml //servlet variables  
**j212:** Expression Language(EL) ${} => request.setAttribute() and return by requestScope.array[0]; //implicit variables  
**j213:** Random(), request.getRequestURI()  

## 7/19
> banner/footer  

**S221:** request.getRequestDispatcher("/banner.jsp").include(request, response);  
**j221:** \<form> login page -> S222  
**S222:** \<form> j221.jsp -> request.getParameter()  
**j222:** \<form> info page -> S223  
**S223:** \<form> j221.jsp -> Enumeration\<String> p_name=request.getParameterNames();  
**j223:** EL, no casting the number, request.setAttribute() priority: page > request > session | application  

## 7/24
**S311:** .getServletConfig().getInitParameter("key") by  @WebInitParam=(name="key", value="val"), in @WebSevlet  
**j311:** JSTL, invoke lib/taglibs-*.jar, <c:set>, <c:out>, <c:if>, <c:choose> with <c:otherwise>, \<fmt:formatNumber>  
**j312:** \<form> add 2 nums -> j313.jsp  
**j313:** \<form> j312.jsp -> use request.getParameter() in scriplet and output by out.print() or by EL param.var, \<%＠ page isELIgnored="true"%>  
**L311:** ServletContextListener, Liftcycle and setting \<listener> \<listener-class> in web.xml  
**L312:** ServletRequestListener, Liftcycle for request triggered only  
**MySQL:** Installation, SHOW DATABASES;  

## 7/26
> MySQL: CREATE sample DB,TABLE by txt file. USE database, SELECT * FROM table  

**S321:** class.forName("com.mysql.jdbc.Driver"), try{Connection, Satement and ResultSet}catch(Exception e) to read MySQL table rows  
**j321:** \<form> table insert page -> S322  
**S322:** \<form> j321 -> PreparedStatement, INSERT INTO table VALUES(?,?); .setString(index, "val"), .exexcuteUpdate()  
**j322:** \<%＠ page import="java.util.ArrayList/HashMap" %>, request.setAttribute("name", arr/map) in scriplet and output by EL ${name[i]/["key"]}  
**j323:** JSTL, <c:forEach>, <c:forTokens> and for-loop in scriptlet  

## 7/31
**j411:** JSTL, \<sql:setDataSource>, \<sql:query>, output by EL ${rs.rows}, escapeXml="false"  
**j412:** \<form> furit -> j413.jsp  
**j413:** \<form> JavaBean(Fruit.java) -> \<jsp:useBean id="" class="code.util.Fruit" scope="request">, \<jsp:setProperty>, \<jsp:getProperty>  
**S411:** request.setServletContext(), setAttribute("key","val") trigger Listener -> L411  
**L411:** S411 -> ServletContextListener, return changes to attributes  
**S412:** Request, getRequestURI(), -URL(), -ContextPath(), -ServletPath(), -Name(), -Port(), -RemoteAddr(), -Host(), -Port(), -User()  

## 8/2
**j421:** \<form> radio, checkbox -> S412  
**S412:** j412.jsp -> request.getParameterValues("checkbox_name") in array and output by for(i:arr){}  
**j422:** JSP basic review and \<jsp-config>, \<jsp-property-group>, \<url-pattern> + \<scripting-invalid> true => throws Exception  
**j423:** hyperlink create/destroy session -> S423  
**S422:** request.getSession(true) to create session, .isNew(), .getId(), .getCreationTime(), .getLastAccessedTime(), get/setAttribute("key","val")  
**S423:** request.getSession().invalidate() to destroy session  
**j424:** \<form> radio -> j425.jsp  
**j425:** \<form> JavaBean(Meat.java) -> fine for set String but throws Exception for Boolean  

## 8/7
> Use Notepad to build all files in Tomcat's folder  
web.xml: \<welcome-file-list>, \<filter>, \<context-param>  

**L511:** default filter for Context Web  
**S511:** import annotation for @WebServlet("/CLASS"), getServletContext().getInitParameter("key")  
**j511:** JSP Document: \<jsp:directive>, \<jsp:declaration>, \<jsp:expression>, \<jsp:scriptlet>, \<!-- comment -->

## 8/9
**j521:** \<form> login info -> S521  
**S521:** \<form> j521 -> Cookie("key","val"), setMaxAge(secs), response.addCookie(cookie)  
**S522:** \<form> S521, request.getRequestDispatcher("/S522").forward(request, response) -> S522  
**S523:** request.getCookies(), .getName(), getValue()  
**j522:** tags, \<tag: filename key="val"> -> filename.tag: \<%＠ attribute name="key" %>, ${val}  
**j523:** JSTL, \<sql:setDataSource>, \<c:forEach>, same as j411  

## 8/14
**j611:** \<form> File upload -> S611
**S611:** \<form> j611 -> ＠MultipartConfig() or web.xml, File.separator, File io, Part.getHeader(), .split(), .trim(), .startsWith(), .indexOf(), .length(), -> j612  
**j612:** \<form> S611 -> show file upload result  
**j613:** tags, required="true", pageEncoding="UTF-8", \<jsp:doBody/>, body-content="scriptless"  
**L611:** Listener, HttpSessionBindingListener -> S612  
**S612:** L611 -> see Tomcat log console  

## 8/16
**tld621:** tags, TLD, add two doubles, number format -> add.tld, nf.tld -> Tld621,Tld622  
**Tld621:** add.tld -> Tld621 -> tld621.jsp  
**Tld622:** nf.tld -> Tld622 -> tld621.jsp  
**S621:** Calendar, .getInstance(), response.setIntHeader("refresh",sec), \<select>  
**S622:** Header, Enumeration, request.getHeaderNames(), .getHeader()  
**S623:** Asynchronous, AsyncContext, ExecutorService, Executors, asyncSupported=true, org.apache.catalina.ASYNC_SUPPORTED, .submit(), destroy(), .shutdown() -> A623  
**A623:** S623 -> Thread, Runnable, .sleep(sec), .complete()  

## 8/21
> Security Login  
folder "s": conf/tomcat-users.xml, web.xml  \<form-login-config>, \<form-login-page>, \<form-error-page>  

**login.jsp:** \<form> login page, action="j_security_check", name="j_username", password="j_password" 
**error.jsp:** nothing special  
**S711:** ServletContext Parameter  

## 8/23
**j721:** \<form> locale code for ResourceBundle -> S721  
**S721:** \<form> j721 -> read ResourceBundle by GET (need study to solved UTF-8)  
**S722:** synchronized Session  
**S723:** Session Listener (no work?)  
**S724:** System Parameters  
**j722:** JSP Documents  

## 8/28
**S812:** WebInitParam(name="P" value="/path"), getServletContext().getResourcePaths(P) auto load file names in folder  
**S813:** Do the same thing but through web.xml  
**F811:** UTF-8 Filter, request.setCharacterEncoding("UTF-8"), response.setContentType("text/html; charset=UTF-8")  
**F812:** counter Filter  
**j811:** show row values in MySQL "memo/t_memo"  
**j812:** \<form> input field for "memo" -> S811  
**j813:** \<c:forEach varStatus="s"> s.index returns the array-index  

## 8/30
**S811:** \<form> j812 -> INSERT MySQL -> j811  
**j821:** \<form> select meal -> MealType:enum, MealSelect:class, S821 -> j822  
**j822:** \<form> show store list for MealType, List, Iterator  
**j823:** \<c:set var="varName" value="val">, request.setAttribute("exceptionName", new Exception("")), \<c:catch var="exceptionName">...\</c:catch> ${exceptionName.message}  

## 9/4
**j911:** empty, pageContext, \<jsp:include page="*.jsp">  
**S911:** request.getHeaderNames();  
**j912:** \<form> Java Bean -> Product.java (class)  
**j913:** \<form>Product.java (class) -> j913  
**S912:** response.addHeader(), response.setHeader(), request.getHeader(), request.getIntHeader()  
**j914:** \<iframe src="S913">, \<iframe src="S914">  
**S913:** top-half of S621  
**S914:** bottom-half of S621  

