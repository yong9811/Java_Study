package day05;

public class ArrayTest5 {
	
	public static void info() {
		String[] 식구= {"아버지", "어머니", "형", "나", "동생"};
		int[] 나이= {100,88,33,24,10};
		double[] 키= {177.5,152.2, 190.3, 167.7, 155.3};
		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i]+"\t"+나이[i]+"\t"+키[i]);
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("우리집 식구 정리");
		System.out.println("------------------");
		System.out.println("이름\t나이\t키");
		System.out.println("------------------");
		ArrayTest5.info();
		
	}

}
