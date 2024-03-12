package week1.Array;

import org.w3c.dom.ls.LSOutput;

public class ArrayExam {
    public static void main(String[] args) {

//    // 문제1 : arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
//    int[] array1 = {10,20,30,40,50,60,70,80,90,100};
//
//    for (int i = 0; i < array1.length ; i++){
//        System.out.println(array1[i]);
//    }
//
//    // 문제2 : 배열의 모든 요소를 세번 출력해주세요.
//    int[] arr = {1,2,3,4,5};
//    for (int j = 0; j < 3; j++){
//    for (int i = 0; i < arr.length; i++){
//        System.out.println(array1[i]);
//            }
//        }
    // 문제3 : 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
//    int[] arr3 = {10,20,30,40,50};
//    for(int i = arr3.length-1; i >= 0; i--){
//        System.out.print(arr3[i]+"\n");
//        }

    // 문제4 : 배열 안의 숫자들의 합을 구해주세요.
    /*
	// 아래 4줄은 위 1줄과 같은 의미 입니다.
	int[] arr = new int[5];
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
		*/

    // 배열이라고 무조건 배열끼리 더할 필요는 없다.
        int sum = 0;
        int[] arr4 = {10, 20, 30, 40, 50};
            for(int i = 0; i < arr4.length; i++){
            sum += arr4[i];
        } System.out.println(sum);
    }
}