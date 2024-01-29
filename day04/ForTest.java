package day04;

public class ForTest {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("★");
			}
			System.out.print("\n");
		}
		System.out.println("----------------------------");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("i="+i+", j="+j);
			}
			System.out.println("***************");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
