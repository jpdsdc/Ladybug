package org.academiadecodigo.ladybug.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private List<ServerWorker> workers;
    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        workers = Collections.synchronizedList(new ArrayList<>());
        serverSocket = new ServerSocket(port);
    }

}
