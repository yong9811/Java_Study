package day04;

public class DoWhileTest {

	public static void main(String[] args) throws Exception {
		int i=100;
		do {
			System.out.println("Hello: "+i);
			i++;
		}while(i<6);
		System.out.println("The End ~~~~"+i);
		
		int num=0;
		do {
			System.out.println("0~9사이의 정수값을 입력하세요[종료:X]");
			num=System.in.read();
			System.in.skip(2);
			System.out.println("num: "+num);
		}while(num!='x');
	}

}
