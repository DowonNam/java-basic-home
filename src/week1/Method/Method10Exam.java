package week1.Method;

public class Method10Exam {
    public static void main(String[] args) {
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

    }


    //    public static boolean isEven(int n){
//        for(int i = 2; i <= n; i+=2){
//            System.out.print(i + " ");
//        } System.out.println();
//        return n;
//    }
//
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public static void printEven(int n) {
//        for (int i = 1; i <= n; i++) {
//           if(isEven(i)){
//               System.out.print(i);;
//           } else {
//               System.out.print(" ");;
//           }
//        }System.out.println();
//    }
    public static void printEven(int n){
        for (int i = 1; i <= n; i++) {
            boolean b = isEven(i);
            if(b){
                System.out.print(i + " ");
            }
        }System.out.println("");
    }
}