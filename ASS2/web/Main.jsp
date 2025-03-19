<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, Product.ProductDTO" %>
<%
    List<ProductDTO> products = (List<ProductDTO>) request.getAttribute("products");
%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Helios Clone</title>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/styles.css">

    </head>
    <body>

        <!-- HEADER -->
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
                    </li>


                </ul>
            </nav>       
            <div class="logo">𝓗𝓔𝓛𝓘𝓞𝓢</div>
            <div class="user-options">
                


                <a style="color: white" href="<%= request.getContextPath()%>/register.jsp">Đăng ký</a>

                <span style="color: white">/</span> 
                <a style="color: white" href="<%= request.getContextPath()%>/login.jsp"> Đăng nhập</a>
                <a href="#" class="cart">🛒</a>
            </div>
        </header>

        <!-- BANNER -->
        <section class="banner">
            <img src="https://raw.githubusercontent.com/tuanptse/ASSprj/main/ASS2/web/images/banner.jpg" alt="Helios Banner">
        </section>

        <!-- SẢN PHẨM MỚI -->
        <section class="products">
            <h2>Sản phẩm mới</h2>
            <div class="product-list">

                <% if (products != null && !products.isEmpty()) {
                    for (ProductDTO p : products) {%>
                <div class="product">
                    <img src="<%= request.getContextPath()%>/images/<%= p.getImageUrl()%>" alt="<%= p.getName()%>">
                    <h3><%= p.getName()%></h3>
                    <p><strong><%= String.format("%,.0f", p.getPrice())%> VNĐ</strong></p>
                    <p><%= p.getDescription()%></p>

                    <button>Thêm nhanh</button>
                </div>
                <%  }
            } else { %>
                <p>Không có sản phẩm nào để hiển thị.</p>
                <% }%>
            </div>
        </section>

        <!-- FOOTER -->
        <footer>
            <p>&copy; 2025 Helios. All rights reserved.</p>
        </footer>
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                let header = document.querySelector("header");

                // Khi không di chuột vào, header sẽ mất màu
                header.classList.add("transparent");

                // Khi trỏ chuột vào header, nó hiện màu đen
                header.addEventListener("mouseenter", function () {
                    header.classList.remove("transparent");
                });

                // Khi chuột rời khỏi header, nó trở lại trong suốt
                header.addEventListener("mouseleave", function () {
                    header.classList.add("transparent");
                });
            });
        </script>

    </body>
</html>
