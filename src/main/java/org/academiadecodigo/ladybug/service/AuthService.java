package org.academiadecodigo.ladybug.service;

import org.academiadecodigo.ladybug.model.User;

public interface AuthService {

    /**
     * Login's a user if already exists
     * @param username username
     * @param password password
     * @return if could authenticate
     */
    boolean authenticate(String username, String password);

    /**
     * Register a new user
     * @param username username
     * @param password password
     * @return the new user
     */
    User register(String username, String password);

}
