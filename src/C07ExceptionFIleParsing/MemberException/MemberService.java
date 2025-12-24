package C07ExceptionFIleParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;

//핵심로직을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();
    }

    public void register(String name,String email,String password){
//        List(DB) 이메일이 중복일 경우 예외발생
        Member member = memberRepository.findByEmail(email);
         if(member != null){
             throw new IllegalArgumentException("이미 가입된 이메일");
         }
//        객체 조립 후 repository통해 저장
        if (password.length()< 10){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다");
        }
        memberRepository.register(new Member(name, email, password));
    }

    public Member findById(long id){
        Member member = memberRepository.findById(id);
        if (member == null){
//            예외발생
            throw new IllegalArgumentException();
        }
        return member;

    }
    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public void login(String email, String password) {
        Member member = memberRepository.findByEmail(email);
//        email이 있는지 확인 후 없으면 예외발생
        if (member == null){
            throw new IllegalArgumentException("이메일을 확인하십시오");
        }else{
            if (!member.getPassword().equals(password)){
                throw new IllegalArgumentException("비밀번호가 틀렸습니다");
            }
        }
//        password가 일치한지 확인 후 일치하지 않으면 예외 발생

    }
}
