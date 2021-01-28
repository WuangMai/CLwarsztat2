package entity;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class UserDAO {
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?)";
    //    TODO Sprawdzić czy jak dodam inne parametry to będzie działać/ username = ? OR email = ?
    private static final String READ_USER_QUERY = "SELECT * FROM users WHERE username = ?";
    private static final String UPDATE_USER_QUERY = "UPDATE user SET username = ?";
    private static final String DELETE_USER_QUERY = "DELETE FROM user WHERE username = ? AND email = ?";

    public User create(User user) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop2", "root", "coderslab")) {
            PreparedStatement preStmt = conn.prepareStatement(CREATE_USER_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);
            preStmt.setString(1, user.getUserName());
            preStmt.setString(2, user.getEmail());
            preStmt.setString(3, hashPw(user.getPassword()));
            preStmt.executeUpdate();

            ResultSet rs = preStmt.getGeneratedKeys();
            if (rs.next()) {
                user.setId(rs.getInt(1));
            }
            return user;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String hashPw(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }
}
