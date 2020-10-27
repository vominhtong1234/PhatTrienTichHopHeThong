package tuan4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Bai1Client {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	public Bai1Client() throws UnknownHostException, IOException {
		// TODO Auto-generated constructor stub
		socket = new Socket("localhost", 5000);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		System.out.println("mời nhập");
		out.writeUTF(sc.nextLine());
		out.flush();
		System.out.println(in.readUTF());
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Bai1Client();
	}
}