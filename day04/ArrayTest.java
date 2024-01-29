package day04;

import java.util.Scanner;

public class ArrayTest {
	
	public static void test1() {
		System.out.println("1. 1차원 배열--------------");
		int[] arr= {1,2,3};
		System.out.println(arr);
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		
		int b[];
		double[]c;
		
		b=new int[5];
		c=new double[2];
		System.out.println("b[0]="+b[0]);
		System.out.println("c[0]="+c[0]);
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		System.out.println("b[0]="+b[0]);
		
		c[0]=.456;
		c[1]='A';
		System.out.println("c[0]="+c[0]);
		System.out.println("c[1]="+c[1]);
		
		System.out.println("b.length: "+b.length);
		System.out.println("c.length: "+c.length);
		
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		
		char[] ch=new char[3];
		ch[0]='H';
		ch[1]='i';
		ch[2]='?';
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
	
	public void test2() {
		System.out.println("2. 1차원 배열--------------");
		
		float[] a= {-16.1f,(float) 200.1,30E-7f,100}; 
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayTest.test1();
		ArrayTest obj=new ArrayTest();
		obj.test2();
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
	}
}
