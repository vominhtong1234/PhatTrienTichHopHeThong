package tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Bai2Server {
	private ServerSocket server;
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;

	public Bai2Server() throws IOException {
		// TODO Auto-generated constructor stub
		server = new ServerSocket(4000);
		System.out.println("port:4000");
		socket = server.accept();
		System.out.println("accept client");
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		int s = Integer.parseInt(in.readUTF());
		switch (s) {
		case 1:
			out.writeUTF("My name is Server");
			out.flush();
			break;
		case 2:
			out.writeUTF("I am 20 year old");
			out.flush();
			break;
		case 3:
			out.writeUTF("I am alone");
			out.flush();
			break;
		default:
			out.writeUTF("thank you");
			out.flush();
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		new Bai2Server();
	}
}
