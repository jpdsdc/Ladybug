package org.academiadecodigo.ladybug.server;
import org.academiadecodigo.ladybug.client.model.User;
import org.academiadecodigo.ladybug.utils.Ansi;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private final static int PORT = 6060;
    private final List<ServerWorker> workers = Collections.synchronizedList(new ArrayList<ServerWorker>());

    public static void main(String[] args) {

        int port = PORT;

        try {

            if (args.length > 0) {
                port = Integer.parseInt(args[0]);
            }

            Server server = new Server();
            server.start(port);

        } catch (NumberFormatException ex) {
            System.exit(1);

        }
    }

    private void start(int port) {
        int connectionCount = 0;

        try {

            // Bind to local port
            System.out.println("Connecting to " + port + ", please wait  ...");
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started: " + serverSocket);

            while (true) {

                // Block waiting for client connections
                Socket clientSocket = serverSocket.accept();

                try {

                    // Create a new Server Worker
                    connectionCount++;
                    String name = "Client: " + connectionCount;

                    ServerWorker worker = new ServerWorker(name, clientSocket, this);

                    workers.add(worker);

                    // Serve the client connection with a new Thread
                    Thread thread = new Thread(worker);
                    thread.setName(name);
                    thread.start();

                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


    public List<ServerWorker> getWorkers() {
        return workers;
    }

}

