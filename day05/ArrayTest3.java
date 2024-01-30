package day05;

import java.util.Random;

public class ArrayTest3 {

	public static void getScores() {
		System.out.println("--------수능 점수 구하기----------");
		int[] score=new int[10000];
		Random ran=new Random(50);
		for (int i = 0; i < score.length; i++) {
			score[i]=ran.nextInt(451);
			System.out.println(score[i]);
		}
		
		int cnt450=0, cnt0=0, sum=0, cnt50=0;
		float avg=0.0f;
		
		for (int i = 0; i < score.length; i++) {
			if(score[i]==450) {
				cnt450++;
				System.out.println("만점자 번호: "+i);
			}else if(score[i]==0) {
				cnt0++;
			}
			sum+=score[i];
		}
		avg=sum/(float)score.length;
		
		for(int jumsu:score) {
			if(jumsu>=avg-50&&jumsu<=avg+50) {
				cnt50++;
			}
		}
		System.out.println("총 합계 점수: " +sum);
		System.out.println("평균   점수: "+avg);
		System.out.println("만점자   수: "+cnt450);
		System.out.println("0점자   수: "+cnt0);
		System.out.println("평균점수+-50인 수: "+cnt50);
	}
	
	public static void main(String[] args) {
		ArrayTest3.getScores();
	}

}
