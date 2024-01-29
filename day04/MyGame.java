package day04;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
	
	public static void menu() {
		System.out.println("**********MyGame v1.1************");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("*********************************");
		System.out.println("입력하세요 =>");
		System.out.println("*********************************");
	}
	
	public static void startGame() {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		int win=0;
		int count=0;
		for(;;) {
			MyGame.menu();
			int me=sc.nextInt();
			int com=ran.nextInt(3)+1;
			System.out.println("me: "+me+", com: "+com );
			
			count++;
			if(me==9) {
				System.out.println("Bye Bye~~");
				System.exit(0);
			}
			
			if(me<1||me>3) {
				System.out.println("메뉴에 없는 번호입니다!! 다시 입력하세요=> ");
				continue;
			}
			String msg="";
			if(me==com) {
				msg="비겼네요~";
				
			}else if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)) {
				msg="당신이 이겼네요^^";
				win++;
			}else {
				msg="당신이 졌어요 ㅠㅠ";
			}
			
			String result1=MyGame.show(me);
			
			System.out.println("당 신: "+result1);
			System.out.println("컴퓨터: "+MyGame.show(com));
			System.out.println(msg);
			System.out.println("전체 시도 횟수: "+count+", 당신이 승리한 횟수: "+win);
		}
	}
	
	static public String show(int num) {
		String str="";
		switch (num) {
		case 1:
			str="가위 [☞]";
			break;
		case 2:
			str="바위 [●]";
			break;
		case 3:
			str="보 [▣]";
			break;
		}
		return str;
	}

	public static void main(String[] args) {
		MyGame.startGame();
	}

}