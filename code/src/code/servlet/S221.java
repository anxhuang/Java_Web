package code.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S221
 */
@WebServlet("/S221")
public class S221 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S221() {
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
		PrintWriter out=response.getWriter();
		out.println("<center><div style='width: 80%; height: 250px; margin-right: 250px'>");
		out.println("<h2>Servlet/RequestDispatcher, S221</h2><h3>");
		Random	r=new Random();
		int		n=r.nextInt(9)+1;
		out.println("�H����/Random: "+n+"<br>");
		out.println("<a href='"+request.getRequestURI()+"'>�A�դ@��</a>");
		out.println("</h3></div></center>");
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
