package Main;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Product.ProductDAO;
import Product.ProductDTO;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "MainController", urlPatterns = {"/MainController", "/"})
public class MainController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        // Nếu không có action, tự động chuyển hướng đến loadProducts
        if (action == null || action.isEmpty()) {
            response.sendRedirect("MainController?action=loadProducts");
            return;
        }
        
        ProductDAO productDAO = new ProductDAO();
        try {
            switch (action) {
                case "loadProducts":  // Hiển thị tất cả sản phẩm
                    List<ProductDTO> products = productDAO.getAllProducts(); // Lấy danh sách sản phẩm từ DAO
                    request.setAttribute("products", products); // Đặt vào request
                    RequestDispatcher dispatcher = request.getRequestDispatcher("Main.jsp");
                    dispatcher.forward(request, response);
                    break;
                
                case "loadCategory":  // Lọc sản phẩm theo danh mục
                    String categoryId = request.getParameter("category");
                    List<ProductDTO> categoryProducts = productDAO.getProductsByCategory(categoryId);
                    request.setAttribute("category", categoryId);
                    request.setAttribute("products", categoryProducts);
                    request.getRequestDispatcher("category.jsp").forward(request, response);
                    break;
                
                default:  // Trang chủ mặc định
                    request.getRequestDispatcher("Main.jsp").forward(request, response);
                    break;
            }
        } catch (Exception e) {
            request.setAttribute("error", "Lỗi khi xử lý yêu cầu: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Main Controller - Load danh sách sản phẩm";
    }
}
