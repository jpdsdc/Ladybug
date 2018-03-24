package org.academiadecodigo.ladybug.server;

import java.io.*;
import java.net.Socket;

public class ServerWorker implements Runnable {

    private Socket clientSocket;

    private BufferedReader in;
    private PrintWriter out;

    public ServerWorker(Socket clientSocket)
            throws IOException {
        this.clientSocket = clientSocket;

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
    }

    public void send(String origClient, String message) {
        out.write(origClient + ": " + message);
    }

    @Override
    public void run() {

    }
}
