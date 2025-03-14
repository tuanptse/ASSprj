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
                     "IFNULL(AVG(r.rating), 0) AS avg_rating, COUNT(r.review_id) AS total_reviews " +
                     "FROM Products p " +
                     "LEFT JOIN Reviews r ON p.product_id = r.product_id " +
                     "GROUP BY p.product_id";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ProductDTO p = new ProductDTO();
                p.setProductId(rs.getInt("product_id"));
                p.setName(rs.getString("name"));
                p.setDescription(rs.getString("description"));
                p.setPrice(rs.getDouble("price"));
                p.setMaterial(rs.getString("material"));
                p.setImageUrl(rs.getString("image_url"));
                p.setProductAmount(rs.getInt("product_amount"));
                p.setCategoryId(rs.getInt("category_id"));
                p.setCreatedAt(rs.getString("created_at"));

                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
