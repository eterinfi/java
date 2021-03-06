package web.socket;

import java.net.*;
import java.io.*;

public class ServerDemo extends Thread {
	
	private ServerSocket serverSocket;
	
	public ServerDemo(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		while(true)
			try {
				System.out.println("Waiting for connection on port " + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Connected to " + server.getRemoteSocketAddress());
				
				InputStream inFromClient = server.getInputStream();
				DataInputStream in = new DataInputStream(inFromClient);
				System.out.println("Message from Client: " + in.readUTF());
				
				OutputStream outToClient = server.getOutputStream();
				DataOutputStream out = new DataOutputStream(outToClient);
				out.writeUTF("Welcome to " + server.getLocalSocketAddress() + "\nBye!");
				
				server.close();
			} catch (SocketTimeoutException s) {
				System.out.println("Socket timeout!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
	}

	public static void main(String[] args) {
		int port = Integer.parseInt(args[0]);
		try {
			Thread t = new ServerDemo(port);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}