package week1.Method;

public class Method6Exam {
    public static void main(String[] args) {
        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }
    public static void greeting1(int n){
        if(n == 1){
            System.out.println("안녕하세요");
        } else if(n ==2){
            System.out.println("하이~");
        } else {
            System.out.println("봉쥬");
            }
    }
//    public static void greeting2(int n,int k){
//        for(int i = 0; i < k; i++){
//            if (n == 1) {
//                System.out.println("안녕하세요");
//            } else if (n == 2) {
//                System.out.println("하이~");
//            } else {
//                System.out.println("봉쥬");
//            }
//        }
//    }

    // 아래 풀이가 더 간결하다
    public static void greeting2(int n, int l){
        for(int i = 0; i < l; i++) {
            greeting1(n);
        }
    }

}
