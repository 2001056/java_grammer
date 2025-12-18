package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

//이해가 안된다////////////////////////////////////////////////////////////////////////////////////어렵다

//재귀함수 기본 호출 원리와 과정
public class C11ReculsiveBasicFlow {
    public static void main(String[] args) {
//        recur0(0,3);
//        recur1(0,3);
        recur2(new ArrayList<>(),0,3);
    }
//    기본 자료형 변수의 재귀 함수내 변화과정(매개변수로 넘기는 시점에 값 변경)
    public static void recur0(int count, int target){
        if (count == target)
            return;
        System.out.println("재귀 호출 전 count : " + count); //0 첫번째 - 1두번째 -2세번째
        recur0(count+1,target);
        System.out.println("재귀 호출 후 count : " + count);// 2네번째 - 1다섯번째 -0여섯번째

    }
//        기본 자료형 변수의 재귀 함수내 변화과정(함수내에서 값 변경)
    public static void recur1(int count, int target){
        if (count == target)
            return;
        System.out.println("재귀 호출 전 count : " + count); //0 1 2
        count +=1;
        recur1(count,target);
        System.out.println("재귀 호출 후 count : " + count);//2 2 2 XX 오답 // 3 2 1

    }
//    객체를 매개변수로 활용 한 재귀함수 내 변화 과정 : 객체는 힙메모리를 통해 원복 객체가 변경되므로, 재귀 함수 간에도 값의 변화를 공유
    public static void recur2(List<Integer> myList, int count, int target){
        if (count == target)
            return;
        myList.add(count);
        recur2(myList,count+1,target);
        System.out.println(myList); //0,1,2 0,1,2 0,1,2 OO 정답 근데 왜 이렇게 생각한지는 모름 걍 느낌
        myList.remove(myList.size()-1);

    }
}
