package week1.DuckSimulation;

public class DS1 {
public static void main(String[] args) {
//    오리 a오리 = new 오리();
//    a오리.날다();
//    // 출력 : 오리가 날개로 날아갑니다.
    청둥오리 a청둥오리 = new 청둥오리();
    a청둥오리.날다();
    a청둥오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.

    흰오리 a흰오리 = new 흰오리();
    a흰오리.날다();
    a흰오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.
    고무오리 a고무오리 = new 고무오리();
    a고무오리.날다();
    a고무오리.헤엄치다();
    //출력 : 오리가 날개로 날아갑니다.
    고무2오리 a고무2오리 = new 고무2오리();
    a고무2오리.날다();
    a고무2오리.헤엄치다();
    // 출력 : 저는 날 수 없어요. ㅜㅠ
    아수라오리 a아수라오리 = new 아수라오리();
    a아수라오리.날다();
    a아수라오리.헤엄치다();
    // 출력 : 오리가 날개로 날아갑니다.
    // 출력 : 오리가 둥둥 떠다닙니다.
    }
}
class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
class 청둥오리 extends 오리 {
}
class 흰오리 extends 오리 {
}
class 고무오리 extends 오리 {
    void 날다(){
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
    void 헤엄치다(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class 고무2오리 extends 고무오리 {
}
class 아수라오리 extends 오리{
    void 헤엄치다(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}