package week1.AccessModifier;

public class AMExam {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(20);

        System.out.println("제 번호는 " + p1.getId() + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
        p1.printAge();

//        p1.age = -20;// 나이가 음수인 것은 이상하다. 하지만 -20이 들어오는 것을 막을 수 없다.
        p1.setAge(40);
        p1.printAge();
        System.out.println("제 나이는 "+p1.printAge()+" 입니다.");
    }
}

class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;
    private int age;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int printAge(){
        return age;
    }
    public void setAge(int age){
        if(age < 0){
            System.out.println("나이는 음수가 될 수 없습니다.");
        } this.age = age;
    }
}