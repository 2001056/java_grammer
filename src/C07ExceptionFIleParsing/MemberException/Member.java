package C07ExceptionFIleParsing.MemberException;


//객체 - 엔티티
public class Member {
    private static long staticId =0L;
    private long id;
    private String email;
    private String password;
    private String name;

    public Member(String name,String email, String password) {
        staticId++;
        this.id = staticId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
