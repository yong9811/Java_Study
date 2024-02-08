package day12;
import java.net.*;
import java.util.Date;
import java.io.*;

public class TCPServer {

	public static void main(String[] args) throws IOException{
		ServerSocket server=new ServerSocket(9100);
		System.out.println("클라이언트 연결 기다리는 중...");
		while (true) {
			Socket sock=server.accept();
			InetAddress ip=sock.getInetAddress();
			System.out.println("클라이언트가 접속함..."+ip.getHostAddress());
			
			OutputStream os=sock.getOutputStream();
			PrintWriter out=new PrintWriter(os, true);
			out.print("안녕하세요 클님?");
			
			InputStream is=sock.getInputStream();
			BufferedReader in=new BufferedReader(new InputStreamReader(is,"utf-8"));
			String clientMsg="";
			while((clientMsg=in.readLine())!=null) {
				System.out.println("From Client>>"+clientMsg);
				if(clientMsg.contains("안녕")||clientMsg.contains("하이")) {
					out.println("반가워요 클님~~^^");
				}else if(clientMsg.contains("오늘 날짜")) {
					Date today=new Date();
					out.println(today.toString());
				}else {
					out.println("님 어여 가세요");
				}
			}
			if(clientMsg==null) {
				System.out.println("클이 접속을 끊었어요");
				break;
			}
		}
	}

}
