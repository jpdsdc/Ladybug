package org.academiadecodigo.ladybug.server;
import org.academiadecodigo.ladybug.utils.Ansi;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private final int PORT = 6060;

    private List<ServerWorker> workers;
    private ServerSocket serverSocket;

    public static void main(String[] args) {
        new Server();
    }

    public Server(){
        workers = Collections.synchronizedList(new ArrayList<>());
        start();
    }

    /**
     * Starts the server and starts accepting clients
     */
    public void start() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println(Ansi.Green.colorize("STARTING CONNECTION...\n### CONNECTION ESTABLISHED ###"));
            acceptingClients();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Wait for a client to be accepted by the server
     * and add a server worker when the client joined
     *
     * @throws IOException exception in case the whole thing get fucked
     */
    public void acceptingClients() throws IOException {
        while (serverSocket.isBound()){
            Socket clientSocket = serverSocket.accept();

	        System.out.println(Ansi.Yellow.colorize("CONNECTED TO" + clientSocket.getInetAddress()));
            ServerWorker serverWorker = new ServerWorker(clientSocket);
            workers.add(serverWorker);

            Thread thread = new Thread(serverWorker);
            thread.start();
            System.out.println(Thread.currentThread().getName());
        }

        serverSocket.close();
    }


}

