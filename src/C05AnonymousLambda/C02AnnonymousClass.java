package C05AnonymousLambda;

//익명내부클래스
public class C02AnnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal을 상속한 클래스가 별도로 존재 하지않고,
//        익명클래스가 만들어짐과 동시에 익명객체기 생성.
//        AbstractAnimal aa = new AbstractAnimal() {
//            @Override
//            void makeSound() {
//                System.out.println("멍멍");
//            }
//        };
//        aa.makeSound();
//        aa.eat();

//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성.
//        Animal1 a1 = new Animal1() {
//            @Override
//            public void makeSound() {
//
//            }
//
//            @Override
//            public void eat() {
//
//            }
//        };
        Animal2 a2 = () -> {};


    }
}
abstract class AbstractAnimal{
    abstract void makeSound();
    void eat(){
        System.out.println("동물이 먹이를 먹습니다.");
    }
}

interface Animal1{
    void makeSound();
    void eat();
}
interface Animal2{
    void makeSound();
}