package C07ExceptionFIleParsing.MemberException;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자와 인터페이싱(입출력)하는 계층
public class MemberController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService ms = new MemberService();
        String input;
        while (true) {
            System.out.println("1번 : 회원가입, 2번 : 회원 상세조회,3번 : 회원목록조회,4번 : 로그인");
            input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("회원가입 서비스입니다");
                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                try {
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String password = sc.nextLine();
//                회원가입시 발생하는 예외를 적절히 try/catch 컨트롤러에서
                    ms.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    System.out.println("이미 가입된 이메일입니다.");
                    e.printStackTrace();
                }
            }
            else if (input.equals("2")) {
                System.out.println("회원상세조회 서비스입니다");
                System.out.println("회원 id값을 입력 해 주세요");
//               회원 상세 조회시 발생하는 예외를 적절히 try/catch
                try {
                    long id = Long.parseLong(sc.nextLine());
                    Member member = ms.findById(id);
                    System.out.println(member);
                } catch (NoSuchElementException e){
                    System.out.println("존재하지 않는 회원id입니다");
                    e.printStackTrace();
                }
            } else if (input.equals("3")) {
                System.out.println("회원목록조회 서비스입니다");
                List<Member> memberList = ms.findAll();
                System.out.println(memberList);
                if (memberList.size() == 0) {
                    System.out.println("회원이 없습니다");
                }

            } else if (input.equals("4")) {
                System.out.println("로그인 서비스입니다");
                try {
                    System.out.println("이메일을 입력해주세요");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요");
                    String password = sc.nextLine();
//                예외처리 : 예외 발생 시 , 예외의 원인 출력.
                    ms.login(email, password);
                    System.out.println("로그인 성공입니다.");
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
        }
    }//while
    }//main
}//class
