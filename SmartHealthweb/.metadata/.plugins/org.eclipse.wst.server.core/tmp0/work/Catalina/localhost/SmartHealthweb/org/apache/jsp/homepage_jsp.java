/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-11-12 12:09:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>HTML5 Navigation Bar Example - Example 1</title>\r\n");
      out.write("    <link href=\"style3.css\" rel=\"stylesheet\"/>\r\n");
      out.write("</head>\r\n");
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
      out.write("body {font-family: \"Lato\", sans-serif;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" input#mail::-webkit-input-placeholder{\r\n");
      out.write("            \r\n");
      out.write("                color:grey;\r\n");
      out.write("            }\r\n");
      out.write("            div#u{\r\n");
      out.write("             position:absolute;\r\n");
      out.write("                 margin-left: 20px;\r\n");
      out.write("                margin-top:4px;\r\n");
      out.write("                 width: 150px;\r\n");
      out.write("                height:30px;\r\n");
      out.write("               \r\n");
      out.write("                background-color: #307493;\r\n");
      out.write("                color : #38acec;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                line-height:29px;\r\n");
      out.write("                font-family: \"Comic Sans MS\", cursive, sans-serif;;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                \r\n");
      out.write("              \r\n");
      out.write("            }\r\n");
      out.write("              \r\n");
      out.write("            \r\n");
      out.write("                input#r{\r\n");
      out.write("\r\n");
      out.write("                border: solid 1px #ffa62f;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height:14px;\r\n");
      out.write("                \r\n");
      out.write("                padding:6px;\r\n");
      out.write("                margin-left: 200px;\r\n");
      out.write("                margin-top:4px;\r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("            }\r\n");
      out.write("            input#r1{\r\n");
      out.write("\r\n");
      out.write("                border: solid 1px #ffa62f;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height:14px;\r\n");
      out.write("                \r\n");
      out.write("                padding:6px;\r\n");
      out.write("                margin-left: 200px;\r\n");
      out.write("                margin-top:5px;\r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("            }\r\n");
      out.write("            div#q{\r\n");
      out.write("            margin-left:200px;\r\n");
      out.write("            }\r\n");
      out.write("               input#register\r\n");
      out.write("            {\t\r\n");
      out.write("                Background:#fd5d54;\r\n");
      out.write("                padding:2px;\r\n");
      out.write("                color:white;\r\n");
      out.write("                width:200px;\r\n");
      out.write("                transition:1s;\r\n");
      out.write("                margin-left:503px; \r\n");
      out.write("                margin-top:10px; \r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            .button,.button1{\r\n");
      out.write("               background-color:#38acec;\r\n");
      out.write("              left:1500px;\r\n");
      out.write("                top:11px;\r\n");
      out.write("                width:70px;\r\n");
      out.write("                height:30px;\r\n");
      out.write("            \t\r\n");
      out.write("                position: absolute; \r\n");
      out.write("                left:1000px;\r\n");
      out.write("                top:9px;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("                display:inline-block;\r\n");
      out.write("                 color:#e8cd15;\r\n");
      out.write("                font-family:Helvetica;\r\n");
      out.write("                font-size:20px;\r\n");
      out.write("                font-weight:700;\r\n");
      out.write("                padding:6px 24px;\r\n");
      out.write("                text-decoration:none;\r\n");
      out.write("               margin-left:150px;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                line-height:30px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("input#mail{\r\n");
      out.write("\r\n");
      out.write("                border: solid 1px #ffa62f;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height:15px;\r\n");
      out.write("                padding:6px;\r\n");
      out.write("                margin-left: 200px;\r\n");
      out.write("                margin-top:4px;\r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("            }\r\n");
      out.write("         \r\n");
      out.write("            input#password{\r\n");
      out.write("            border: solid 1px #ffa62f;\r\n");
      out.write("               \r\n");
      out.write("                height:28px;\r\n");
      out.write("                padding:6px;\r\n");
      out.write("                \r\n");
      out.write("             \r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("                margin-left:20px;\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("               input#login{\r\n");
      out.write("            border: solid 1px #ffa62f;\r\n");
      out.write("                \r\n");
      out.write("                height:28px;\r\n");
      out.write("                padding:6px;\r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("            margin-left:600px;\r\n");
      out.write("            }\r\n");
      out.write("            div#header{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:0px;\r\n");
      out.write("                left:0px;\r\n");
      out.write("                right:0px;\r\n");
      out.write("           \r\n");
      out.write("                background-color: #ffa62f;\r\n");
      out.write("               \r\n");
      out.write("                height:60px;\r\n");
      out.write("                color : white;\r\n");
      out.write("                text-align:left;\r\n");
      out.write("                line-height:60px;\r\n");
      out.write("                font-family: \"Comic Sans MS\", cursive, sans-serif;;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                font-weight:700;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            div#qualifications{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:730px;\r\n");
      out.write("                left:50px;\r\n");
      out.write("                right:1150px;\r\n");
      out.write("                background-color: #38acec;\r\n");
      out.write("                height:30px;\r\n");
      out.write("                color : #ffa62f;\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                line-height:29px;\r\n");
      out.write("                font-family: \"Comic Sans MS\", cursive, sans-serif;;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-weight:700;\r\n");
      out.write("                transition: 1s;\r\n");
      out.write("            }\r\n");
      out.write("            select{\r\n");
      out.write("             border: solid 1px #ffa62f;\r\n");
      out.write("                width: 415px;\r\n");
      out.write("                height:38px;\r\n");
      out.write("                \r\n");
      out.write("                padding:6px;\r\n");
      out.write("                margin-left: 600px;\r\n");
      out.write("                margin-top:5px;\r\n");
      out.write("                font-family: Tahoma, Geneva, sans-serif;\r\n");
      out.write("                color:grey;\r\n");
      out.write("                border-radius:4px;\r\n");
      out.write("            }\r\n");
      out.write("            li#logout{\r\n");
      out.write("            align:right;\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");

if (session.getAttribute("uname")==null)
{
 
      out.write("\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" window.location.href=\"firstpage.jsp\"</script>\r\n");
      out.write(" ");

 }
  
      out.write("\r\n");
      out.write("<nav> \r\n");
      out.write("    <ul>\r\n");
      out.write("           <li>\r\n");
      out.write("            <a href=\"homeservlet\">SmartHealth</a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write(" \r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"homeservlet\" >Home</a>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("         <li>\r\n");
      out.write("            <a href=\"ViewFriends\">Friends</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"ViewFriends\">View Friends</a></li>\r\n");
      out.write("                <li><a href=\"friendservlet\">Add Friends</a></li>\r\n");
      out.write("<li><a href=\"AllUser\">See All Friends</a></li>\r\n");
      out.write("                <li><a href=\"RequestView\">View Friend Request</a></li>\r\n");
      out.write("            </ul> \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"RequestView\">Health Data</a>\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t<li><a href=\"ViewHealth\">View Health Data</a></li>\r\n");
      out.write("        \t<li><a href=\"AddHealth\">Add Health Data</a></li>\r\n");
      out.write("        \t<li><a href=\"UpdateHealth\">Update Health Data</a></li>\r\n");
      out.write("        \t\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        \t\t\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"GetAllForum\">Discussions</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("            <li><a href =\"CreateForum\">Add Forum</a></li>\r\n");
      out.write("            <li><a href=\"GetAllForum\">View Forums</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li>\r\n");
      out.write("        <a id=\"logout\" href=\"logoutservlet\" >Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"London\" class=\"tabcontent\">\r\n");
      out.write(" <div id=\"form\">\r\n");
      out.write("            <form action=\"update\" method=\"POST\"> \r\n");
      out.write("\r\n");
      out.write("       <div  id=\"u\">Username </div>\r\n");
      out.write("       \r\n");
      out.write("       <input id=\"r\" disabled=\"disabled\"  type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"uname\" autofocus><br><br>\r\n");
      out.write("       <div id=\"u\">Password&nbsp; </div> \r\n");
      out.write("       <input id=\"r\" type=\"password\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPassword()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"pwd\" ><br><br>\r\n");
      out.write("        <div id=\"u\">EmailId 1&nbsp; </div> \r\n");
      out.write("        <input id=\"mail\" disabled=\"disabled\" type=\"email\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPrimary_email()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"pemail\" ><br><br>\r\n");
      out.write("         <div id=\"u\">EmailId 2&nbsp; </div>\r\n");
      out.write("          <input id=\"mail\" type=\"email\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getSecondary_email()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"semail\" ><br><br>\r\n");
      out.write("         <div id=\"u\">First Name </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getFirst_name()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"fname\" ><br><br>\r\n");
      out.write("         <div id=\"u\">Last Name </div>\r\n");
      out.write("          <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getLast_name()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"lname\" ><br><br>\r\n");
      out.write("         <div id=\"u\">About Me&nbsp; </div>\r\n");
      out.write("          <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getAbout_me()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"aboutme\" ><br><br>\r\n");
      out.write("         <div id=\"u\">Photo url1&nbsp; </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL1()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url1\"><br><br>\r\n");
      out.write("         <div id=\"u\">Photo url2&nbsp; </div> \r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL2()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url2\" ><br><br>\r\n");
      out.write("         <div id=\"u\">Photo url3&nbsp; </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL3()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url3\" ><br><br>\r\n");
      out.write("         <div id=\"u\">Address&nbsp;&nbsp;&nbsp; </div>\r\n");
      out.write("\t\t\t<input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPostal_address()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"address\" ><br><br>\r\n");
      out.write("              \r\n");
      out.write("            <br>  \r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t <input id=\"submit\" type=\"submit\" value=\"Update\" style=\"height: 32px\" name=\"update\" >\r\n");
      out.write("             \r\n");
      out.write("                </form>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
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
