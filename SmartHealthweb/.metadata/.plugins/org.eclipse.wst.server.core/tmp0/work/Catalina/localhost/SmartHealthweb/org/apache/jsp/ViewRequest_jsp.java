/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-11-12 13:58:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class ViewRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>View Friends</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#logo{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right:10px;\r\n");
      out.write("    bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    font-family: \"Lucida Grande\", \"Helvetica Nueue\", Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("nav {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    border: 1px solid #333;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("nav ul{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("}\r\n");
      out.write("nav ul li {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    transition: all 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav > ul > li > a {\r\n");
      out.write("    color: #aaa;\r\n");
      out.write("    display: block;\r\n");
      out.write("    line-height: 2em;\r\n");
      out.write("    padding: 0.5em 2em;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav li > ul{\r\n");
      out.write("    display : none;\r\n");
      out.write("    margin-top:1px;\r\n");
      out.write("    background-color: #bbb;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav li > ul li{\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav  li > ul li a {\r\n");
      out.write("    color: #111;\r\n");
      out.write("    display: block;\r\n");
      out.write("    line-height: 2em;\r\n");
      out.write("    padding: 0.5em 2em;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav li:hover {\r\n");
      out.write("    background-color: #666;\r\n");
      out.write("}\r\n");
      out.write("nav li:hover > ul{\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    display : block;\r\n");
      out.write("}\r\n");
      out.write("nav li > ul > li ul  {\r\n");
      out.write("    display: none;\r\n");
      out.write("    background-color: #888;\r\n");
      out.write("}\r\n");
      out.write("nav li > ul > li:hover > ul  {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    display : block;\r\n");
      out.write("    margin-left:100%;\r\n");
      out.write("    margin-top:-3em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".auto-style1 {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".auto-style2 {\r\n");
      out.write("    font-size: large;\r\n");
      out.write("}\r\n");
      out.write(".auto-style3 {\r\n");
      out.write("    margin-left: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("        \r\n");
      out.write("<nav>\r\n");
      out.write("    <ul>\r\n");
      out.write("           <li>\r\n");
      out.write("            <a href=\"homeservlet\">SmartHealth</a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write(" \r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"homeservlet\">Home</a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"ViewFriends\">Friends</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"ViewFriends\">View Friends</a></li>\r\n");
      out.write("                <li><a href=\"friendservlet\">Add Friends</a></li>\r\n");
      out.write("<li><a href=\"AllUser\">See All Friends</a></li>\r\n");
      out.write("                <li><a href=\"RequestView\">View Friend Request</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"GetAllForum\">Discussions</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("            <li><a href =\"CreateForum\">Add Forum</a></li>\r\n");
      out.write("            <li><a href=\"GetAllForum\">View Forums</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("        <a id=\"logout\" href=\"logoutservlet\" >Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("<div class=\"head3\">            \r\n");
      out.write("            \r\n");
      out.write("        <div class=\"g1\">    \r\n");
      out.write("                                            \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                <h1  style=\"color: #000000;\" class=\"auto-style1\"><b>Friend \r\n");
      out.write("                Request</b></h1>\r\n");
      out.write("                    \r\n");
      out.write("                                                                <span class=\"auto-style2\">\r\n");
      out.write("                    \r\n");
      out.write("                                                                ");
  ArrayList<String> friends = (ArrayList<String>)request.getAttribute("ViewRequest");
      out.write("\r\n");
      out.write("                                                                </span>\r\n");
      out.write("                                                                <label class=\"control-label col-sm-2\" for=\"username\" style=\"width: 24.666667%;\">\r\n");
      out.write("        <span class=\"auto-style2\">UserName</span></label><br><br>\r\n");
      out.write("        <form  action=\"accept\" method=\"post\">\r\n");
      out.write("                                                                ");
for(String user : friends){ 
      out.write("\r\n");
      out.write("                                                                        \r\n");
      out.write("                                                                    <div class=\"form-group\">\r\n");
      out.write("                                                                         <label class=\"control-label col-sm-2\" for=\"username\" style=\"width: 24.666667%;\">");
      out.print( user );
      out.write(" </label>\r\n");
      out.write("                                                                         <input name=\"accept[");
      out.print(user );
      out.write("]\" type=\"submit\" value=\"submit\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input name=\"reject[");
      out.print(user );
      out.write("]\" type=\"submit\" value=\"reject\">\r\n");
      out.write("       \r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <br>\r\n");
      out.write("                                                                ");
} 
      out.write("</form>\r\n");
      out.write("                                                                \r\n");
      out.write("                                                                \r\n");
      out.write("                                                                \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                                                                        \r\n");
      out.write("                                           \r\n");
      out.write("                                                                                                           \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                               </div>                              \r\n");
      out.write("                                                        \r\n");
      out.write("                                                                          \r\n");
      out.write("                                                                                                           \r\n");
      out.write("                                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                                \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("\r\n");
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
