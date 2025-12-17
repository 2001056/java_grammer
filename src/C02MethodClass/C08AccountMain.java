package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C08AccountMain {
    public static void main(String[] args) {
//        계좌개설(객체생성)
        Account a1 = new Account("hong1","1234",200000);
        Account a2 = new Account("hong2","54321",100000);
//        list를 계좌객체를 담는 자료구조로 사용
        List<Account> myList = new ArrayList<>();
        myList.add(a1);
        myList.add(a2);
        System.out.println(myList);
//        계좌1('1234')에서 계좌2('54321')로 송금(5000) : 잔고 변경 메서드 필요
//        내 계좌를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
        for (Account a : myList){
            if (a.getAccountNumber().equals("1234")){
                a1.send(50000);
            }if (a.getAccountNumber().equals("54321")){
                a2.recive(50000);
            }
        }
        System.out.println(myList);
    }
}
//Account클래스 - 계좌주명(name),계좌번호(accountNumber-String),잔고(balance-long)

class Account{
    private String name;
    private String accountNumber;
    private long balance;

    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "Acoount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void setBalance(int balance){
        this.balance = balance;
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