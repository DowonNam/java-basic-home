package week1.Method;

public class Method9Exam {
    public static void main(String[] args) {
        // 0은 양수로 보겠습니다.
        int no = 1;

        if(isNegative(no)) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }
        // no 값을 바꿔가면서 테스트해보세요.
    }
    public static boolean isNegative(int n){
        if(n < 0){
            return true;
        } else {
            return false;
        }
    }

}
