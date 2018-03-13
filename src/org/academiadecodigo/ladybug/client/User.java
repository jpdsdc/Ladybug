package org.academiadecodigo.ladybug.client;

import java.net.Socket;

public class User {

    private Socket socket;

    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        //TODO: add socket and init with server port
    }
}
