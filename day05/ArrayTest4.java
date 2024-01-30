package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		System.out.println("1. 2차원 배열-----------------------------");
		
		int[][]a;
		int[]b[];
		int c[][];
		
		a=new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;

		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println(a[1][1]);
		
		System.out.println("a의 행의 크기: "+a.length);
		System.out.println("a의 열의 크기: "+a[0].length);
		
		System.out.println("a: "+a);
		System.out.println("a[0]: "+a[0]);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		byte[]data[]= {{-5,-9},{10},{0,120,-128}};
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println("####################");
		for(byte[] val:data) {
			for(byte v:val) {
				System.out.print(v+", ");
			}
			System.out.println();
		}
		
		String[] str[]= {{"A","B","C","D"},{"E","F","G","H"}};
		for(String[] row: str) {
			for(String val: row) {
				System.out.print(val.toLowerCase()+" ");
			}
			System.out.println();
		}
		
		String []arr[]=new String[3][];
		
		arr[0]=new String[2];
		arr[1]=new String[3];
		arr[2]=new String[1];
		
		arr[0][0]="HTML";
		arr[0][1]="CSS";
		
		arr[1][0]="JavaScript";
		arr[1][1]="Java";
		arr[1][2]="SQL";
		
		arr[2][0]="Jsp";
		
		for(String[] val:arr) {
			for(String s:val) {
				System.out.print(s.toLowerCase()+", ");
			}
		}
		
		
		
	}

}
