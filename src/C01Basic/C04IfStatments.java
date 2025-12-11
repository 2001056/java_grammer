package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C04IfStatments {
    public static void main(String[] args) throws IOException {
//        도어락키 예제
//        String answer = "1234";
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        if (answer.equals(input)){
//            System.out.println("문이열립니다");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다");
//        }

//        교통카드 예제
//        System.out.println("현재 가지고 있는 돈은 얼마인가요?");
//        사용자가 가지고 있는 돈을 int로 입력받는다.
//        만원 이상이면 택시틀 타시오 출력
//        만원 미만 3000원 이상이면 버스를 타시오 출력
//        3000원 미만이면 걸어가시오 출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int input = Integer.parseInt(br.readLine());
//        if,else if 구문에서 조건식은 택1. 즉, 한조건에 해당하면 실행 후 구문밖으로 빠져나감
//        if (input >= 10000){
//            System.out.println("택시를 타시오");
//        }else if (input >= 3000){
//            System.out.println("버스를 타시오");
//        }else {
//            System.out.println("걸어가시오");
//        }
//        if 문을 독립적으로 따로 두고 싶은 경우에는 정확한 범위 지정을 통해 모든 if문이 중복되어 실행되지 않도록 해야함.
//        if (input >= 10000){
//            System.out.println("택시를 타시오");
//        }if (input >= 3000 && input < 10000){
//            System.out.println("버스를 타시오");
//        }if (input < 3000){
//            System.out.println("걸어가시오");

//        삼항 연산자
//        String answer = "1234";
//        System.out.println("비밀번호 입력");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        String result = answer.equals(input) ? "문이 열립니다":"비밀번호가 틀렸습니다";
//        System.out.println(result);

//        switch문 : if,else if, else if 등 여러 조건식이 있을때 조건문을 가독성 있게 표현한 구문
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
//        input과 case의 값들은 equal 관계이고, 구문마다 반드시 break를 넣어줘야함
//        default는 그외의 의미로서 else와 같은 의미.
        switch (input) {
            case 1:
                System.out.println("대출업무입니다");
                break;
            case 2:
                System.out.println("예금업무입니다");
                break;
            case 3:
                System.out.println("적금업무입니다");
                break;
            default:
                System.out.println("잘못 된 입력입니다");
                break;
        }
    }
}
