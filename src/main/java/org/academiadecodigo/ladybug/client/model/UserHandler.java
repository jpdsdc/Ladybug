package org.academiadecodigo.ladybug.client.model;

import java.io.*;
import java.net.Socket;

public class UserHandler implements Runnable {

    private User user;
    private Socket socket;
    private BufferedReader inputBufferedReader;
    private BufferedWriter outputBufferedReader;

    public UserHandler(User user) {
        this.user = user;
    }

    public void init(String server, int port) {
        while (true) {
            try {
                socket = new Socket(server, port);
                setupSocketStreams();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void makeRequest(){

    }

    public void receiveRequest(){

    }

    private void setupSocketStreams() throws IOException {

        inputBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        outputBufferedReader = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

    }
    @Override
    public void run() {
    }
}
