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



    }
}
