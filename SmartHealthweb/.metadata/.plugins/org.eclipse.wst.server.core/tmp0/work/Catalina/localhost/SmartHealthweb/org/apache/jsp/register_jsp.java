/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-24 19:17:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {font-family: \"Lato\", sans-serif;}\r\n");
      out.write("\r\n");
      out.write("ul.tab {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    background-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Float the list items side by side */\r\n");
      out.write("ul.tab li {float: left;}\r\n");
      out.write("\r\n");
      out.write("/* Style the links inside the list items */\r\n");
      out.write("ul.tab li a {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    color: black;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    transition: 0.3s;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Change background color of links on hover */\r\n");
      out.write("ul.tab li a:hover {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Create an active/current tablink class */\r\n");
      out.write("ul.tab li a:focus, .active {\r\n");
      out.write("    background-color: #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the tab content */\r\n");
      out.write(".tabcontent {\r\n");
      out.write("    display: none;\r\n");
      out.write("    padding: 6px 12px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-top: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" input#mail::-webkit-input-placeholder{\r\n");
      out.write("            \r\n");
      out.write("                color:grey;\r\n");
      out.write("            }\r\n");
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
      out.write("            div#username{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:126px;\r\n");
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
      out.write("           \r\n");
      out.write("            div#password{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("               top:176px;\r\n");
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
      out.write("             div#pemail{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("               top:226px;\r\n");
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
      out.write("                visibilty:hidden;\r\n");
      out.write("            }\r\n");
      out.write("             div#semail{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:278px;\r\n");
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
      out.write("             div#fname{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:328px;\r\n");
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
      out.write("             div#lname{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:378px;\r\n");
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
      out.write("             div#aboutme{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:430px;\r\n");
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
      out.write("             div#url1{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:480px;\r\n");
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
      out.write("             div#url2{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("               top:530px;\r\n");
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
      out.write("             div#url3{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:580px;\r\n");
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
      out.write("             div#address{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:630px;\r\n");
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
      out.write("            \r\n");
      out.write("             div#contact{\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                top:680px;\r\n");
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
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<p>In this example, we use JavaScript to \"click\" on the London link, to open the tab on page load.</p>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"tab\">\r\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'London')\" id=\"defaultOpen\">Update</a></li>\r\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'Paris')\">Paris</a></li>\r\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'Tokyo')\">Tokyo</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<div id=\"London\" class=\"tabcontent\">\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div id=\"form\" >\r\n");
      out.write("            <form action=\"update\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("       <div id=\"username\">Username&nbsp; </div><br> \r\n");
      out.write("       \r\n");
      out.write("       <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getUsername()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"uname\" autofocus><br><br>\r\n");
      out.write("       <div id=\"password\">Password&nbsp; </div> \r\n");
      out.write("       <input id=\"r\" type=\"password\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPassword()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"pwd\" ><br><br>\r\n");
      out.write("        <div id=\"pemail\">EmailId 1&nbsp; </div> \r\n");
      out.write("        <input id=\"mail\" type=\"email\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPrimary_email()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"pemail\" ><br><br>\r\n");
      out.write("         <div id=\"semail\">EmailId 2&nbsp; </div>\r\n");
      out.write("          <input id=\"mail\" type=\"email\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getSecondary_email()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"semail\" ><br><br>\r\n");
      out.write("         <div id=\"fname\">First Name </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getFirst_name()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"fname\" ><br><br>\r\n");
      out.write("         <div id=\"lname\">Last Name </div>\r\n");
      out.write("          <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getLast_name()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"lname\" ><br><br>\r\n");
      out.write("         <div id=\"aboutme\">About Me&nbsp; </div>\r\n");
      out.write("          <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getAbout_me()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"aboutme\" ><br><br>\r\n");
      out.write("         <div id=\"url1\">Photo url1&nbsp; </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL1()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url1\"><br><br>\r\n");
      out.write("         <div id=\"url2\">Photo url2&nbsp; </div> \r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL2()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url2\" ><br><br>\r\n");
      out.write("         <div id=\"url3\">Photo url3&nbsp; </div>\r\n");
      out.write("         <input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getURL3()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"url3\" ><br><br>\r\n");
      out.write("         <div id=\"address\">Address&nbsp;&nbsp;&nbsp; </div>\r\n");
      out.write("\t\t\t<input id=\"r\" type=\"text\" placeholder=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getPostal_address()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" name=\"address\" ><br><br>\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"contact\" >Contact&nbsp; </div> \r\n");
      out.write("         <input id=\"r1\" type=\"text\"  placeholder=\"Enter your Contact no.\" name=\"contact\"><br><br>\r\n");
      out.write("         <div id=\"qualifications\" >Qualifications&nbsp; </div> \r\n");
      out.write("         <div id=\"q\">\r\n");
      out.write("         <input   type=\"checkbox\" name=\"qual\" value=\"Btech\">Btech\r\n");
      out.write("\t\t<input   type=\"checkbox\" name=\"qual\" value=\"Mtech\">Mtech\r\n");
      out.write("\t\t<input   type=\"checkbox\" name=\"qual\" value=\"Phd\">Phd<br>\r\n");
      out.write("\t\t<input   type=\"checkbox\" name=\"qual\" value=\"BA\">BA\r\n");
      out.write("\t\t<input    type=\"checkbox\" name=\"qual\" value=\"LLB\">LLB\r\n");
      out.write("\t\t<input   type=\"checkbox\" name=\"qual\" value=\"Bcom\">Bcom\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t <input id=\"update\" type=\"submit\" value=\"Update\" style=\"height: 32px\" name=\"update\" >\r\n");
      out.write("             \r\n");
      out.write("                </form>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"Paris\" class=\"tabcontent\">\r\n");
      out.write("  <h3>Paris</h3>\r\n");
      out.write("  <p>Paris is the capital of France.</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"Tokyo\" class=\"tabcontent\">\r\n");
      out.write("  <h3>Tokyo</h3>\r\n");
      out.write("  <p>Tokyo is the capital of Japan.</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openCity(evt, cityName) {\r\n");
      out.write("    var i, tabcontent, tablinks;\r\n");
      out.write("    tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("    for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("        tabcontent[i].style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("    tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("    for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("        tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("    evt.currentTarget.className += \" active\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Get the element with id=\"defaultOpen\" and click on it\r\n");
      out.write("document.getElementById(\"defaultOpen\").click();\r\n");
      out.write("</script>\r\n");
      out.write("     \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
