package ch07.extend.person.abstractClass;

class CheckingAccount extends Account {
    CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void endOfMonth() {
        System.out.println("End of month statement. Balance: " + balance);
    }
}