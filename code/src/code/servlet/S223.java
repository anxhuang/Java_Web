package code.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S223
 */
@WebServlet("/S223")
public class S223 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S223() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd=request.getRequestDispatcher("/banner.jsp");
		rd.include(request, response);
		//
		PrintWriter	out=response.getWriter();
		String	user=request.getParameter("user");
		String	gender=request.getParameter("gender");
		String	fruit=request.getParameter("fruit");
		String	drink=request.getParameter("drink");
		out.println("<center><div style='width: 80%; height: 250px; margin-right: 250px;'>");
		out.println("<h2>JSP/Servlet , S223</h2><h3><font color='orange'>");
		out.println("姓名: "+user+"<br>");
		out.println("性別: "+gender+"<br>");
		out.println("水果: "+fruit+"<br>");
		out.println("飲料: "+drink+"<br></font><font color='darkgreen'>");
		//by Enumeration <start>
		Enumeration<String> type=request.getParameterNames();
		while(type.hasMoreElements()){
			String	u=type.nextElement().toString();
			out.println(request.getParameter(u)+"<br>");
		}
		//by Enumeration <end>
		out.println("<br></font></h3></div></center>");
		//
		rd=request.getRequestDispatcher("/footer.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
