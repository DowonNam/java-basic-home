package week1.WarriorSimulation;

public class WarriorSimulation {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다.
        // 1.5배(15)의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 홍길동이/가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다.
        // 2배(30)의 피해를 입힙니다.
    }
}
class 전사{
    String 이름;
    int 나이;
    무기 a무기;
    void 자기소개(){
        System.out.printf("안녕하세요 저는 %d살 %s입니다.\n",나이,이름);
    }
    void 공격(){
        System.out.print(이름 + "이/가 ");
        a무기.사용();
        System.out.println();
    }
    void 스킬사용(){
        System.out.print(이름 + "이/가 ");
        a무기.스킬();
        System.out.println();
    }

}
class 무기 {
    void 사용(){
    }
    void 스킬(){

    }
}
class 활 extends 무기{
    void 사용(){
        System.out.printf("활로 10의 데미지를 입힙니다.");
    }
    void 스킬(){
        System.out.println("불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");
    }
}
class 칼 extends 무기{
    void 사용(){
        System.out.printf("칼로 15의 데미지를 입힙니다.");
    }
    void 스킬(){
        System.out.println("연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");
    }
}