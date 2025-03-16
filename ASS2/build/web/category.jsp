<%-- 
    Document   : category
    Created on : Mar 16, 2025, 8:05:02 PM
    Author     : Longtri
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, Product.ProductDAO, Product.ProductDTO" %>

<%
    String category = request.getParameter("category");

    ProductDAO dao = new ProductDAO();
    List<ProductDTO> products = dao.getProductsByCategory(category);
%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <title>Danh mục sản phẩm</title>
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>

        <header>
            <nav>
                <ul>
                    <li class="dropdown">
                        <a href="#">MENU</a>
                        <div class="dropdown-content">
                            <div class="menu-column">
                                <h4>SHOP ALL</h4>
                                <a href="${pageContext.request.contextPath}/MainController?action=loadCategory&category=nhanbacnam">NHẪN BẠC NAM</a>
                                <a href="${pageContext.request.contextPath}/MainController?action=loadCategory&category=vongtaybac">VÒNG TAY BẠC</a>
                                <a href="${pageContext.request.contextPath}/MainController?action=loadCategory&category=daychuyenbac">DÂY CHUYỀN BẠC</a>
                                <a href="${pageContext.request.contextPath}/MainController?action=loadCategory&category=matdaychuyenbac">MẶT DÂY CHUYỀN BẠC S925</a>
                                <a href="${pageContext.request.contextPath}/MainController?action=loadCategory&category=khuyentaibacnam">KHUYÊN TAI BẠC NAM</a>
                            </div>
                        </div>
                    </li>
                </ul>
            </nav> 
            <div class="logo">HELIOS</div>
            <div class="user-options">
                <a style="color: white" href="jsp/register.jsp">Đăng ký </a> <span style="color: white">/</span> <a style="color: white" href="jsp/login.jsp"> Đăng nhập</a>
                <a href="#" class="cart">🛒</a>
            </div>
        </header>

        <section class="banner">
            <img src="https://raw.githubusercontent.com/tuanptse/ASSprj/main/ASS2/web/images/banner.jpg" alt="Helios Banner">
        </section>
        <div class="container">
            <!-- Sidebar -->
            <aside class="sidebar">
                <div class="price-filter">
                    <h3>Giá <span class="toggle-filter">−</span></h3>
                    <div class="filter-content">
                        <div class="price-input">
                            <input type="number" id="minPrice" value="0"> - 
                            <input type="number" id="maxPrice" value="4150000">
                        </div>
                        <div class="price-slider">
                            <input type="range" id="priceRangeMin" min="0" max="4150000" value="0">
                            <input type="range" id="priceRangeMax" min="0" max="4150000" value="4150000">
                        </div>
                    </div>
                </div>
                <h2>Danh mục: <%= (category != null) ? category.toUpperCase() : "Chưa chọn"%></h2>
            </aside>
            <div class="products">
                <%
                    if (products != null && !products.isEmpty()) {
                        for (ProductDTO product : products) {
                %>
                <div class="product-card">
                    <img src="<%= product.getImageUrl()%>" alt="<%= product.getName()%>">
                    <h3><%= product.getName()%></h3>
                    <p><%= product.getPrice()%> VND</p>
                    <button>Thêm nhanh</button>
                </div>
                <%
                    }
                } else {
                %>
                <p>Không có sản phẩm nào trong danh mục này.</p>
                <%
                    }
                %>
            </div>
        </div>

    </body>
</html>

