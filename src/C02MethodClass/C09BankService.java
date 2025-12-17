package C02MethodClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
       <계좌개설 및 입출금 서비스>
       1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
       2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
       3.서비스 기능 사용하실 서비스 번호를 입력해주세요.
           3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
           3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
           3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
           3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
           3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
       4.주의사항
           4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
           4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
        */
public class C09BankService {
    public static void main(String[] args) {
        Map<String, BankAccount> bankMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if(number==1){
                System.out.println("계좌개설 서비스 입니다 \"이름\"사용하실\"계좌번호\" 현재\"가지고있는돈\"을 입력하세요");
                String na = sc.next();
                String ac = sc.next();
                long balance = sc.nextLong();
                bankMap.put(ac,new BankAccount(na,ac,balance));
                System.out.println("개설완료");
            } else if (number==2) {
                System.out.println("계좌조회 서비스 입니다.조회하실 계좌의 계좌번호를 입력해주세요.");
                String find = sc.next();
                System.out.println(bankMap.get(find));

            } else if (number==3) {
                System.out.println("계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요.");
                String depac = sc.next();
                long depmn = sc.nextLong();
                BankAccount account = bankMap.get(depac);
                account.deposit(depmn);
                sc.nextLine();
            }else if (number==4) {
                System.out.println("계좌출금서비스입니다. 출금하실 계좌번호와 입금금액을 입력해주세요.");
                String wdac = sc.next();
                long wdmn = sc.nextLong();
                BankAccount account = bankMap.get(wdac);
                account.withdraw(wdmn);
                sc.nextLine();
            }else if (number==5) {
                System.out.println("송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요.");
                String myAc = sc.next();
                String tgAc = sc.next();
                long trmoney = sc.nextLong();
                BankAccount my = bankMap.get(myAc);
                BankAccount tg = bankMap.get(tgAc);
                my.transfer(tg,trmoney);
                sc.nextLine();
            }else {
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }


    }

}class BankAccount{
    private Long id;
    private String name;
    private String accountNumber;
    private long balance;
    private static long staticId;


    public BankAccount( String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(long wdmn){
        if (this.balance < wdmn) {
            System.out.println("잔고가 부족합니다");
            return;
        }
        this.balance -= wdmn;
        System.out.println("출금완료");
        System.out.println("잔고 :" +this.balance+" 원");

    }
    public void deposit(long depmn){
        this.balance += depmn;
        System.out.println("입금완료");
        System.out.println("잔고 :" +this.balance+" 원");

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }


    public void transfer(BankAccount trac, long trmoney){
        if (this.balance < trmoney) {
            System.out.println("잔고가 부족합니다");
            return;
        }
        this.balance -= trmoney;

        trac.balance += trmoney;
        System.out.println("송금완료 송금 후 잔액"+ this.balance+"원 입니다");
    }

    @Override
    public String toString() {
        return "계좌주 : " + name + "계좌번호 : " + accountNumber + "잔액 : " + balance;
    }
}

//역할 분리 한 코드
//package C02MethodClass;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class C09BankService {
//    public static void main(String[] args) {
//
//        Map<String, BankAccount> bankMap = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("1.계좌개설 2.계좌조회 3.입금 4.출금 5.송금 0.종료");
//            int number = sc.nextInt();
//
//            // 계좌개설
//            if (number == 1) {
//                System.out.println("이름 계좌번호 초기금액을 입력하세요");
//                String name = sc.next();
//                String account = sc.next();
//                long balance = sc.nextLong();
//
//                bankMap.put(account, new BankAccount(name, account, balance));
//                System.out.println("계좌 개설 완료");
//
//                // 계좌조회
//            } else if (number == 2) {
//                System.out.println("조회할 계좌번호를 입력하세요");
//                String account = sc.next();
//
//                BankAccount acc = bankMap.get(account);
//                if (acc == null) {
//                    System.out.println("존재하지 않는 계좌입니다.");
//                } else {
//                    System.out.println(acc);
//                }
//
//                //입금
//            } else if (number == 3) {
//                System.out.println("입금할 계좌번호와 금액을 입력하세요");
//                String account = sc.next();
//                long money = sc.nextLong();
//
//                BankAccount acc = bankMap.get(account);
//                if (acc == null) {
//                    System.out.println("존재하지 않는 계좌입니다.");
//                } else {
//                    long before = acc.getBalance();
//                    acc.deposit(money);
//                    System.out.println("입금 전 잔액 : " + before);
//                    System.out.println("입금 후 잔액 : " + acc.getBalance());
//                }
//
//                // 출금
//            } else if (number == 4) {
//                System.out.println("출금할 계좌번호와 금액을 입력하세요");
//                String account = sc.next();
//                long money = sc.nextLong();
//
//                BankAccount acc = bankMap.get(account);
//                if (acc == null) {
//                    System.out.println("존재하지 않는 계좌입니다.");
//                } else {
//                    long before = acc.getBalance();
//                    boolean success = acc.withdraw(money);
//
//                    if (!success) {
//                        System.out.println("잔액이 부족합니다.");
//                    } else {
//                        System.out.println("출금 전 잔액 : " + before);
//                        System.out.println("출금 후 잔액 : " + acc.getBalance());
//                    }
//                }
//
//                // 송금
//            } else if (number == 5) {
//                System.out.println("본인계좌 상대계좌 송금금액을 입력하세요");
//                String from = sc.next();
//                String to = sc.next();
//                long money = sc.nextLong();
//
//                BankAccount fromAcc = bankMap.get(from);
//                BankAccount toAcc = bankMap.get(to);
//
//                if (fromAcc == null || toAcc == null) {
//                    System.out.println("계좌번호가 올바르지 않습니다.");
//                } else {
//                    long before = fromAcc.getBalance();
//                    boolean success = fromAcc.transfer(toAcc, money);
//
//                    if (!success) {
//                        System.out.println("잔액이 부족합니다.");
//                    } else {
//                        System.out.println("송금 전 잔액 : " + before);
//                        System.out.println("송금 후 잔액 : " + fromAcc.getBalance());
//                    }
//                }
//
//                // 종료
//            } else {
//                System.out.println("이용해 주셔서 감사합니다.");
//                break;
//            }
//        }
//    }
//}
//
//class BankAccount {
//    private Long id;
//    private String name;
//    private String accountNumber;
//    private long balance;
//    private static long staticId;
//
//    public BankAccount(String name, String accountNumber, long balance) {
//        staticId++;
//        this.id = staticId;
//        this.name = name;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    // 입금 (로직만)
//    public void deposit(long money) {
//        this.balance += money;
//    }
//
//    // 출금 (성공 여부 반환)
//    public boolean withdraw(long money) {
//        if (this.balance < money) {
//            return false;
//        }
//        this.balance -= money;
//        return true;
//    }
//
//    // 송금 (성공 여부 반환)
//    public boolean transfer(BankAccount target, long money) {
//        if (this.balance < money) {
//            return false;
//        }
//        this.balance -= money;
//        target.balance += money;
//        return true;
//    }
//
//    public long getBalance() {
//        return balance;
//    }
//
//    @Override
//    public String toString() {
//        return "계좌주 : " + name +
//                ", 계좌번호 : " + accountNumber +
//                ", 잔액 : " + balance;
//    }
//}
