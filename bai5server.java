package baitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class bai5server {

	public bai5server() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(1099);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("nhap ten sach");
			String name = inFromClient.nextLine();
			System.out.println("client: " + name);

			BufferedReader br = null;
			br = new BufferedReader(new FileReader("D:\\rmi\\list.txt"));
			String textInALine = br.readLine();
			if (textInALine.contains(name))
				outToClient.println("co sach ");
			else
				outToClient.println("khong co sach ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
