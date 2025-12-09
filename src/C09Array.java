import java.util.Arrays;

public class C09Array {
    public static void main(String[] args) {
//        배열표현식1 배열 선언 후 값 할당 방식
//        java의 배열은 반드시 사전에 길이가 결정 되어야 함
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
////        int 배열의 경우 선언시 기본적으로 0으로 초기화. boolean은 false초기화, 참조자료형은 null로 초기화
//        arr1[1] = 20;
//        arr1[3] = 40;
//        arr1[4] = 50;
//
//
//
////        배열표현식2 리터럴방식
//        int[] arr2 = {10,20,30,40,50};
//
////        배열표현식3 명시적 배열 생성 방식
//        int[] arr2 = new int[]{10,20,30,40,50};
//
////        활용예시
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[]{10,20,30,40,50});

//        myList.add({10,20,30,40,50));//배열인지 아닌지 확인 불가

//        85,65,90으로 구성된 int 배열 선언 후 총합과 평균 구하기

//        int[] arr = {85,65,90};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double avg = (double) sum / 3;
//        System.out.println(sum);
//        System.out.println(avg);

//        배열의 최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
////        최대값을 구할때는 가장 작은 값을 설정;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }
//            if (min > arr[i]){
//                min = arr[i];
//            }
//
//        }
//        System.out.println("최대값 : " + max);
//        System.out.println("최소값 : " + min);

//        배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        배열뒤집기
        int[] arr = {10,20,30,40,50};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-(i+1)];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
