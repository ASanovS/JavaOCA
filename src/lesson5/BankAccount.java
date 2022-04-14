package lesson5;

public class BankAccount {
    int id;
    String name;
    double balance;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double popolnenieScheta(double inputSum) {
        return balance + inputSum;
    }

    public double snjatieSoScheta(double outputSum) {
        return balance - outputSum;
    }

}
