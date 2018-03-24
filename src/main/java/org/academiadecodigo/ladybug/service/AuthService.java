package org.academiadecodigo.ladybug.service;

public interface AuthService {

    /**
     * Login's if already exists, register's if not
     * @param username username
     * @param password password
     * @return if could authenticate
     */
    boolean authenticate(String username, String password);

}
