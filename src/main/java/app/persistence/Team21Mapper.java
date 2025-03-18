package app.persistence;

import app.entities.Team21EntityUser;
import app.exceptions.DatabaseException;
import io.javalin.http.Context;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*

public class Team21Mapper {
    public static Team21EntityUser login(String username, String password, ConnectionPool connectionPool) throws DatabaseException{
        String sql = "SELECT * FROM users WHERE username=?";

        try (
                Connection connection = connectionPool.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("username");
                String hashedPassword = rs.getString("password");

                if (BCrypt.checkpw(password, hashedPassword)) {
                    return new Team21EntityUser(id, userName, hashedPassword);
                } else {
                    throw new DatabaseException("Login failed. Please try again");
                }
            } else {
                throw new DatabaseException("User not found. Please try again");
            }
        }catch (SQLException e) {
            throw new DatabaseException("DB error", e.getMessage());
        }
    }
}


 */