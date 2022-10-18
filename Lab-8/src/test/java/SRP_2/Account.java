package SRP_2;


public class Account {
    String accountId;
    Long balance;

    public Account(String accountId, Long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    public Long getBalance(){
        return this.balance;
    }
}
