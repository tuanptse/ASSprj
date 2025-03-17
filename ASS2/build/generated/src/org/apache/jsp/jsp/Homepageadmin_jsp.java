package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepageadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vi\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>HELIOS - Admin Home</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"../css/admin.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <!-- NAVBAR -->\n");
      out.write("  <nav class=\"navbar\">\n");
      out.write("    <div class=\"nav-left\">\n");
      out.write("      <h2 class=\"logo\">HELIOS</h2>\n");
      out.write("      <ul class=\"nav-menu\">\n");
      out.write("        <!-- Thêm link Home -->\n");
      out.write("        <li><a href=\"Homepageadmin.jsp\" class=\"active\">Home</a></li>\n");
      out.write("        <li><a href=\"Ordersadmin.jsp\">Orders</a></li>\n");
      out.write("        <li><a href=\"Productsadmin.jsp\">Products</a></li>\n");
      out.write("        <li><a href=\"Employeesadmin.jsp\">Employees</a></li>\n");
      out.write("        <li><a href=\"Reviewsadmin.jsp\">Reviews</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"nav-right\">\n");
      out.write("      <img src=\"../images/avatar.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- SUB-HEADER -->\n");
      out.write("  <div class=\"sub-header\">\n");
      out.write("    <h1>Admin Home</h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- CONTENT -->\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <p>Chào mừng bạn đến với trang quản trị HELIOS. Hãy chọn một mục bên trên để quản lý!</p>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
