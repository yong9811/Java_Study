package day05;

public class ArrayTest {

	public void testArray() {
		System.out.println("1차원 배열-----------------");
		int []a;
		boolean b[];
		
		a=new int[3];
		b=new boolean[3];
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		a[0]=100;
		a[1]=017;
		a[2]=0x16;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		b[0]=true;
		b[1]=false;
		b[2]=4>2;
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(int x:a) {
			System.out.println("x: "+x);
		}
		
		for(boolean x:b) {
			System.out.println("x: "+x);
		}
	}
	
	public static void testArray2() {
		System.out.println("2. 참조형 배열-----------------");
		String a[]={"Hi","Hello","Good","Morning"};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for(String x:a) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		ArrayTest at=new ArrayTest();
		at.testArray();
		
		ArrayTest.testArray2();
	}

}
