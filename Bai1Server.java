package tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Bai1Server {
	private ServerSocket server;
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	public Bai1Server() throws IOException {
		// TODO Auto-generated constructor stub
		server = new ServerSocket(5000);
		System.out.println("port:5000");
		socket = server.accept();
		System.out.println("accept client");
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		int s = Integer.parseInt(in.readUTF());
		switch (s) {
		case 1:
			out.writeUTF("một");
			out.flush();
			break;
		case 2:
			out.writeUTF("hai");
			out.flush();
			break;
		case 3:
			out.writeUTF("ba");
			out.flush();
			break;
		case 4:
			out.writeUTF("bốn");
			out.flush();
			break;
		case 5:
			out.writeUTF("năm");
			out.flush();
			break;
		case 6:
			out.writeUTF("sáu");
			out.flush();
			break;
		case 7:
			out.writeUTF("bảy");
			out.flush();
			break;
		case 8:
			out.writeUTF("tám");
			out.flush();
			break;
		case 9:
			out.writeUTF("chín");
			out.flush();
			break;
		default:
			out.writeUTF("không phải số nguyên");
			out.flush();
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		new Bai1Server();
	}
}
