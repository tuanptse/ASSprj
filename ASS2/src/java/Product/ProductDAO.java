package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;
import Product.ProductDTO;

public class ProductDAO {

    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> products = new ArrayList<>();
        String sql = "SELECT p.product_id, p.name, p.description, p.price, p.material, " +
                     "p.image_url, p.product_amount, p.category_id, p.created_at, " +
                     "ISNULL(AVG(r.rating), 0) AS avg_rating, COUNT(r.review_id) AS total_reviews " +
                     "FROM Products p " +
                     "LEFT JOIN Reviews r ON p.product_id = r.product_id " +
                     "GROUP BY p.product_id, p.name, p.description, p.price, p.material, " +
                     "p.image_url, p.product_amount, p.category_id, p.created_at";

        try (Connection conn = DBUtils.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ProductDTO p = new ProductDTO(
                        rs.getInt("product_id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getString("material"),
                        rs.getInt("category_id"),
                        rs.getString("image_url"),
                        rs.getTimestamp("created_at").toLocalDateTime(), // Chuyển về LocalDateTime
                        rs.getInt("product_amount"),
                        rs.getDouble("avg_rating"),
                        rs.getInt("total_reviews"));

                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
