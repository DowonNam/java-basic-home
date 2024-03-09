package week1.DLoopExam;

public class DLoopExam {
    public static void main(String[] args) {
    // 문제 1 : 구구단 작성
    // 조건 : 짝수번째만 곱하기
    /* 출력예시 :

     2 * 2 = 4
    2 * 4 = 8
    2 * 6 = 12
    2 * 8 = 16

    ...

     9단까지 이런식으로 나오면 됩니다.

    */
        System.out.println("A1.");
    for(int i = 2; i < 10; i+=2){
        for(int j = 2; j < 10; j+=2){
        System.out.println(i+" * "+j+" = "+i*j);
        }
    }
// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */
    System.out.println("A2.");
    for(int i = n; i <= m; i+=2){
        for(int j = 2; j < 10; j+=2){
            System.out.println(i+" * "+j+" = "+i*j);
        }
    }

    }
}
