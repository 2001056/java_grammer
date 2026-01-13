package C07ExceptionFIleParsing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C03File {
    public static void main(String[] args) throws IOException {
//        콘솔창에 키보드를 통한 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

//        파일에서 읽기 : IO패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFIleParsing/test.txt"));
//        String line = br2.readLine();
//        while (line != null){
//            System.out.println(line);
//            line= br2.readLine();

//        파일에서 읽기 : NIO패키지
//        }
//        Path filePath = Paths.get("src/C07ExceptionFIleParsing/test.txt");
////        readString : 문자열 통째로
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);

//        readAllLines : 문자열을 라인별로 split하여
//        List<String> st2 = Files.readAllLines(filePath);
//        System.out.println(st2);

//        파일에 문자열 쓰기
        Path filePath = Paths.get("src/C07ExceptionFIleParsing/test.txt");
//        Files.write(filePath,"홍길동0".getBytes(), StandardOpenOption.CREATE_NEW); // 생성
        Files.write(filePath,"홍길동1\n".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
        Files.write(filePath,"홍길동1\n".getBytes(), StandardOpenOption.APPEND); // 더하기
    }
}