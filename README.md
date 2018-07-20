# Java Web Practice 
This project is the record of preparing OCE-JWCD certificate exam.

Exam code: IZ0-899  
Exam name: Oracle Certified Expert, Java EE 6 Web Component Developer (OCE-JWCD)  

# 7/14
S121: doGet(), java.io.PrintWriter, response.getWriter(), setCharacterEncoding(), setContentType()  
j121: JSP comment, declaration, expression, scriptlet, directive, out.print()  
S122: \<form> j122.jsp -> request.getParameter()  
j122: \<form> input submit by GET method (pure html) -> S122  

# 7/17
F211: Filter{}, doFilter() and setting <filter> <filter-mapping>in web.html  
S211: getServletContext().getInitParameter() and setting <context-param> in web.html //global variables  
j211: Expression Language(EL) ${} => math operation, condition operation, empty check  
S212: getServletConfig().getInitParameter()  and setting <servlet> <servlet-mapping> in web.html //servlet variables  
j212: Expression Language(EL) ${} => request.setAttribute() and return by requestScope.array[0]; //implicit variables  
j213: Random(), request.getRequestURI()  

# 7/19
banner/footer  
S221: request.getRequestDispatcher("/banner.jsp").include(request, response);  
j221: \<form> login page -> S222  
S222: \<form> j221.jsp -> request.getParameter()  
j222: \<form> info page -> S223  
S223: \<form> j221.jsp -> Enumeration<String> p_name=request.getParameterNames();  
j223: EL, no casting the number, request.setAttribute() priority: page > request > session | application  
