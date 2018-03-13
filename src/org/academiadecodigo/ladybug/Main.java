package org.academiadecodigo.ladybug;

import org.academiadecodigo.ladybug.server.Server;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       new Server(9000);
        System.out.println(new Date());
    }
}
