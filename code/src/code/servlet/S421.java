package code.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S421
 */
@WebServlet("/S421")
public class S421 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S421() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher	rd=request.getRequestDispatcher("/banner.jsp");
		rd.include(request, response);
		PrintWriter	out=response.getWriter();
		//
		out.println("<center><div>");
		out.println("<h2>JSP/Servlet, S421</h2><h3><font color='blue'>");
		out.println("姓名: "+request.getParameter("name")+"<br>");
		out.println("性別: "+request.getParameter("gender")+"<br>");
		out.println("喜好: <ul>"); //ul: un-order list      ol: order list
		for (String l:request.getParameterValues("like")){
			out.println("<li>"+l+"</li>");
		}
		out.println("</ul></h3></font></div></center>");
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
