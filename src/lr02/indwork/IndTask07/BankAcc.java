package lr02.indwork.IndTask07;

public class BankAcc implements IndTask07 {
    private double balance;
    public void dep(double sum) {
        balance += sum;
    }
    public void withdraw(double sum) {
        if (balance >= sum) {
            balance -= sum;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
    public double getBalance() {
        return balance;
    }
}