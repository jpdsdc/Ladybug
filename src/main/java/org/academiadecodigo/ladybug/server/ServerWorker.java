package org.academiadecodigo.ladybug.server;

import org.academiadecodigo.ladybug.client.Bootstrap;
import org.academiadecodigo.ladybug.client.view.FirstView;
import org.academiadecodigo.ladybug.utils.Messages;

import javax.sql.rowset.FilteredRowSet;
import java.io.*;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class ServerWorker implements Runnable {

	final private Server server;
	final private String name;
	final private Socket clientSocket;
	final private BufferedReader in;
	final private BufferedWriter out;

	private final List<ServerWorker> clientsList;

	public ServerWorker(String name, Socket clientSocket, Server server) throws IOException {

		this.server = server;
		this.name = name;
		this.clientSocket = clientSocket;

		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

		clientsList = server.getWorkers();

	}

	@Override
	public void run() {

		System.out.println("Thread " + name + " started");

		messageToUser(Messages.WELCOME + "");
		messageToUser(Messages.LADYBUG + "");
		int currentPlayerIndex = clientsList.indexOf(this);


		// QUESTIONS LOOP
		while (true) {


			// Blocks waiting for client messages
			String line = null;
			try {
				line = in.readLine();
				System.out.println("Client " + name + " closed, exiting...");

				in.close();
				clientSocket.close();
				continue;
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (line == null) {


			} else if (!line.isEmpty()) {

			}

			System.exit(0);

		}
	}

	public void messageToUser(String message) {

		try {
			out.write(message);
			out.newLine();
			out.flush();

		} catch (IOException ex) {
			System.out.println(name + " : " + ex.getMessage());
		}

	}
}