package day12;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient2 {

	public static void main(String[] args) 
	throws Exception
	{
		final int port=9100;
		Socket sock=new Socket("localhost",port);
		System.out.println("##서버에 접속 성공!!##");
		
		InputStream is=sock.getInputStream();
		BufferedReader in=new BufferedReader(new InputStreamReader(is));
		String serverMsg=in.readLine();
		System.out.println("From Server>>"+serverMsg);
		
		Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(sock.getOutputStream(),true);
		String myMsg="";
		while ((myMsg=sc.nextLine())!=null) {
			out.println(myMsg);
			serverMsg=in.readLine();
			System.out.println("From Server>>"+serverMsg);
		}
		
		if(in!=null) in.close();
		if(is!=null) is.close();
		if(sock!=null) sock.close();
		
	}

}
