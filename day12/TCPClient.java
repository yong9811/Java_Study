package day12;
import java.net.*;
import java.io.*;

public class TCPClient {

	public static void main(String[] args) 
	throws IOException
	{
		for (int i = 0; i < 10; i++) {
			Socket sock=new Socket("127.0.0.1",9100);
			System.out.println("클라이언트 "+i+"서버에 접속되었음!!");
		}
		
	}
	

}
