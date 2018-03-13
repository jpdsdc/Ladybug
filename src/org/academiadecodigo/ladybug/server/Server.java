package org.academiadecodigo.ladybug.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private List<ServerWorker> workers;
    private ServerSocket serverSocket;

    public Server(int port){
        workers = Collections.synchronizedList(new ArrayList<>());
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
