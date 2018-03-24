package org.academiadecodigo.ladybug.service;

import org.academiadecodigo.ladybug.model.User;
import org.academiadecodigo.ladybug.persistance.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleAuthService implements AuthService {

    private Connection connection;

    public SimpleAuthService(){
        connection = new ConnectionManager().getConnection();
    }

    @Override
    public boolean authenticate(String username, String password) {
        return true;
    }

    @Override
    public User register(String username, String password) {
        return new User(username, password);
    }

    @Override
    public boolean exists(String username) {
        return false;
    }
}
