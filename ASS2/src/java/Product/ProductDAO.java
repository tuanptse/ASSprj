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
        String sql = "SELECT product_id, name, description,.price,material,category_id,image_url,created_at,product_amount FROM products";

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
                        rs.getTimestamp("created_at").toLocalDateTime(), 
                        rs.getInt("product_amount")
                );
                System.out.println("Lấy sản phẩm: " + p.getName());
                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println("Tổng số sản phẩm lấy được: " + products.size());
        return products;
    }
    
    public List<ProductDTO> getProductsByCategory(String categoryId) {
    List<ProductDTO> products = new ArrayList<>();
    String sql = "SELECT * FROM products WHERE category_id = ?";

    try (Connection conn = DBUtils.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, categoryId);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            products.add(new ProductDTO(
                rs.getInt("product_id"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getDouble("price"),
                rs.getString("material"),
                rs.getInt("category_id"),
                rs.getString("image_url"),
                rs.getTimestamp("created_at").toLocalDateTime(),
                rs.getInt("product_amount")
            ));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return products;
}

}
