package C02MethodClass;

import java.util.HashMap;
import java.util.Map;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
//        Account a1 = new Account("hong1","1234",200000);
//        Account a2 = new Account("hong2","54321",100000);
////        list를 계좌객체를 담는 자료구조로 사용
//        List<Account> myList = new ArrayList<>();
//        myList.add(a1);
//        myList.add(a2);
//        System.out.println(myList);
////        계좌1('1234')에서 계좌2('54321')로 송금(5000) : 잔고 변경 메서드 필요
////        내 계좌를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
//        for (Account a : myList){
//            if (a.getAccountNumber().equals("1234")){
//                a1.send(50000);
//            }if (a.getAccountNumber().equals("54321")){
//                a2.recive(50000);
//            }
//        }
//        System.out.println(myList);
//        Map을 계좌객체로 담는 구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345",new Account("hong1","12345",1000000));
        accountMap.put("54321",new Account("hong2","54321",0));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");

        a.transfer(b,50000);
        System.out.println(accountMap);
    }
}
//Account클래스 - 계좌주명(name),계좌번호(accountNumber-String),잔고(balance-long)

class Account{
//    참조 자료형은 초기값 null
    private Long id;
    private String name;
    private String accountNumber;
//    원시 자료형은 각 자료형에 맞는 초기 값
    private long balance;
    private static long staticId;

    public Account(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    //      setBalance보다는 의도를 명확히 한 메서드 명을 사용하기를 권장
    public void setBalance(int balance){

        this.balance = balance;
    }
    public void transfer(Account targetAccount, long money){
//        송금 할 객체에서 돈을 차감
        if (this.balance < money) {
            System.out.println("잔고가 부족합니다");
            return;
        }
        this.balance -= money;
        targetAccount.balance += money;
//        송금 받을 객체에 돈을 가산
    }
    public void send(int b){

        this.balance -= b;
    }
    public void recive(int b){

        this.balance += b;
    }

    public String getAccountNumber() {

        return accountNumber;
    }
}