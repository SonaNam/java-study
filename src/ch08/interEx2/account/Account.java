package ch08.interEx2.account;

// 계좌 클래스
public class Account implements Bankable,Loanable {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

    public Account(String accountNumber, double balance) {            // 생성자 만들어서 String accountNumber, double balance 이렇게 받을거야
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }




    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + "원이 입금 되었습니다.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }

    @Override
    public void Calculateinterest() {

    }
}
