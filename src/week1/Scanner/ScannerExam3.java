package week1.Scanner;

import java.util.Scanner;

public class ScannerExam3 {
    public static void main(String[] args) {
    // 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
    // 조건 : 성과 이름은 띄어쓰기로 구분해주세요.
        Scanner scan = new Scanner(System.in);
        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

//        System.out.print("이름을 입력해주세요 : ");
//        String name = scan.nextLine();
//        System.out.print("나이를 입력해주세요 : ");
//        int age = scan.nextInt();
//        System.out.print("안녕하세요 "+age+"세 "+name+"입니다.");

        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.
        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();
        System.out.print("나이를 입력해주세요 : ");

        // 아래 거 외우기
        int age = Integer.parseInt(scan.nextLine());
        System.out.print("안녕하세요 "+age+"세 "+name+"입니다.");

    }
}
