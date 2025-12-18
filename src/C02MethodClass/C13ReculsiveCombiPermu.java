package C02MethodClass;


import java.util.ArrayList;
import java.util.List;

//재귀함수 활용 대표적인 알고리즘 예시 : 백트래킹, dfs알고리즘에서 주로 사용 (또는 분할 정복)
//대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기
public class C13ReculsiveCombiPermu {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world");
//            for (int j = 0; j < 3; j++) {
//                System.out.println("hello world");
//
//            }
//        }
//        위 반복문의 반복횟수(개수)는 동적으로 결정되지 않고, 정적으로 코딩할 수 밖에 없는 한계가 존재
//        recurFor(0,2);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자 조합을 출력
//
//        List<List<Integer>> myList1 = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = i+1; j < myList.size(); j++) {
//                List<Integer> m1 = new ArrayList<>();
//                m1.add(myList.get(i));
//                m1.add(myList.get(j));
//                myList1.add(m1);
//            }
//
//        } System.out.println(myList1);

//        재귀함수를 만들기 위한 for문을 변형
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);


//        List<List<Integer>> doubleList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visitied = new boolean[myList.size()];
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            visitied[i]= true;
//            for (int j = 0; j < myList.size(); j++) {
//                if (visitied[j]) continue;
//                temp.add(myList.get(j));
//                visitied[j]=true;
//                doubleList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//                visitied[j]=false;
//            }
//            visitied[i]=false;
//            temp.remove(temp.size()-1);
//        } System.out.println(doubleList);



        List<List<Integer>> doubleList = new ArrayList<>();
        boolean[] visitied = new boolean[myList.size()];
        permu(myList,2,doubleList,new ArrayList<>(),visitied);
        System.out.println(doubleList);
    }
//    되면안되는데 되고있는 코드
//    public static void combi(List<Integer> myList,int n, List<List<Integer>> doubleList,List<Integer> temp,int x){
//        if (temp.size()==n) {
//            doubleList.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = x; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            combi(myList,n,doubleList,temp,++x);
//            temp.remove(temp.size()-1);
//
//        }
//    }
public static void permu(List<Integer> myList,int n, List<List<Integer>> doubleList,List<Integer> temp,boolean[] visitied){
    if (temp.size()==n) {
        doubleList.add(new ArrayList<>(temp));
        return;
    }

    for (int i = 0; i < myList.size(); i++) {
        if (visitied[i]) continue;
        visitied[i]= true;
        temp.add(myList.get(i));
        permu(myList,n,doubleList,temp,visitied);
        temp.remove(temp.size()-1);
        visitied[i] = false;

    }
}
//public static void combi(List<Integer> myList,int start,int n, List<List<Integer>> doubleList,List<Integer> temp){
//    if (temp.size()==n) {
//        doubleList.add(new ArrayList<>(temp));
//        return;
//    }
//    for (int i = start; i < myList.size(); i++) {
//        temp.add(myList.get(i));
//        combi(myList,i+1,n,doubleList,temp);
//        temp.remove(temp.size()-1);
//
//    }
//}
    public static void recurFor(int start,int end){

        if (start == end) {
            System.out.println("hello world");
            return;
        }

        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world"); 이렇게 실행하면 3 + 3^2 + 3^3 이 되버림 3^n 형식이 아님
            recurFor(start+1,end);
        }
    }public static void recurFor1(int start,int end){

        if (start == end) {
            return;
        }

        for (int i = 0; i < 3; i++) {
//            System.out.println("hello world"); 이렇게 실행하면 3 + 3^2 + 3^3 이 되버림 3^n 형식이 아님
            recurFor(start+1,end);

        }
    }
}
