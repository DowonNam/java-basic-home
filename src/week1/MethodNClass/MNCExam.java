package week1.MethodNClass;

public class MNCExam {
    public static void main(String[] args) {
        // 문제1.
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car c1 = new Car();
        int num = 3;
        c1.run();
        c1.run();
        c1.run();

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        c2.run();
        c3.run();
        c4.run();
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.

        // 문제2.
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

        c1.max = 200;
        c1.maxrun();
        c2.max = 250;
        c2.maxrun();



    }
}
class Car{
    int max;
    void run() {
        System.out.println("자동차가 달립니다.");
    }
//    void maxrun(int max){
//        System.out.println("자동차가 최대속력 " + max +"km로 달립니다.");
//    }
    void maxrun(){
        System.out.println("자동차가 최대속력 " + max + "km로 달립니다.");
    }

}
