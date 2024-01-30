package day05;

import java.util.Random;

public class ArrayTest6 {
	
	public static void solution1() {
		System.out.println("--------------성적 확인 문제----------");
		String subject[]= {"국어", "수학", "영어", "과탐", "사탐"};
		//1하기 성적
		int[] term1= {99,75,82,50,48};
		//2학기 성적
		int[] term2= {80,82,100,50,42};
		
		int up=0;
		int same=0;
		String str="",str2="";
		for (int i = 0; i < term2.length; i++) {
			if(term1[i]<term2[i]) {
				up++;
				str+=subject[i]+", ";
			}else if(term1[i]==term2[i]) {
				same++;
				str2+=subject[i]+", ";
			}
		}
		System.out.println("향상된 과목수= "+up+", 과목명: "+str);
		System.out.println("동일한 과목수= "+same+", 과목명: "+str2);
	}
	
	public void solution2() {
		System.out.println("-------토익 문제 채점------------");
		System.out.println("번호:\t답안\t내답");
		System.out.println("-----------------------");
		int []dap;
		int []mydap;
		dap = new int[990];
		mydap = new int[990];
		Random ran = new Random();
		int num=0;
		for (int i = 0; i < dap.length; i++) {
			dap[i]=ran.nextInt(4)+1;
			mydap[i]=ran.nextInt(4)+1;
			if(dap[i]==mydap[i]) num++;
			System.out.printf("%d:\t%d\t%d\n",i+1, dap[i], mydap[i]);
		}
		System.out.println("내 점수: "+num);
		
	}

	public static void main(String[] args) {
		ArrayTest6.solution1();
		new ArrayTest6().solution2();
	}

	
}
