package C02MethodClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
        <게시판서비스>
        1.계좌객체 : Author, Post
        2.자료구조 : List(authorList, postList)
        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
            3-2.회원 전체 목록 조회 : id, email
            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
            3-5.게시물 목록 조회 : id(post), title
            3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
     */
public class C10BoardService {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList =new ArrayList<>();
//        post.getAuthor.getName();
        while (true){
            System.out.println("1번 : 회원가입 " +
                    "2번 : 회원목록조회 " +
                    "3번 : 회원상세조회 " +
                    "4번 : 게시글작성 " +
                    "5번 : 게시물목록조회 " +
                    "6번 : 게시물상세조회 0번 :종료");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number==1){
                System.out.println("회원가입서비스입니다");
                System.out.println("이름 이메일 비밀번호를 순서대로 입력하세요");
                String name = sc.next();
                String email = sc.next();
                String password = sc.next();
                Author a = new Author(name,email,password);
                authorList.add(a);
                System.out.println("회원가입 완료 됐습니다.");
            }else if (number==2) {
                System.out.println("회원목록조회서비스입니다");
                System.out.println(authorList);
            }
            else if (number==3) {
                System.out.println("회원 상세 조회입니다");
                System.out.println("회원 아이디를 입력해주세요");
                int id = sc.nextInt();
                boolean found = false;
                for (Author author :authorList) {
                    if (author.getId() == id) {
                        System.out.println(author.alist(id));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 id의 회원이 존재하지 않습니다.");
                }
            }else if (number==4){
                System.out.println("게시글작성서비스입니다");
                System.out.println("글제목 글내용 작성자이메일 입력");
                String title = sc.next();
                String contents = sc.next();
                String email = sc.next();
                Author writer = null;
                for (Author author : authorList) {
                    if (author.getAuthorEmail().equals(email)) {
                        writer = author;
                        break;
                    }
                }
                if (writer == null) {
                    System.out.println("해당 이메일의 회원이 존재하지 않습니다. 게시글 작성 실패");
                    continue;
                }
                Post p = new Post(title, contents, writer);
                postList.add(p);
                writer.getPostList().add(p);

                System.out.println("게시글 작성 완료");

            }else if (number==5){
                System.out.println("게시물목록조회서비스입니다");
                System.out.println(postList);

            }else if (number==6){
                System.out.println("게시물상세조회서비스입니다");
                int id = sc.nextInt();
                boolean found = false;
                for (Post post :postList) {
                    if (post.getPostId() == id) {
                        System.out.println(post.plist(id));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 id의 게시글이 존재하지 않습니다.");
                }
            }
            else {
                System.out.println("이용해 주셔서 감사합니다");
                break;
            }
        }
    }
}

class Author{

    private Long id;
    private String name;
    private String password;
    private static long staticId;
    private String authorEmail;
    List<Post> postList;

    public Author(String name, String authorEmail, String password) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.password = password;
        this.authorEmail = authorEmail;
        this.postList = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "id : "+ id + " 이메일 : " + authorEmail;
    }
    public String alist(int id){
        return "id : " + this.id + " 이메일 : " +
                this.authorEmail + " 이름 : "+
                this.name + " 비밀번호 : "+
                this.password+" 작성 글 수 : "+
                this.postList.size();
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getAuthorEmail() {
        return authorEmail;
    }


    public List<Post> getPostList() {
        return postList;
    }

}

class Post{
    private Long postId;
    private String title;
    private String contents;
    private Author author;
    private static long staticId;

    public Post(String title, String contents, Author author) {
        staticId++;
        this.postId = staticId;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public Long getPostId() {
        return postId;
    }

    public Author getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "id : "+ postId + " 이메일 : " + author.getAuthorEmail() ;
    }
    public String plist(int id){
        return "id : " + this.postId + " 글제목 : " + this.title + " 글내용 : "+ this.contents + " 작성자 : "+this.author.getName();
    }
}
