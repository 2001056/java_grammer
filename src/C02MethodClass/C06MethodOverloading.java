package C02MethodClass;

//java에서 같은이름의 메서드선언은 불가
//다만, 같은 이름의 메서드명을 사용하되, 매개변수의 개수 또는 배개변수의 타입이 달라지는 경우는 메서드 오버로딩

import java.util.ArrayList;
import java.util.List;

public class C06MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10.5,10.5));
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(0,20);
//        또다른 메서드 오버로딩 사례

    }
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a, int b , int c){
        return a+b+c;
    }
    public static double sum(double a , double b){
        return a+b;
    }
}
