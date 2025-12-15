package C01Basic;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C12Set {
    public static void main(String[] args) {
//        set의 특성 : 중복이없고, 순서보장도없다, 성능 O(1)
        Set<String> mySet = new HashSet<>();
        mySet.add("야구");
        mySet.add("농구");
        mySet.add("야구");
        mySet.add("축구");
        System.out.println(mySet);
        System.out.println(mySet.contains("축구"));// 복잡도O(1)

//        수 찾기 문제 1920 다시 풀어보기

//        TreeSet : 데이터를 오름차순 정렬
        Set<String> mySet2 = new TreeSet<>();
        Set<String> mySet3 = new TreeSet<>(Comparator.reverseOrder());
        mySet2.add("야구");
        mySet2.add("농구");
        mySet2.add("야구");
        mySet2.add("축구");
        System.out.println(mySet2);
        mySet3.add("야구");
        mySet3.add("농구");
        mySet3.add("야구");
        mySet3.add("축구");
        System.out.println(mySet3);

//        백준 : 숫자 카드 10815
//        프로그래머스 : 폰켓몬 **
//        집합관련함수: 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
//        Set<String> s1 = new HashSet<>();
//        s1.add("java");
//        s1.add("python");
//        s1.add("c++");
//        Set<String> s2 = new HashSet<>();
//        s2.add("java");
//        s2.add("html");
//        s2.add("css");
////        s1.retainAll(s2); // s1에는 교집합인 java만 남음
////        System.out.println(s1);
////        s1.addAll(s2); // s1에는 합집합인 java, python, c++, html, css가 남음
////        System.out.println(s1);
//        s1.removeAll(s2); // s1에는 차집합인 python, c++이 남음.
//        System.out.println(s1);
//



    }
}