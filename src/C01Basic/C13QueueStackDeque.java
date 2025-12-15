package C01Basic;

import java.io.IOException;
import java.io.PipedReader;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) throws IOException {
        // Queue 인터페이스를 LinkedList를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        int value = myQue.poll();
//        System.out.println(value); // 첫 node 소모 및 반환 => 10
//            // poll : 큐에서 가장 앞 데이터를 삭제하면서, 동시에 return하는 메서드
//        System.out.println(myQue); // node 리스트에 첫 node가 바뀌어 있음 => 20, 30
//        int value2 = myQue.peek();
//            // peek : 큐에서 가장 앞 데이터를 삭제하지 않고 return하는 메서드
//        System.out.println(value2); // 20
//        System.out.println(myQue); // node들이 그대로 => 20, 30

        // while문을 통한 queue 출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
//        // 큐는 일반적으로 while문을 통해 요소를 소모
//        while(!printerQueue.isEmpty()){
//            System.out.println(printerQueue.poll());
//        }
//            // while(true) 상태로 poll 하면 null이 계속 출력됨
//        // for문은 직관적이지 않다. queue.size()는 계속 바뀌니까
//        for(int i = 0; i < printerQueue.size(); i++){
//            System.out.println(printerQueue.poll());
//        }
        // size를 변수에 넣어서 저장 후 실행하면 보다 직관적이나 while문이 일반적

        // LinkedList와 ArrayList 성능차이 비교
        // ArrayList
        // 장점 : 조회 성능 빠름
        // 단점 : 중간 삽입/삭제 성능 저하
        // LinkedList
        // 장점 : 중간 삽입/삭제 성능 빠름
        // 단점 : 조회 성능 저하
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//            // 왼쪽은 Queue 든 LinkedList 든 본질은 오른쪽 (LinkedList)
//
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 1000000; i++){
//            myLinkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        long duration = endTime - startTime;
//        System.out.println("linkedList에 중간에 값 add 시에 소요시간: " + duration);
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        startTime = System.currentTimeMillis();
//        for(int i = 0; i < 1000000; i++){
//            myArrayList.add(0,i);
//        }
//        endTime = System.currentTimeMillis();
//        duration = endTime - startTime;
//        System.out.println("arrayList에 중간에 값 add 시에 소요시간: " + duration);

        // 관련 문제 : 백준 : 카드2, 요세푸스 문제 0

        // 길이 제한 큐 (잘 안쓰임)
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); // 길이 초과 시 에러 발생
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 제한된 길이까지만 add. 에러 발생 X
//        System.out.println(blockingQueue);

        // 우선 순위 큐 : 데이터를 poll 할 때 정렬된 데이터 결과값 (최소값/최대값) 보장
        // 지속적으로 데이터가 추가/제거되면서 전체 데이터가 실시간으로 변경되는 상황에 사용.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while(!pq.isEmpty()){
        // poll 할 때 마다 최소값을 추출 O   => 복잡도 log(n)
        // peek은 최솟값을 확인만 하고 추출 X => 복잡도 log(n)
        // 전체 데이터를 모두 poll하면 복잡도 => n*log(n)
//            System.out.println(pq.poll());
//        }
        // 백준 : 최소힙
        // 프로그래머스 : 더 맵게
        // list 사용시 복잡도가 N^2 * log(n)이 됨

        // 최대힙 : poll 할 때 마다 최댓값을 추출
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        // 최대값을 poll


        // Stack : 후입선출(LIFO)의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); // 마지막에 입력한 값을 꺼내는 것
//        System.out.println(myStack.peek()); // 마지막에 입력한 값 확인
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());

////      프로그래머스 : 올바른 괄호
////        String s = "(())()";
//        boolean answer = true;
//        Stack<Character> myStack = new Stack<>();
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '('){
//                myStack.add('(');
//            } else if(s.charAt(i) == ')' && myStack.isEmpty()){
//                answer = false;
//                break;
//            } else if(s.charAt(i) == ')'){
//                myStack.pop();
//            }
//        }
//        if(!myStack.isEmpty() && answer == true){
//            answer = false;
//        }
//        System.out.println(answer);

////      프로그래머스 : 같은 숫자는 싫어
//        int[] arr = {1,1,3,3,0,1,1};
//
//        Stack<Integer> myStack = new Stack<>();
//        myStack.add(arr[0]);
//        for(int i = 1; i < arr.length; i++){
//            if(arr[i - 1] != arr[i]){
//                myStack.add(arr[i]);
//            }
//        }
//        int[] answer = new int[myStack.size()];
//        int i = myStack.size() -1;
//        while (!myStack.isEmpty()){
//            answer[i] = myStack.pop();
//            i--;
//        }
//        System.out.println(answer);


//        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addLast(10);
//        myDeque.addLast(20);
//        myDeque.addFirst(30); // 30, 10, 20
//        System.out.println(myDeque.pollLast()); // 20
//        System.out.println(myDeque.pollFirst()); // 30
//        System.out.println(myDeque.peekFirst());

    }
}
