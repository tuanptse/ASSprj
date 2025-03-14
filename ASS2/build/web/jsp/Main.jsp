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
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>

    <!-- HEADER -->
    <header>
       
        <nav>
            <ul>
                <li><a href="#">MENU</a></li>
                <li><a href="#">COLLECTIONS</a></li>
                <li><a href="#" class="highlight">CUỐI MÙA</a></li>
            </ul>
        </nav>       
         <div class="logo">HELIOS</div>
        <div class="user-options">
            <div class="dropdown">

    <div class="dropdown-content">
        <a href="#">English</a>
        <a href="#">日本語</a>
        <a href="#">Français</a>
    </div>
</div>

<style>
header {
    display: flex;
    justify-content: space-between; /* Canh đều hai bên */
    align-items: center;
    background-color: black;
    padding: 10px 20px;
    position: fixed;
    width: 100%;
    top: 0;
    left: 0;
    z-index: 1000;
    transition: background-color 0.3s ease-in-out;
}

/* Mặc định header có màu trong suốt */
header.transparent {
    background-color: transparent;
}

/* Khi trỏ chuột vào header, nó hiện màu đen */
header:hover {
    background-color: black;
}

    
.dropdown {
    position: relative;
    display: inline-block;
}

.dropbtn {
    background-color: black;
    color: white;
    border: none;
    cursor: pointer;
    font-size: 16px;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: black;
    min-width: 100px;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
    z-index: 1;
}

.dropdown-content a {
    color: white;
    padding: 8px 12px;
    display: block;
    text-decoration: none;
}

.dropdown-content a:hover {
    background-color: grey;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>

            <a style="color: white" href="jsp/register.jsp">Đăng ký </a> <span style="color: white">/</span> <a style="color: white" href="jsp/login.jsp"> Đăng nhập</a>
            <a href="#" class="cart">🛒</a>
        </div>
    </header>

    <!-- BANNER -->
    <section class="banner">
        <img src="images/banner.jpg" alt="Helios Banner">
    </section>

    <!-- SẢN PHẨM MỚI -->
    <section class="products">
        <h2>Sản phẩm mới</h2>
        <div class="product-list">
            <% if (products != null && !products.isEmpty()) { 
                for (ProductDTO p : products) { %>
                    <div class="product">
                        <img src="images/<%= p.getImageUrl() %>" alt="<%= p.getName() %>">
                        <h3><%= p.getName() %></h3>
                        <p><strong><%= String.format("%,.0f", p.getPrice()) %> VNĐ</strong></p>
                        <p><%= p.getDescription() %></p>
                                         
                        <button>Thêm nhanh</button>
                    </div>
            <%  }
            } else { %>
                <p>Không có sản phẩm nào để hiển thị.</p>
            <% } %>
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
