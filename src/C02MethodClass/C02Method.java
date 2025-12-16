package C02MethodClass;

public class C02Method {
    public static void main(String[] args) {
//        for문을 활용하여 1~20 까지 total값 구하기
//        int total = 0;
//        for (int i = 0; i < 10; i++) {
//            total += i;
//
//
//        }
//        System.out.println(total);
//        //        for문을 활용하여 1~20 까지 total값 구하기
//        int total2 = 0;
//        for (int i = 10; i < 20; i++) {
//            total2 += i;
//
//
//        }
//        System.out.println(total2);

//        위 코드의 중복이 지속적으로 발생된다면, 반복을 피하기 위해 코드의 기능을 모듈(메서드)화 하여 별도로 분리
        System.out.println(C02Method.getTotal(30,40));

    }
//    접근제어자(public), 클래스메서드(static)/객체메서드(static X)
        public static int getTotal (int start,int end) {
            int total = 0;
        for (int i = start; i < end; i++) {
            total += i;


        }

            return 0;
        }
    }
