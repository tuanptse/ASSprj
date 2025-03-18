package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Product.ProductDAO;
import Product.ProductDTO;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String category = request.getParameter("category");

    ProductDAO dao = new ProductDAO();
    List<ProductDTO> products = dao.getProductsByCategory(category);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Danh mục sản phẩm</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\">MENU</a>\r\n");
      out.write("                        <div class=\"dropdown-content\">\r\n");
      out.write("                            <div class=\"menu-column\">\r\n");
      out.write("                                <h4>SHOP ALL</h4>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=loadCategory&category=nhanbacnam\">NHẪN BẠC NAM</a>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=loadCategory&category=vongtaybac\">VÒNG TAY BẠC</a>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=loadCategory&category=daychuyenbac\">DÂY CHUYỀN BẠC</a>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=loadCategory&category=matdaychuyenbac\">MẶT DÂY CHUYỀN BẠC S925</a>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/MainController?action=loadCategory&category=khuyentaibacnam\">KHUYÊN TAI BẠC NAM</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav> \r\n");
      out.write("            <div class=\"logo\">HELIOS</div>\r\n");
      out.write("            <div class=\"user-options\">\r\n");
      out.write("                <a style=\"color: white\" href=\"jsp/register.jsp\">Đăng ký </a> <span style=\"color: white\">/</span> <a style=\"color: white\" href=\"jsp/login.jsp\"> Đăng nhập</a>\r\n");
      out.write("                <a href=\"#\" class=\"cart\">🛒</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"banner\">\r\n");
      out.write("            <img src=\"https://raw.githubusercontent.com/tuanptse/ASSprj/main/ASS2/web/images/banner.jpg\" alt=\"Helios Banner\">\r\n");
      out.write("        </section>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <aside class=\"sidebar\">\r\n");
      out.write("                <div class=\"price-filter\">\r\n");
      out.write("                    <h3>Giá <span class=\"toggle-filter\">−</span></h3>\r\n");
      out.write("                    <div class=\"filter-content\">\r\n");
      out.write("                        <div class=\"price-input\">\r\n");
      out.write("                            <input type=\"number\" id=\"minPrice\" value=\"0\"> - \r\n");
      out.write("                            <input type=\"number\" id=\"maxPrice\" value=\"4150000\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"price-slider\">\r\n");
      out.write("                            <input type=\"range\" id=\"priceRangeMin\" min=\"0\" max=\"4150000\" value=\"0\">\r\n");
      out.write("                            <input type=\"range\" id=\"priceRangeMax\" min=\"0\" max=\"4150000\" value=\"4150000\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h2>Danh mục: ");
      out.print( (category != null) ? category.toUpperCase() : "Chưa chọn");
      out.write("</h2>\r\n");
      out.write("            </aside>\r\n");
      out.write("            <div class=\"products\">\r\n");
      out.write("                ");

                    if (products != null && !products.isEmpty()) {
                        for (ProductDTO product : products) {
                
      out.write("\r\n");
      out.write("                <div class=\"product-card\">\r\n");
      out.write("                    <img src=\"");
      out.print( product.getImageUrl());
      out.write("\" alt=\"");
      out.print( product.getName());
      out.write("\">\r\n");
      out.write("                    <h3>");
      out.print( product.getName());
      out.write("</h3>\r\n");
      out.write("                    <p>");
      out.print( product.getPrice());
      out.write(" VND</p>\r\n");
      out.write("                    <button>Thêm nhanh</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                } else {
                
      out.write("\r\n");
      out.write("                <p>Không có sản phẩm nào trong danh mục này.</p>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
