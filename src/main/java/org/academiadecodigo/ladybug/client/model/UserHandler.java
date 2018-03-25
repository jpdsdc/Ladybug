package org.academiadecodigo.ladybug.client.model;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class UserHandler {


	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private static final String SERVER = "localhost";
	private static final int PORT = 8080;

	public void init(String server, int port) {
		while (true) {
			try {
				socket = new Socket(server, port);
				System.out.println("Connected: " + socket);
				Thread thread = new Thread(new ClientWorker());
				makeRequest();
				thread.start();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void makeRequest() {
		while (!socket.isClosed()) {
			String message = null;

			try {
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				message = answer();
				System.out.println(message);
				out.write(message);
				out.newLine();
				out.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}


			if (message == null) {
				break;
			}

			try {
				out.write(message);
				out.newLine();
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
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
