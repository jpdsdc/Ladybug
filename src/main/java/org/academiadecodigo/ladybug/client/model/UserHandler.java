package org.academiadecodigo.ladybug.client.model;

import java.io.*;
import java.net.Socket;

public class UserHandler implements Runnable {


	private Socket socket;
	private BufferedReader in;
	private BufferedWriter out;
	private static final String SERVER = "localhost";
	private static final int PORT = 3306;

	private void init(String server, int port) {
		while (true) {
			try {
				socket = new Socket(server, port);
				System.out.println("Connected: " + socket);
				start();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void start() {
		Thread thread = new Thread(this);
		thread.start();

		setupSocketStreams();
		makeRequest();

	}

	private void makeRequest() {
		while (!socket.isClosed()) {
			String message = null;

			try {
				message = in.readLine();
			} catch (IOException e) {
				System.err.println(e.getMessage());
				break;
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
			} finally {
				try {
					socket.close();
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void setupSocketStreams() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void run() {
		init(SERVER, PORT);

	}
}
