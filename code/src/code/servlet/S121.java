package code.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S121
 */
@WebServlet("/S121")
public class S121 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S121() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		//
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		//
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>S121</title></head><body>");
		out.println("<h2>Servlet, S121</h2>");
		out.println("<h3>My First Servlet</h3>");
		out.println("環保署數據顯示，2018年台中上半年的PM2.5濃度是八年來「同期新低」，「俗稱紫爆」天數也是八年來同期最少。改善不等於好，但在每次討論中，總有一個常見錯誤說法：「紫爆標準改了！空污改善不是真的！」這個誤解真的非常嚴重，需要好好解釋。");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
