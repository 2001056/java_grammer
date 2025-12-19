package C04Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Dog d1 = new C01Dog();
        C01Cat c1 = new C01Cat();

        d1.makeSound();
        c1.makeSound();

//        인터페이스 특징 1. 다형성 : 하나의 부모타입으로 여러자식객체를 다룰 수 있음 .
        C01AnimalInterface1 d2 = new C01Dog();
        C01AnimalInterface1 c2 = new C01Cat();

        d2.makeSound();
        c2.makeSound();

//        다형성의 장점 : 기존의 구현체(ex-ArrayList) 를 다른 구현체(ex-LinkedList)로 변경시 용이.

//        List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.get(0);

//        인터페이스 특징 2 - 다중구현(상속)
        C01AnimalInterface1 c3 = new C01Cat();
        c3.makeSound();
        String a = "츄르";
        C01AnimalInterface2 c4 = new C01Cat();
        c4.eat(a);
//        다중 구현의 예시 - List 와 queue
        List<Integer> myList1 = new LinkedList<>();
//        myList.get(0); //사용가능
        Queue<Integer> myList2 = new LinkedList<>();
//        myList.get(0); //사용불가



    }
}
