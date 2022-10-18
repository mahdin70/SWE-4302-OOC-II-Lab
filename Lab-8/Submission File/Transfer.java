package SRP_2;

public class Transfer {
    Account senderAccount;
    Account receiverAccount;
    long balance;
    public void transfer(String Sender, String receiver, long balance){
        senderAccount = AccountOperation.findAccountForUser(Sender);
        receiverAccount = AccountOperation.findAccountForUser(receiver);
        setBalance(senderAccount);
        credit(balance);
        setBalance(receiverAccount);
        debit(balance);
    }
    private void setBalance(Account account){
        balance = account.getBalance();
    }
    public void credit(long credit){
        balance -= credit;
    }
    public void debit(long debit){
        balance+= debit;
    }
}
