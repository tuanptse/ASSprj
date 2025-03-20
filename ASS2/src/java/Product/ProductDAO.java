package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

public class ProductDAO {

    // ✅ Lấy tất cả sản phẩm
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> products = new ArrayList<>();
        String sql = "SELECT product_id, name, description, price, material, category_id, image_url, created_at, product_amount FROM products";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                products.add(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // ✅ Lấy sản phẩm theo danh mục
    public List<ProductDTO> getProductsByCategory(String categoryId) {
        List<ProductDTO> products = new ArrayList<>();
        String sql = "SELECT * FROM products WHERE category_id = ? ORDER BY created_at DESC";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                products.add(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // ✅ Lấy sản phẩm theo trang (Phân trang)
    public List<ProductDTO> getProductsByPage(int page, int productsPerPage) {
        List<ProductDTO> productList = new ArrayList<>();
        int offset = (page - 1) * productsPerPage;

        String sql = "SELECT * FROM products ORDER BY created_at DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, offset);
            ps.setInt(2, productsPerPage);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productList.add(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    // ✅ Đếm tổng số sản phẩm (Hỗ trợ phân trang)
    public int getTotalProducts() {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM products";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    // ✅ Lấy sản phẩm theo danh mục và phân trang
    public List<ProductDTO> getProductsByCategoryAndPage(String categoryId, int page, int productsPerPage) {
        List<ProductDTO> productList = new ArrayList<>();
        int offset = (page - 1) * productsPerPage;

        String sql = "SELECT * FROM products WHERE category_id = ? ORDER BY created_at DESC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, categoryId);
            ps.setInt(2, offset);
            ps.setInt(3, productsPerPage);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productList.add(mapResultSetToProduct(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    // ✅ Đếm tổng số sản phẩm theo danh mục
    public int getTotalProductsByCategory(String categoryId) {
        int count = 0;
        String sql = "SELECT COUNT(*) FROM products WHERE category_id = ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, categoryId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    // ✅ Hàm tái sử dụng để tạo ProductDTO từ ResultSet
    private ProductDTO mapResultSetToProduct(ResultSet rs) throws SQLException {
        return new ProductDTO(
                rs.getInt("product_id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getDouble("price"),
                rs.getString("material"),
                rs.getInt("category_id"),
                rs.getString("image_url"),
                rs.getTimestamp("created_at").toLocalDateTime(),
                rs.getInt("product_amount")
        );
    }

    public ProductDTO getProductById(int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
