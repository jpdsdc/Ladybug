package org.academiadecodigo.ladybug.server;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ServerWorker implements Runnable {

    private final Socket clientSocket;
    private final BufferedReader in;
    private  final PrintWriter out;
    private String origClient;
    private Scanner scanner;

    public ServerWorker(Socket clientSocket)
            throws IOException {
        this.clientSocket = clientSocket;
        this.origClient = "Client: ";

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
    }

    public void receive(String origClient, String message) {
        out.write(origClient + ": " + message + "\n");
        out.flush();
    }

    public void send(){
    	String message = "";
    	scanner = new Scanner(System.in);
    	message = scanner.nextLine();
	    out.write("Server: " + message + "\n");
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
				    System.out.println(origClient + ": " + line);
			    	receive(origClient, line);
			    	send();
			    }
		    } catch (IOException e) {
			    System.err.println(e.getMessage());
		    }
	    }

    }
}
