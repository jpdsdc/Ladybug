package org.academiadecodigo.ladybug.client.service;

import org.academiadecodigo.ladybug.client.model.User;
import org.academiadecodigo.ladybug.client.persistance.ConnectionManager;

import java.sql.Connection;

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
