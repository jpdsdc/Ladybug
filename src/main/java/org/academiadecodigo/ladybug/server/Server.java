package org.academiadecodigo.ladybug.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private static final int PORT = 8080;
    private List<ServerWorker> workers;

    private ServerSocket serverSocket;

    public static void main(String[] args) {
        new Server();
    }

    public Server(){
        workers = Collections.synchronizedList(new ArrayList<>());

        try {
            serverSocket = new ServerSocket(PORT);
            connect();
            System.out.println("STARTING CONNECTION...\n### CONNECTION ESTABLISHED ###");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect() throws IOException {

        while (serverSocket.isBound()){
            Socket clientSocket = serverSocket.accept();
            int clientPort = clientSocket.getPort();

            ServerWorker serverWorker = new ServerWorker(clientSocket, clientPort);
            workers.add(serverWorker);

            Thread thread = new Thread(serverWorker);
            thread.start();
            System.out.println(Thread.currentThread().getName());
        }
        serverSocket.close();
    }

    class ServerWorker implements Runnable {

        private Socket clientSocket;
        private int clientPort;

        public ServerWorker(Socket clientSocket, int clientPort){
            this.clientSocket = clientSocket;
            this.clientPort = clientPort;
        }

        @Override
        public void run() {

        }
    }

}
