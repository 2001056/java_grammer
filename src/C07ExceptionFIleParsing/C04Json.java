package C07ExceptionFIleParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class C04Json {
    public static void main(String[] args) throws IOException {
//        외부의 json 파일을 java의 클래스(객체) 로 변환 : json파싱(역직렬화)
//        Path filePath = Paths.get("src/C07ExceptionFIleParsing/myjson1.json");
//        readString : 문자열 통째로
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);

//      Jackson라이브러리의 (spring에는 기본적으로 탑재. java에서는 별로추가) ObjectMapper클래스를 통한 객체로 파싱

//        ObjectMapper o1 = new ObjectMapper();
//        Map으로 일괄적으로 String,String으로 파싱
//        Map<String,String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap);
//        System.out.println(myMap.get("name"));
//        내가 직접 만든 객체로 파싱
//        Student myStudent = o1.readValue(st1,Student.class);
//        System.out.println(myStudent);
//        System.out.println(myStudent.getName());
//        System.out.println(myStudent.getId());


//        List 형식으로 주어지는 json 파싱 : 트리 구조의 JsonNode로 변환
//        Path filePath = Paths.get("src/C07ExceptionFIleParsing/myjson2.json");
//        String st1 = Files.readString(filePath);
//        ObjectMapper o1 = new ObjectMapper();
////        System.out.println(st1);
//        JsonNode jsonNodes = o1.readTree(st1);
//        List<Student> studentList = new ArrayList<>();
//        for (JsonNode j : jsonNodes){
//            Student s1 = o1.readValue(j.toString(), Student.class);
//            studentList.add(s1);
//        }
//        System.out.println(studentList);

//        json 직렬화 : 객체 -> json.
//        ObjectMapper o1 = new ObjectMapper();
//        Student s1 = new Student(1,"hong1","1","seoul");
//        String result = o1.writeValueAsString(s1);
//        System.out.println(s1);
//        System.out.println(result);
//
    }
}

// 실제 값의 setting은 private 변수이므로 직접 접근 불가
// java의 reflaction 기술을 통해 런타임 시점에 private변수도 직접 접근 가능
// 다만, 필드값을 유추할 수 있도록  (getter+기본생성자) 메서드를 생성해야함.
class Student{
    private long id;
    private String name;
    private String classNumber;
    private String city;

    public Student(long id, String name, String classNumber, String city) {
        this.id = id;
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;
    }
    public Student(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
