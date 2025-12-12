package C01Basic;

import java.util.HashMap;
import java.util.Map;

public class C11Map {
    public static void main(String[] args) {
//        map : key,value로 이루어진 자료구조
        Map<String,Integer> sports = new HashMap<>();
        sports.put("농구",2);
        sports.put("축구",3);
        sports.put("배구",2);
        System.out.println(sports);

    }
}
