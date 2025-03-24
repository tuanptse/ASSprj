package Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.DBUtils;

public class UserDAO {
    public List<UserDTO> getAllUsers() throws SQLException {
        List<UserDTO> users = new ArrayList<>();
        String sql = "SELECT * FROM Users";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                UserDTO user = new UserDTO();
                user.setUserId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setRole(rs.getString("role"));
                user.setCreatedAt(rs.getString("createdAt"));
                users.add(user);
            }
        }
        return users;
    }
    public UserDTO checkLogin(String email, String password_hash) throws SQLException {
        UserDTO user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM [dbo].[tblUser] WHERE [userID] = ? AND [password] = ?";
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(sql);
                ptm.setString(1, email);
                ptm.setString(2, password_hash);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    int userId = rs.getInt("userId"); 
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");
                    String address = rs.getString("address");
                    String role = rs.getString("role");
                    String createAt = rs.getString("createAt");                
                    user = new UserDTO(userId, name, email, phone, address, role,createAt, password_hash);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }
}
