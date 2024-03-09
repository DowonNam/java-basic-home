package week1.Var;

public class VarExam {
    public static void main(String[] args) {


    // 문제 1. 다양한 변수를 선언하고 아래처럼 출력해주세요.
    // 정수 : int, 실수(소수) : double, 문장 : String

    // 정답 1. 변수 선언
    int i = 100;
    double d = 3.14;
    String s = "안녕하세요";

    System.out.println("정답 1.");
      System.out.println(i); // 출력 : 100

      System.out.println(d); // 출력 : 3.14

      System.out.println(s); // 출력 : 안녕하세요

    i = 200;
    d = 10.5;
    s = "반갑습니다.";

      System.out.println(i); // 출력 : 200

      System.out.println(d); // 출력 : 10.5

      System.out.println(s); // 출력 : 반갑습니다.

    // 문제 2: a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

        int a = 5;
        int b = 10;
        System.out.println("\n정답 2.");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
    // 정답 2. 변수 c를 새로 선언해서 바꿔줌
        int c = a;

        a = b;
        b = c;

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
