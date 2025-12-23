package C07ExceptionFIleParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02ExceptionAdvance {
    public static void main(String[] args) {

//        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지시키기 위한 목적
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이메일 입력 ");
//        String email = sc.nextLine();
//        System.out.println("비밀번호 입력");
//        String password = sc.nextLine();
//        register(email,password);
//        System.out.println("DB에 저장되는 코드");

//        Checked exception의 처리방법
//        방법1. throws를 통해 checked예외처리를 위임받고,main에서도 throws
//        String text = fileRead("src/C07ExceptionFIleParsing/test.txt");
//        System.out.println(text);

//        방법2.throws를 통해 checked예외처리를 위임받고

//        try {
//            String text = fileRead("src/C07ExceptionFIleParsing/test.txt");
//            System.out.println(text);
//        } catch (IOException e) {
//            System.out.println("파일 처리 과정에서 에러가 발생");
//
//            e.printStackTrace();
//        }
//        방법3.Checked 예외를 try/catch하여 unchecked 예외 강제 발생(DB 롤백 목적)
//        try {
//            String text = fileRead("src/C07ExceptionFIleParsing/test.txt");
//            System.out.println(text);
//        } catch (RuntimeException e) {
//            System.out.println("파일 처리 과정에서 에러가 발생");
//            e.printStackTrace();
//        }


    }//--main



//    static String fileRead(String path) throws IOException {
//        Path filePath = Paths.get(path);
//        String text = Files.readString(filePath);
//        return text;
//    }
static String fileRead(String path) {
    Path filePath = Paths.get(path);
    String text = null;
    try {
        text = Files.readString(filePath);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return text;
}
    static boolean register(String email,String password){
        if (password.length()>= 10){
            return true;
        }
        else {
//            예외를 강제 발생시킴으로서 이시점에서 해당 메서드 종료
//
            throw new IllegalArgumentException("비밀번호가 너무 짧아요");
        }

    }
}
