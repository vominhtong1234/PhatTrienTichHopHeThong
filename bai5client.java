package baitap;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai5client {

	public bai5client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {

			Socket client = new Socket("LocalHost", 1099);
			System.out.println("Client da duoc tao");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			outToServer.println(name);
			System.out.println("server: " + inFromServer.nextLine());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
