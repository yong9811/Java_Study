package day04;

public class WhileTest3 {

	public static void main(String[] args) {
		int i=2;
		int j=1;
		while(i<=9) {
			while(j<=9) {
				System.out.println(i +" X "+ j +" = " + (i*j));
				j++;
				
			}
			System.out.println("");
			j=1;
			i++;
		}
	}	

}
