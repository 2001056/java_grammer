package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass c1 = new C04ProtectedClass();

        System.out.println(c1.st1);
//        System.out.println(c1.st2);private
        System.out.println(c1.st3);
        System.out.println(c1.st4);
    }
}
