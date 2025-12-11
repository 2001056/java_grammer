package C01Basic;

import java.io.IOException;

public class C09Array {
    public static void main(String[] args) throws IOException {
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
//        i);nt[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length-(i+1)];
//        }
//        System.out.println(Arrays.toString(newArr)

//        배열의 정렬
//        String[] stArr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(stArr); // 오름차순
//        System.out.println(Arrays.toString(stArr));
//        Arrays.sort(stArr, Comparator.reverseOrder());//내림차순정렬
//        System.out.println(Arrays.toString(stArr));


//        Arrays.sort(arr);
////        Arrays.sort(arr,Comparator.reverseOrder()); //원시자료형은 comparator사용 불가능
//        System.out.println(Arrays.toString(arr));
//        int[] arr = {17,12,20,10,15,13,16,30,23,53,65,37,754,45,242,637,2352,513,131,1,535,356,235,};
//        int min = Integer.MIN_VALUE;

//        방법 1
//        for(int i =0; i< arr.length;i++){
//            int min =arr[i];
//            int minIndex=i;
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[j]<min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
////                자리바꾸기 : i 와 index 자리 change
//            int temp = arr[i];
//            arr[i]=arr[minIndex];
//            arr[minIndex]=temp;
//        방법 2
//        int num = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (arr[i]>arr[j]) {
//                    num = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = num;
//                }
//            }
//
//
//
//        }
//        System.out.println(Arrays.toString(arr));


//       선택정렬 복잡도:  O(n^2). java 기본 내장 정렬함수의 복잡도 : O(n*log(n))


//        조합문제 : 모두 각기 다른 숫자 배열이 있을 때 만들어 질 수 있는 두 숫자의 조합을 출력
//        10,20, 10,30 , 10,40 , 10,50 20,30
//        int[] arr = { 10,20,30,40,50};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                System.out.println(arr[i]+","+arr[j]);
//
//            }
//        }


//        배열의 중복제거 : set 자료구조(중복x,순서X)활용
//        int[] arr = {10,30,20,30,10,40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : arr){
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

//        프로그래머스 - 두 개 뽑아서 더하기(조합+중복제거)

//        int[] numbers = {2,1,3,4,1};
//        int[] result =  new int[numbers.length*(numbers.length-1)/2];
//        int index = 0;
//        Arrays.sort(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//
//                    result[index] = (numbers[i] + numbers[j]);
//                    index++;
//
//
//            }
//
//        }
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : result){
//            mySet.add(a);
//        }
//        int[] answer = new int[mySet.size()];
//        index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//
//        }


//        배열의 검색 : 복잡도 0(n)
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        target이 몇번째 index에 있는지 출력
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                index = i;
//            }
//        }
//        이분탐색(이진검색) - binary search, 복잡도 log(n)
//        사전에 데이터가 오름차순 정렬 돼 있는 경우에만, 이분탐색 가능.
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        int index = Arrays.binarySearch(arr,target);
////        찾고자 하는 값이 있으면 해당 index return
////        찾고자 하는 값이 없으면 음수값 리턴
//        int index2 = Arrays.binarySearch(arr,13);
//        System.out.println(index);
//        System.out.println(index2);

//        백준 수 찾기 1920

//        내가 푼 방식

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        sc.nextLine();
//        int[] arr = new int[a];
//        String[] parts = sc.nextLine().split(" ");
//
//        for (int i = 0; i < a; i++) {
//            arr[i] = Integer.parseInt(parts[i]);
//        }
//        Arrays.sort(arr);
//        int b = sc.nextInt();
//        sc.nextLine();
//        int[] answer = new int[b];
//        String[] parts1 = sc.nextLine().split(" ");
//
//        for (int i = 0; i < b; i++) {
//            answer[i] = Integer.parseInt(parts1[i]);
//        }
//        Arrays.sort(answer);
//        for (int i = 0; i < answer.length; i++) {
//            int index = Arrays.binarySearch(arr,answer[i]);
//            if (index >= 0){
//                System.out.println(1);
//            }else {
//                System.out.println(0);
//            }
//        }

//        강사님이 푼 방식
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        String[] stArr1 = br.readLine().split(" ");
//        int[] arr1 = new int[stArr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = Integer.parseInt(stArr1[i]);
//
//        }
//        int M = Integer.parseInt(br.readLine());
//        String[] stArr2 = br.readLine().split(" ");
//        int[] arr2 = new int[stArr2.length];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = Integer.parseInt(stArr2[i]);
//
//        }
//        Arrays.sort(arr1);
//        for (int i = 0; i < arr2.length; i++) {
//            int index = Arrays.binarySearch(arr1,arr2[i]);
//            if (index >= 0){
//                System.out.println(1);
//            }
//            else{
//                System.out.println(0);
//            }
//        }

//        배열값 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2); // false
//        System.out.println(Arrays.equals(arr1,arr2));// true 잘 안씀


//        배열 복사
//        Arrays.copyOf(배열명,length), Arrays.copyOfRange(배열명,start,end)
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr,4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr,3,6);
//        System.out.println(Arrays.toString(arr2));

//
//        String[] arr = new String[5];
//
////        Arrays.fill : 배열의 모든값을 변경(채우기)
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");

//        2차원 배열의 선언과 값 할당
//        방법1. 선언 후 할당 방식
//        int[][] arr1 = new int[3][2];
//        arr1[0][0]= 1;
//        arr1[0][1]= 2;
//        arr1[1][0]= 1;
//        arr1[1][1]= 2;
//        arr1[2][0]= 1;
//        arr1[2][1]= 2;
//
//
//
////        방법2. 리터럴 방식
//        int[][] arr2 = {{1,2},{1,2},{1,2}};


//        [3][4] 사이즈의 2차원 배열을 선언하고, 1~12까지 숫자값을 각 배열에 순차적으로 할당
//        int n = 1;
//        int[][] arr = new int[3][4];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = n;
//                n++;
//            }
//        }
//        2차원 배열의 출력 : Arrays.deepToString(arr)
//        System.out.println(arr); //2차원 배열의 heap 주소값
//        System.out.println(Arrays.toString(arr)); //1차원 배열의 heap 주소값
//        System.out.println(Arrays.deepToString(arr)); // 각 1차원 배열의 값 출력

//        프로그래머스 - 행렬의 덧셈
//        int[][] arr1 = {{1,2},{2,3}};
//        int[][] arr2 = {{3,4},{5,6}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));
//        프로그래머스 - K번째 수
//        copyoflength 사용 하고 sort사용하고

//        int[] array = {1,5,2,6,3,7,4};
//        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
//        int[] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//                int start = commands[i][0]-1;
//                int end = commands[i][1];
//                int[] arr = Arrays.copyOfRange(array,start,end);
//                Arrays.sort(arr);
//                int z = commands[i][2]-1;
//                answer[i] = arr[z];
//
//            }
//
//
//

//        가변배열 : 2차워 배열에서 각 1차원의 배열의 길이가 서로 다를 수 있는 배열의 구조
        int[][] arr1 ={{1,2},{1,2,3},{1,2,3,4}};

//        배열 전체길이는 반드시 사전할당 되어야 하지만, 1차원 배열의 길이는 추후 할당가능
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];


    }
}

