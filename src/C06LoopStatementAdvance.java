import com.sun.source.tree.EnhancedForLoopTree;

import java.util.Arrays;
import java.util.Scanner;

public class C06LoopStatementAdvance {
    public static void main(String[] args) {
//        1~20까지 수 중에 짝수의 총합 출력

//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            if (i%2==0){
//                sum+=i;
//            }
//
//        }
//        System.out.println(sum);

//        두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int c = 0;
//        int min = a>b?b:a; //Math.min(a,b)
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                c = i;
//            }
//
//        }
//        for (int i = min; i > 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                c = i;
//                break;
//            }

//    }
//        System.out.println(c);

//        소수인지 여부 판별. 소수란 1보다큰 수 중 1과 자신을 제외한 숫자로 나누어지지 않는 수

//        Scanner sc = new Scanner(System.in);
//        int num = Integer.parseInt(sc.nextLine());
//        String result = "소수입니다";
//        if(num==1){
//            result = "소수가 아닙니다";
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num%i==0){
//                result = "소수가아닙니다";
//                break;
//            }
//        }
//        System.out.println(result);

//        int[] arr = {1,3,5,7};
//        일반 for문을 통한 배열접근 방식
//        for (int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

//        향상된 for문(enhanced for문,for each문)을 통한 배열 접근 방식
//        for (int a:arr){
//            System.out.println(a);
//        }
//

//        일반 for문을 통한 arr에 저장 된 값 변경

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] +=10;
//        }

//        참조형변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
//        그래서, 내장된 메서드를 통해 힙메모리안의 객체값을 보기좋게 출력 할 수 있음.
//        System.out.println(Arrays.toString(arr));
//

//        향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가.
//        for (int a : arr) {
//            a +=10;
//        }

//        자바 변수의 유효 범위 : {}
//        int num1 = 10;
//        if(true){
//            num1 = 20;
//            int num2 = 30;
//        }
////         하위 영역의 블록(중괄호)에서 정의 된 변수는 상위 블록에서는 접근 불가
//
//        num2 = 40;


//        for문은 사용했던 변수명을 for문이 끝난 이후에 또다른 for문에서 재선언이 가능.
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);

//        }

//        다중  for문
//        2~9단까지 모든 구구단 한꺼번에 출력.
//        2단입니다. 출력 2X1=2 2X2=4....
//        3단입니다. 출력 3X1=2 3X2=4....
        int a = 2;
        for (int i = 2; i < 10; i++) {
            System.out.println(a+"단 입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(a+"X"+j+"="+a*j);

            }
            a++;

        }

//        라벨문 : 반복문에 이름을 붙이는 것.
        loop1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (true){
//                    원하는 for문을 라벨링을 통해 break또는 continue 시킬 수 있음 
                    break loop1;
                }
            }
        }

    }

}
