package C01Basic;

import java.util.HashMap;
import java.util.Map;

public class C11Map {
    public static void main(String[] args) {
//        map : key,value로 이루어진 자료구조
        Map<String,Integer> sports = new HashMap<>();
//        특징 : 키는 중복이 없음,밸류는 가능
        sports.put("농구",2);
        sports.put("축구",3);
        sports.put("배구",2);
        sports.put("농구",3);

//        특징 : map key에는 순서가없음
        System.out.println(sports);
//        특징 : map에서 key값을 통한 검색 복잡도는 O(1).
        System.out.println(sports.get("배구"));

//
    }
}
