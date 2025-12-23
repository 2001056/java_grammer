package C05AnonymousLambda;

import javax.xml.namespace.QName;
import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        java에서든 비교를 위한 인터페이스 대포적으로 2개 제공
//        Comparator인터페이스 :  인터페이스내 compareTo메서드만 존재
//        Comparable인터페이스 : 인터페이스 내 compare메서드만 존재

//        List<Integer> myList = new ArrayList<>();
//        myList.add(20);
//        myList.add(10);
//        myList.add(30);
////        java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구.
//        myList.sort(Comparator.naturalOrder());
////        o1과 o2의 숫자값을 마이너스 형식으로 코딩을 하되, o1이 먼저있으면 오름차순.o2가 먼저잇으면 내림차순.
//        myList.sort((o1, o2) -> o1-o2);
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("c++");
//
////        기본적인 문자열 정렬 일 때에는 Comparator커스텀을 하지 않고,
////        복잡한 자신만의 정렬 기준을 가지고 정렬 해야 할 때 Comparator익명객체 생성
//        Collections.sort(myList2, (o1, o2) -> o1.compareTo(o2));
//        System.out.println(myList2);
//
//
////        배열,리스트 정렬 외에 java의 그외 정렬 자료구조
//        Queue<String> pq = new PriorityQueue<>();
//
//        Set<String> treeset = new TreeSet<>();

//       리스트 안의 배열 정렬
//        [{4,5}, {1,2}, {5,0}, {3,1}]


//        리스트안의 배열에 1번째 index를 기준으로 오름차순 정렬
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[]{4,5});
//        list.add(new int[]{1,2});
//        list.add(new int[]{5,0});
//        list.add(new int[]{3,1});
//
//
////        리스트안의 배열에 1번째 index기준으로 오름차순 정렬
//        list.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
//        for (int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }

//        직접만든객체정렬
//        방법1. Comparator를 구현한 익명객체 방식
        List<Student> students = new ArrayList<>();
        students.add(new Student("hong1",20));
        students.add(new Student("hong2",40));
        students.add(new Student("hong3",30));
        students.add(new Student("hong4",50));
        students.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(students);

//        방법2. Comparable를 구현한 방식
//        Student 객체 안에 Comparable을 implements하는방식
//        sort실행시 자동으로 Student안의 compareTo메서드 호출
        Collections.sort(students);
    }
}
class Student implements Comparable<Student>{
//class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
//    this가 앞에 있으면 오름차순, 매개변수 객체가 앞에있으면 내림차순
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
