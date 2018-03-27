package org.academiadecodigo.ladybug.server;

import org.academiadecodigo.ladybug.client.Bootstrap;
import org.academiadecodigo.ladybug.client.view.FirstView;

import javax.sql.rowset.FilteredRowSet;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ServerWorker implements Runnable {

    private final Socket clientSocket;
    private final BufferedReader in;
    private  final PrintWriter out;
    private String origClient;
    private Scanner scanner;
    private Bootstrap bootstrap = new Bootstrap();
    private FirstView firstView;

    public ServerWorker(Socket clientSocket)
            throws IOException {
        this.clientSocket = clientSocket;
        this.origClient = "Client: ";

        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
    }

    @Override
    public void run() {
	    System.out.println("Started: " + Thread.currentThread().getName());
	    firstView.setPrintWriter(out);
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
			    }
		    } catch (IOException e) {
			    System.err.println(e.getMessage());
		    }
	    }

    }
}
