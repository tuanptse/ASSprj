package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Đăng nhập</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/styles.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .login-container {\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            margin: 100px auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .login-container h2 {\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"], input[type=\"password\"] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("            border: 1px solid white;\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .forgot-password {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        button {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            background-color: #FFA500;\r\n");
      out.write("            border: none;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("        .register-link {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"login-container\">\r\n");
      out.write("        <h2>Đăng nhập</h2>\r\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"Email\" required>\r\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Mật khẩu\" required>\r\n");
      out.write("            <a href=\"#\" class=\"forgot-password\">Quên mật khẩu?</a>\r\n");
      out.write("            <button type=\"submit\">Đăng nhập</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <a href=\"register.jsp\" class=\"register-link\">Tạo tài khoản</a>\r\n");
      out.write("        <a href=\"Main.jsp\" class=\"register-link\">Quay lại cửa hàng</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
