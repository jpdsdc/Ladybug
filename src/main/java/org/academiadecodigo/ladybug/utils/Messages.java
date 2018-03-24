package org.academiadecodigo.ladybug.utils;

public enum Messages {

    ERROR_MESSAGE("There was an error: ");

    String message;

    Messages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
