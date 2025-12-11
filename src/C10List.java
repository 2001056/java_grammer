import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10List {
    public static void main(String[] args) {
//        List 선언 방법1
        ArrayList<String> myList1 = new ArrayList<String>();
        ArrayList<String> myList2 = new ArrayList<>();

//        List 선언방법 2: 가장 일반적인 방법
        List<String> myList3 = new ArrayList<>();

//        초기값 세팅 방법1. 개별 data add
        myList3.add("java");
        myList3.add("python");
        myList3.add("C++");
        System.out.println(myList3);

//        초기값 세팅 방법2. 배열을 리스트로 변환

        String[] arr = {"java","python","C++"};
        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(myList4);

//        List의 안의 자료타입으로는 기본형타입은 쓸 수 없음.
        int[] intArr = {10,20,30};
        List<Integer> myList5 = new ArrayList<>();
        for (int i : intArr){
            myList5.add(i);
        }
        System.out.println(myList5);




    }
}
