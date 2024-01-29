package day04;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //[문제1]  1~100까지 정수를 다음과 같은 식으로 계산한 수식과
        //		// 			결과값을 출력하세요
        //		//1+ (-2) + 3+(-4) + 5 + (-6) ....+(-100)
        //
        //
        //		//[문제2]
        //		// 1+ (1+2) + (1+2+3) + (1+2+3+4)...+(1+2+...+10)
        //		//의 결과값을 출력하세요
        //
        //
        //		//[문제3] Scanner이용해서 "구구단의 몇 단을 하시겠어요?" 입력받아 구구단식 출력하기
        //
        int start = 1;
        int end = 100;
        int result = 0;
        int n = 10;
        int innerSum = 0;

        System.out.print("수식: ");

        do {
            if (start % 2 == 1) {
                System.out.print(start);
                result += start;
            } else {
                System.out.print(" + " + "("+ -start +")");
                result -= start;
            }

            start++;

            if (start <= end) {
                System.out.print(" ");
            }

        } while (start <= end);

        System.out.println("\n결과값: " + result);

        do {
            innerSum += start;
            result += innerSum;

            if (start < n) {
            }

            start++;
        } while (start <= n);

        System.out.println("\n결과값: " + result);

        while (true) {
            System.out.print("구구단의 몇 단을 하시겠어요? (종료하려면 0 입력): ");
            int dan = scr.nextInt();

            if (dan == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; //
            }

            System.out.println(dan + "단 출력:");
            int multiplier = 1;

            while (multiplier <= 9) {
                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));
                multiplier++;
            }
        }

        scr.close();
    }
}