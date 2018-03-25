package org.academiadecodigo.ladybug.client.model;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class UserHandler {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private static final String SERVER = "localhost";
    private static final int PORT = 8080;

    public void init(String server, int port) {
        try {
            socket = new Socket(server, port);
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("Connected: " + socket);
            Thread thread = new Thread(new ClientWorker());
            thread.start();
        }
    }

    public void send(String message) {
        out.write(message);
    }

    private String answer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private class ClientWorker implements Runnable {
        @Override
        public void run() {
            while (!socket.isClosed()) {
                try {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    String message = in.readLine();
                    System.out.println(message);
                    init(SERVER, PORT);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
