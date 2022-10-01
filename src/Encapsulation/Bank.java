package Encapsulation;

public class Bank {
    private float balance;

    public void deposit(float amount) {
        if(amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if(amount > 0 && amount > this.balance)
            System.out.println("Insufficient Balance");
        else
            this.balance -= amount;
    }

    public float getBalance() {
        return this.balance;
    }
}
