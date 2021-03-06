package org.academiadecodigo.ladybug.client.service;

import org.academiadecodigo.ladybug.client.model.User;
import org.academiadecodigo.ladybug.client.persistance.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcAuthService implements AuthService {

    private Connection connection;

    public JdbcAuthService(){
        connection = new ConnectionManager().getConnection();
    }

    @Override
    public boolean authenticate(String username, String password) {
        String query = "SELECT * FROM users WHERE username='" + username +
                "' AND password='" + password + "'";

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            if(rs.next()){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User register(String username, String password) {
        String query = "INSERT INTO users(username, password) VALUES ('" + username + "', '" + password + "');";

        User user = null;

        if(exists(username)){
            return null;
        }

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

    @Override
    public boolean exists(String username) {
        String query = "SELECT username, password FROM users WHERE username = '" + username  + "';";

        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
	        System.err.println(e.getMessage());
        }

        return false;
    }
}
