package baitap;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class bai2serverSocket {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(5000);
		System.out.println("server da mo cong port 5000");
		Socket socket=serverSocket.accept();
		System.out.println("server cho client keyt noi");
		DataOutputStream dataOutputStream = new  DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream =new DataInputStream(socket.getInputStream());
		
		//doc data tu client 
		
		String str =dataInputStream.readUTF();
		System.out.println("Client nhap:"+str);
		BufferedReader br = null;
		//gui du lieu ve tu server sau khi da xu ly
        br = new BufferedReader(new FileReader("D:\\rmi\\list.txt"));       
        String textInALine = br.readLine();
        if(textInALine.contains(str))
        	{
        	dataOutputStream.writeUTF("the book is found");
        	dataOutputStream.flush();
        	}
        else 
        	{
        	dataOutputStream.writeUTF("the book is not found");
        	dataOutputStream.flush();
        	}
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        serverSocket.close();
	}
}