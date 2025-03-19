<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>HELIOS - Trang sức</title>
    <!-- Link tới nhan.css -->
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/khuyentai.css">
</head>
<body>
    <!-- Header -->
    <header class="header-banner">
        <nav class="top-nav">
            <!-- Bên trái -->
            <ul class="menu-left">
                <!-- MENU dạng dropdown -->
                <li class="dropdown">
                    <a href="<%= request.getContextPath() %>/Main.jsp">
                                MENU
                            </a>
                    <ul class="dropdown-content">
                        <!-- Khi bấm vào NHẪN, điều hướng tới nhan.jsp -->
                        <li>
                            <a href="<%= request.getContextPath() %>/nhan.jsp">
                                NHẪN
                            </a>
                        </li>
                        <!-- Khi bấm vào VÒNG TAY, điều hướng tới vongtay.jsp -->
                        <li>
                            <a href="<%= request.getContextPath() %>/vongtay.jsp">
                                VÒNG TAY
                            </a>
                        </li>
                        <!-- Tương tự các link còn lại -->
                        <li>
                            <a href="<%= request.getContextPath() %>/daychuyen.jsp">
                                DÂY CHUYỀN
                            </a>
                        </li>
                        <li>
                            <a href="<%= request.getContextPath() %>/matdaychuyen.jsp">
                                MẶT DÂY CHUYỀN
                            </a>
                        </li>
                        <li>
                            <a href="<%= request.getContextPath() %>/khuyentai.jsp">
                                KHUYÊN TAI
                            </a>
                        </li>
                    </ul>
                </li>

                <li>COLLECTIONS</li>
                <li>EYEWEAR</li>
                <li class="highlight">CUỐI MÙA</li>
            </ul>

            <!-- Bên phải -->
            <div class="menu-right">
                <a style="color: white" href="<%= request.getContextPath()%>/register.jsp">Đăng ký</a>
                <span style="color: white">/</span> 
                <a style="color: white" href="<%= request.getContextPath()%>/login.jsp">Đăng nhập</a>
                <a href="#" class="cart">🛒</a>
            </div>
        </nav>

        <!-- Phần banner -->
        <div class="banner-content">
            <h1>HELIOS</h1>
            <h2>KHUYÊN TAI - KHẲNG ĐỊNH SỰ KHÁC BIỆT</h2>
            <p>
                Khám phá bộ sưu tập nhẫn bạc nam đẹp, chất liệu bạc cao cấp, đa dạng kiểu dáng.  
                Thiết kế độc nhất, tinh tế nâng tầm phong cách đàn ông trưởng thành.
            </p>
        </div>
    </header>

    <!-- Main Content -->
    <main>
        <!-- Sidebar: Bộ lọc -->
        <aside>
            <div class="filter-box">
                <h3>Giá</h3>
                <div class="price-filter">
                    <input type="number" placeholder="₫ 0">
                    <input type="number" placeholder="₫ 4.150.000">
                    <input type="range" min="0" max="4150000">
                </div>

                <h3>Size</h3>
                <div class="size-options">
                    <label><input type="radio" name="size" value="1"> Size 1</label>
                    <label><input type="radio" name="size" value="2"> Size 2</label>
                    <label><input type="radio" name="size" value="3"> Size 3</label>
                </div>
            </div>
        </aside>

        <!-- Danh sách sản phẩm -->
        <section class="product-grid">
            <div class="product">
                <img src="images/hunterskull1.png" alt="Khuyên tai 1">
                <h4>Mafi Lotus Ring Helios Silver</h4>
                <p>Từ 1.250.000 VND</p>
            </div>
            <div class="product">
                <img src="assets/images/ring2.jpg" alt="Khuyên tai 2">
                <h4>Roto Helios Black Silver</h4>
                <p>Từ 1.350.000 VND</p>
            </div>
            <div class="product">
                <img src="assets/images/ring3.jpg" alt="Khuyên tai 3">
                <h4>Torua Helios Black Silver</h4>
                <p>Từ 860.000 VND</p>
            </div>
        </section>
    </main>
</body>
</html>
