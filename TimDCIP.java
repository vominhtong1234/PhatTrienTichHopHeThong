package bai1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TimDCIP {
	public static void main(String argv[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Mời bạn nhập");
			InetAddress host = InetAddress.getByName(sc.nextLine());
			String hostName = host.getHostName();
			System.out.println("Host name:"+hostName);
			System.out.println("Dia chi IP:"+host.getHostAddress());
			}
			catch(UnknownHostException e)
			{
			System.out.println("Khong tim thay dia chi");
			return;
			}
	}
}