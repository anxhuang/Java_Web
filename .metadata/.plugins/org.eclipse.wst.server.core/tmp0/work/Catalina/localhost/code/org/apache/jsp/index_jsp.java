/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.8
 * Generated at: 2018-07-26 13:29:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"BIG5\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tfont-size: 0.25in;\r\n");
      out.write("\t\tfont-family: Arial;\r\n");
      out.write("\t\tbackground: linear-gradient(#369, #111);\t\t\r\n");
      out.write("\t\tbackground-attachment: fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\th1{\r\n");
      out.write("\t\tcolor: #FFF;\r\n");
      out.write("\t\ttext-shadow: 0px 1px 5px #000;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\th2{\r\n");
      out.write("\t\tcolor: #F80;\r\n");
      out.write("\t\ttext-shadow: 0px 1px 5px #000;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\tred{\r\n");
      out.write("\t\tcolor: #E40;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.orange{\r\n");
      out.write("\t\tcolor: #FFF;\r\n");
      out.write("\t\tfont-size: 0.6in;\t\t\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tbackground: #F80;\r\n");
      out.write("\t\tfont-weight: bold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.date{\r\n");
      out.write("\t\twidth: 0.5in;\t\t\r\n");
      out.write("\t\tcolor: #396;\r\n");
      out.write("\t\tfont-size: 0.4in;\r\n");
      out.write("\t\ttext-align: center;\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.ex{\r\n");
      out.write("\t\tpadding-left: 0.3in;\r\n");
      out.write("\t\tmargin-left: 0.2in;\r\n");
      out.write("\t\tborder-left: 2px solid #CCC;\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tgrey{\r\n");
      out.write("\t\tcolor: #777;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable{\t\t\r\n");
      out.write("\t\twidth: 80%;\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t\tborder-spacing: 0.15in;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\tcolor: #000;\r\n");
      out.write("\t\ttext-shadow: 0px 1px 2px #777;\r\n");
      out.write("\t\tline-height: 0.4in;\r\n");
      out.write("\t\tpadding: 0.2in;\t\t\r\n");
      out.write("\t\tbackground: rgba(255,255,255,1.0);\t\t\r\n");
      out.write("\t\tbox-shadow: 0px 2px 10px #000;\r\n");
      out.write("\t\tborder-radius: 3px;\r\n");
      out.write("\t\tvertical-align: middle;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd div{\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t\tvertical-align: middle;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd:first-child{\r\n");
      out.write("\t\twidth: 8%;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd:nth-child(2){\r\n");
      out.write("\t\twidth: 46%;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd:nth-child(3){\r\n");
      out.write("\t\twidth: 46%;\r\n");
      out.write("\t}\r\n");
      out.write("\ta:link\t\t{color: #47F;}\r\n");
      out.write("\ta:visited\t{color: #47F;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>Java Web Code</h1><h2>2018.07.12 ~ 2018.09.04</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"orange\">T</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

					String topics[][]={
						{"1","Servlet*, JSP*"},
						{"2","ServletContext, Filter, Expression Language(EL)"},
						{"3","Request, Response, Annotation, JSTL"},
						{"4","RequestDispatcher, JavaBean"},
						{"5","Session, Cookie, Tomcat, TLD"},
						{"6","Asynchronous Request, TLD"},
						{"7","Listener"},
						{"8","Deployment, Security"},
						{"0","Database"},
					};
					for (String[] topic:topics){
						out.print("<red>"+topic[0]+"</red>&nbsp;&nbsp;"+topic[1]+"<br>");
					}					
					
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");

					ArrayList<String>	date=new ArrayList<>();
					ArrayList<String>	ex=new ArrayList<>();
					date.add("");
					date.add("7<br><grey>14</grey>");
					date.add("7<br><grey>17</grey>");
					date.add("7<br><grey>19</grey>");
					date.add("7<br><grey>24</grey>");
					date.add("7<br><grey>26</grey>");
					date.add("7<br><grey>31</grey>");
					date.add("8<br><grey>2</grey>");
					date.add("8<br><grey>7</grey>");
					date.add("8<br><grey>9</grey>");
					date.add("8<br><grey>14</grey>");
					date.add("8<br><grey>16</grey>");
					date.add("8<br><grey>21</grey>");
					date.add("8<br><grey>23</grey>");
					date.add("8<br><grey>28</grey>");
					date.add("8<br><grey>30</grey>");
					date.add("9<br><grey>4</grey>");
					date.add("");
					ex.add("<grey>- Course Start -</grey>");
					ex.add("Servlet: <a href='S121'>S121</a><br>JSP: <a href='j121.jsp'>j121</a>,<a href='j122.jsp'>j122</a>");
					ex.add("<font color=#F40'>No trigger, Listener/Filter(F211)</font><br>Servlet: <a href='S211'>S211</a>,<a href='S212'>S212</a><br>EL: <a href='j211.jsp'>j211</a>,<a href='j212.jsp'>j212</a><br>JSP: <a href='j213.jsp'>j213</a>");
					ex.add("Servlet: <a href='S221'>S221</a>,S222,S223<br>JSP: <a href='j221.jsp'>j221</a>,<a href='j222.jsp'>j222</a><br>EL: <a href='j223.jsp'>j223</a>");
					ex.add("<font color='#F40'>No trigger, Listener/Filter(L311,L312)</font><br>Servlet: <a href='S311'>S311</a><br>JSP/JSTL: <a href='j311.jsp'>j311</a>,<a href='j312.jsp'>j312</a><br>EL: j313");
					ex.add("<font color='#F40'>No trigger, Listener/Filter(L321)</font><br>Servlet: <a href='S321'>S321</a>,S322(Database)<br>JSP: <a href='j321.jsp'>j321</a>(Database)<br>EL: <a href='j322.jsp'>j322</a><br>JSP/JSTL: <a href='j323.jsp'>j323</a>");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("");
					ex.add("<grey>- Course End -</grey>");					
					for (int i=1; i<=9; i++){						
						out.print("<tr><td class='orange'>"+i+"</td><td><div class='date'>"+date.get(i*2-2)+"</div><div class='ex'>"+ex.get(i*2-2)+"</div></td><td><div class='date'>"+date.get(i*2-1)+"</div><div class='ex'>"+ex.get(i*2-1)+"</div></td></tr>");
					}
				
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
