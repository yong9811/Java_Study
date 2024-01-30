package day05;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest2 {
	
	public static void foo() {
		System.out.println("1. 참조형 배열------------------");
		Object[] arr=new Object[5];
		arr[0]=new Object();
		arr[1]="Hello";
		arr[2]=new Random();
		arr[3]=new Date();
		arr[4]=new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(arr[i].toString());
			System.out.println("******************");
		}
		System.out.println("------------------------");
		
		for(Object obj:arr) {
			System.out.println(obj);
		}
	}
	
	public void bar() {
		System.out.println("2. 1차원 배열----------------");
		int[] a= {10,20};
		int b[]= {9,8,7,6};
		int c[];
		c=a;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		for(int v:a) {
			System.out.println(v);
		}
		
		c[1]=70;
		System.out.println("c[1]="+c[1]);
		System.out.println("a[1]="+a[1]);
		
		int[]x= {1,2,3,4,5};
		int[]y= {100,200};
		int[]tmp;
		
		tmp=x;
		x=y;
		y=tmp;
		for (int i = 0; i < x.length; i++) {
			System.out.printf("x[%d] : %d\n",i,x[i]);
		}
		for (int i = 0; i < y.length; i++) {
			System.out.printf("y[%d] : %d\n",i,y[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayTest2.foo();
		ArrayTest2 at=new ArrayTest2();
		at.bar();
	}

}
