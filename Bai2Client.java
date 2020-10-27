package tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Bai2Client {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;

	public Bai2Client() throws UnknownHostException, IOException {
		// TODO Auto-generated constructor stub
		socket = new Socket("localhost", 4000);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		System.out.println("mời lựa chọn");
		System.out.println("1:what your name?");
		System.out.println("2:how old are you?");
		System.out.println("3:Do you have a girlfriend yet?");
		System.out.println("4:exit");
		out.writeUTF(sc.nextLine());
		out.flush();
		System.out.println(in.readUTF());
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		new Bai2Client();
	}
}
