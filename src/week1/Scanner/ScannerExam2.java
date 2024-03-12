package week1.Scanner;

import java.util.Scanner;

public class ScannerExam2 {
    public static void main(String[] args) {
        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.
        System.out.printf("원하는 단을 입력해주세요 : ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();



        for(int i = 1; i < 10; i++){
            System.out.println(num1 + " * " + i +" = " + num1*i);
        }
    }
}
