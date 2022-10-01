package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank();

        // set my balance
        sbi.deposit(25000);

        sbi.withdraw(12000);
        float balance = sbi.getBalance();
        System.out.println(balance);

    }
}
