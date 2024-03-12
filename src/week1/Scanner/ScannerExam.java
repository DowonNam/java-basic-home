package week1.Scanner;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {

    //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
    //입출력 예시
    //첫번째 숫자를 입력해주세요: 12
    //두번째 숫자를 입력해주세요: 33
    //12 + 33 = 45

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요: ");
        int num1 = scan.nextInt();

        System.out.print("두번째 숫자를 입력해주세요: ");
        int num2 = scan.nextInt();

        System.out.println(num1 +" + " + num2 + " = " + (num1+num2));

    }
}
