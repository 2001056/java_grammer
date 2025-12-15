package C01Basic;

import java.util.*;

public class C11Map {
    public static void main(String[] args) {
//        map : key,value로 이루어진 자료구조
//        Map<String,Integer> sports = new HashMap<>();
////        특징 : 키는 중복이 없음,밸류는 가능
//        sports.put("농구",2);
//        sports.put("축구",3);
//        sports.put("배구",2);
//        sports.put("농구",3);

//        특징 : map key에는 순서가없음
//        System.out.println(sports);
////        특징 : map에서 key값을 통한 검색 복잡도는 O(1).
//        System.out.println(sports.get("배구"));

//        map의 전체 value 데이터 출력
//        map의 key값 접근시에는 인덱스 사용 불가능(순서가없음)
//        keySet() : map의 전체key목록을 반환하는 메서드

//        for (String a : sports.keySet()) {
//            System.out.println("Key : "+a+" valuse : "+sports.get(a));
//        }
//
////        values() : map의 전체 value목록을 반환하는 메서드 (잘 안쓰임)
//        for ( int a : sports.values()){
//            System.out.println(a);
//        }
//        Map<String,Integer> sports = new HashMap<>();
//        sports.put("축구",2);
//        sports.put("농구",3);
//        sports.put("배구",2);
//
////        remove : key를 통해 map 요소 삭제
//        sports.remove("축구");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//
//        sports.putIfAbsent("배구",10);
//        System.out.println(sports);
//        sports.put("배구",10);
//        System.out.println(sports);
//
////        containsKey : 키가 있으면 true 없으면 false
//        System.out.println(sports.containsKey("축구"));//false
//        Map<String,Integer> myMap = new HashMap<>();
////        map을 통한 개수 count
//        String[] arr = {"농구","축구","농구","야구","축구"};
//        for (String a : arr) {
////            if (myMap.containsKey(a)){
////                myMap.put(a, myMap.get(a)+1);
////            }else {
////                myMap.put(a,1);
////            }
////            getOrDefault(키값,초기값) : key값이 있으면 있는값 리턴 없을 경우 초기값 리턴
//            myMap.put(a,myMap.getOrDefault(a,0)+1);
//        }
////        System.out.println(myMap);
////        map의 value값 감소 로직
//        String[] arr2 = {"농구","농구","농구","야구","축구"};
//        for (String a : arr2 ) {
//
//            if (myMap.containsKey(a)) {
//                if (myMap.get(a) == 1) {
//                    myMap.remove(a);
//                } else {
//                    myMap.put(a, myMap.getOrDefault(a, 0) - 1);
//                }
//
//            }
//        }
//        System.out.println(myMap);
//
////        프로그래머스 : 완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        String answer = "";
//
//        Map<String,Integer> myMap1 = new HashMap<>();
//        for (String z : participant){
//            myMap1.put(z,myMap1.getOrDefault(z,0)+1);
//        }
//        for (String b : completion) {
//            if (myMap1.containsKey(b)) {
//                if (myMap1.get(b) == 1) {
//                    myMap1.remove(b);
//                } else {
//                    myMap1.put(b, myMap1.getOrDefault(b, 0) - 1);
//                }
//
//            }
//        }
//        for (String q : myMap1.keySet()){
//            answer = q;
//        }
//        System.out.println(answer);


//        프로그래머스 : 의상 다시풀기

//        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
//        Map<String,Integer> myMap = new HashMap<>();
//        int result = 1;
//        int answer =0;
//        for (int i = 0; i < clothes.length; i++) {
//            for (int j = 0; j < clothes[0].length; j++ ){
//                String type = clothes[i][1];
//                myMap.put(type, myMap.getOrDefault(type,0)+1);
//
//            }
//
//
//            }
//        for (int a : myMap.values()) {
//            result *= a+1;
//            answer = result-1;
//        }

//        가장 value 가 큰 key값 찾기
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//        String maxKey = "";
//        int max = Integer.MAX_VALUE;
//        for (String a : myMap.keySet()) {
//            int value = myMap.get(a);
//            if (max < value) {
//                max = value;
//                maxKey = a;
//            }
//        }
//          백준 : 베스트셀러
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        String[] arr = new String[n];
//        Map<String, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextLine();
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0) + 1);
//
//        }
//
//        String maxKey = "";
//
//        int max = Integer.MIN_VALUE;
//        for (String a : myMap.keySet()) {
//            int value = myMap.get(a);
//            if (max < value) {
//                max = value;
//                maxKey = a;
//
//            }
//            else if (max == value) {
//                if(a.compareTo(maxKey) < 0) {
//                    maxKey = a;
//                }
//            }
//        }
//
//        System.out.println(maxKey);

//        TreeMap : key를 정렬(오름차순) 하여 map 저장
//        Map<String, Integer> myMap = new TreeMap<>();//오름차순
//        Map<String, Integer> myMap = new TreeMap<>(Comparator.reverseOrder());//내림차순
//        myMap.put("hello5",1);
//        myMap.put("hello4",2);
//        myMap.put("hello3",3);
//        myMap.put("hello2",4);
//        myMap.put("hello1",5);
//        System.out.println(myMap);

//        백준 : 파일 정리

////        LinkedHashMap : 데이터의 삽입 순서 보장(입력시간 순 정렬)
//        Map<String, Integer> myMap = new LinkedHashMap<>();
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

//        iterator를 활용한 출력
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("야구", 2);
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        Iterator<String> iters = myMap.keySet().iterator();
//////        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
////        System.out.println(iters.next());
//////        hasNext 메서드는 iterator 안에 그 다음 값이 있는지 없는지 boolean 리턴
////        System.out.println(iters.hasNext());
//        while (iters.hasNext()){
//            System.out.println(iters.next());
//        }






    }
}


