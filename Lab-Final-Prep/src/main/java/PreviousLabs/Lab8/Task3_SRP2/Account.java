package PreviousLabs.Lab8.Task3_SRP2;

public class Account {
    String AccountID;
    Long Balance;

    public Account(String AccountID, Long Balance) {
        this.AccountID = AccountID;
        this.Balance = Balance;
    }

    public long getBalance() {
        return Balance;
    }
}
