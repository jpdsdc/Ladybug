package org.academiadecodigo.ladybug.service;

import org.academiadecodigo.ladybug.model.User;
import org.academiadecodigo.ladybug.persistance.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthServiceImpl implements AuthService {

    private Connection connection;

    public AuthServiceImpl(){
        connection = new ConnectionManager().getConnection();
    }

    @Override
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM users WHERE username='" + username +
                "' AND password='" + password + "'";

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public User register(String username, String password) {
        String query = "INSERT INTO users(username, password) VALUES ('" + username + "', '" + password + "');";

        User user = null;

        try {
            Statement st = connection.createStatement();
            int rowsAffected = st.executeUpdate(query);

            if(rowsAffected > 0) {
                user = new User(username, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
