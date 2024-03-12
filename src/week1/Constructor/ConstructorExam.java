package week1.Constructor;

public class ConstructorExam {
    public static void main(String[] args) {
        // 지역변수 => 하루살이 변수
        int k = 10; // main 함수 안에서만 산다.

        사람 a사람 = new 사람();
        a사람.나이 = 20;

        int dan = 8;  // main 함수 안에서만 산다.
        for ( int i = 1; i < 9; i++ ) {
            // i => for block 안에서만 산다.
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        // 여기에 this 를 쓰면 x
        System.out.println(a사람.나이);
        a사람.걷다();

        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}
class 사람 {
    int 나이;
    팔 a왼팔 = new 팔();
    // 팔 a왼팔 = new 팔();은 변수를 선언하고 동시에 객체를 생성하여 초기화하는 것이며,
    // 팔 a왼팔;은 변수만을 선언하고 초기화하지 않은 상태입니다.
    // 따라서 팔 a왼팔; 만 사용할 경우 초기화를 해야 함 > 아니면 null 값이어서 오류가 발생
    // 팔 a왼팔 = new 팔();
    void 걷다() {
        // 밑에 나이는 사용 되지 않는 게 맞다. 상단 int 나이와
        // 하단 this.나이만 class 사람에서 나이 역할을 하게 된다
        int 나이 = 22;
        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
    }
}
class 팔 {
    손 a손 = new 손();
    int 길이 = 100;
}

class 손{
    엄지손가락 a엄지손가락 = new 엄지손가락();
}
class 엄지손가락{
    int 길이 = 5;
}
