package org.academiadecodigo.ladybug.server;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ServerWorker implements Runnable {

    private final Socket clientSocket;
    private final BufferedReader in;
    private  final PrintWriter out;
    private String origClient;

    public ServerWorker(Socket clientSocket)
            throws IOException {
        this.clientSocket = clientSocket;
        this.origClient = "Client: ";

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
    }

    public void send(String origClient, String message) {
        out.write(origClient + ": " + message);
        out.flush();
    }

    @Override
    public void run() {
	    System.out.println("Started: " + Thread.currentThread().getName());

	    while (!clientSocket.isClosed()){
		    try {
			    String line = in.readLine();

			    if (line == null){
				    System.out.println("User left. Closing connection...");
				    in.close();
				    clientSocket.close();
				    continue;
			    } else if (!line.isEmpty()){
			    	send(origClient, line);
			    }
		    } catch (IOException e) {
			    e.printStackTrace();
		    }
	    }

    }
}
