package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vongtay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>HELIOS - Trang sức</title>\n");
      out.write("    <!-- Link tới nhan.css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath());
      out.write("/css/vongtay.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Header -->\n");
      out.write("    <header class=\"header-banner\">\n");
      out.write("        <nav class=\"top-nav\">\n");
      out.write("            <!-- Bên trái -->\n");
      out.write("            <ul class=\"menu-left\">\n");
      out.write("                <!-- MENU dạng dropdown -->\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a href=\"");
      out.print( request.getContextPath() );
      out.write("/Main.jsp\">\n");
      out.write("                                MENU\n");
      out.write("                            </a>\n");
      out.write("                    <ul class=\"dropdown-content\">\n");
      out.write("                        <!-- Khi bấm vào NHẪN, điều hướng tới nhan.jsp -->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/nhan.jsp\">\n");
      out.write("                                NHẪN\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Khi bấm vào VÒNG TAY, điều hướng tới vongtay.jsp -->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/vongtay.jsp\">\n");
      out.write("                                VÒNG TAY\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Tương tự các link còn lại -->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/daychuyen.jsp\">\n");
      out.write("                                DÂY CHUYỀN\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/matdaychuyen.jsp\">\n");
      out.write("                                MẶT DÂY CHUYỀN\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/khuyentai.jsp\">\n");
      out.write("                                KHUYÊN TAI\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li>COLLECTIONS</li>\n");
      out.write("                <li>EYEWEAR</li>\n");
      out.write("                <li class=\"highlight\">CUỐI MÙA</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Bên phải -->\n");
      out.write("            <div class=\"menu-right\">\n");
      out.write("                <a style=\"color: white\" href=\"");
      out.print( request.getContextPath());
      out.write("/register.jsp\">Đăng ký</a>\n");
      out.write("                <span style=\"color: white\">/</span> \n");
      out.write("                <a style=\"color: white\" href=\"");
      out.print( request.getContextPath());
      out.write("/login.jsp\">Đăng nhập</a>\n");
      out.write("                <a href=\"#\" class=\"cart\">🛒</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Phần banner -->\n");
      out.write("        <div class=\"banner-content\">\n");
      out.write("            <h1>HELIOS</h1>\n");
      out.write("            <h2>VÒNG TAY - KHẲNG ĐỊNH SỰ KHÁC BIỆT</h2>\n");
      out.write("            <p>\n");
      out.write("                Khám phá bộ sưu tập nhẫn bạc nam đẹp, chất liệu bạc cao cấp, đa dạng kiểu dáng.  \n");
      out.write("                Thiết kế độc nhất, tinh tế nâng tầm phong cách đàn ông trưởng thành.\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Main Content -->\n");
      out.write("    <main>\n");
      out.write("        <!-- Sidebar: Bộ lọc -->\n");
      out.write("        <aside>\n");
      out.write("            <div class=\"filter-box\">\n");
      out.write("                <h3>Giá</h3>\n");
      out.write("                <div class=\"price-filter\">\n");
      out.write("                    <input type=\"number\" placeholder=\"₫ 0\">\n");
      out.write("                    <input type=\"number\" placeholder=\"₫ 4.150.000\">\n");
      out.write("                    <input type=\"range\" min=\"0\" max=\"4150000\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <h3>Size</h3>\n");
      out.write("                <div class=\"size-options\">\n");
      out.write("                    <label><input type=\"radio\" name=\"size\" value=\"1\"> Size 1</label>\n");
      out.write("                    <label><input type=\"radio\" name=\"size\" value=\"2\"> Size 2</label>\n");
      out.write("                    <label><input type=\"radio\" name=\"size\" value=\"3\"> Size 3</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("        <!-- Danh sách sản phẩm -->\n");
      out.write("        <section class=\"product-grid\">\n");
      out.write("            <div class=\"product\">\n");
      out.write("                <img src=\"images/hunterskull1.png\" alt=\"Vòng tay 1\">\n");
      out.write("                <h4>Mafi Lotus Ring Helios Silver</h4>\n");
      out.write("                <p>Từ 1.250.000 VND</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"product\">\n");
      out.write("                <img src=\"assets/images/ring2.jpg\" alt=\"Vòng tay 2\">\n");
      out.write("                <h4>Roto Helios Black Silver</h4>\n");
      out.write("                <p>Từ 1.350.000 VND</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"product\">\n");
      out.write("                <img src=\"assets/images/ring3.jpg\" alt=\"Vòng tay 3\">\n");
      out.write("                <h4>Torua Helios Black Silver</h4>\n");
      out.write("                <p>Từ 860.000 VND</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
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
