package org.academiadecodigo.ladybug.client.model;

import org.academiadecodigo.ladybug.client.model.events.Event;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void buy(Event event){
        //TODO: to be implemented
    }

    @Override
    public String toString() {
        return username + ":" +
                password;
    }
}
