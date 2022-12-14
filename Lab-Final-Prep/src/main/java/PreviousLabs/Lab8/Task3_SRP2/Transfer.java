package PreviousLabs.Lab8.Task3_SRP2;

public class Transfer {
    Account senderAccount;
    Account receiverAccount;
    long amount;

    public void transfer(String Sender, String Receiver, long amount){
        senderAccount = AccountOperation.findAccount(Sender);
        receiverAccount = AccountOperation.findAccount(Receiver);

        setBalance(senderAccount);
        credit(amount);
        setBalance(receiverAccount);
        debit(amount);
    }

    private void setBalance(Account accont){
        amount = accont.getBalance();
    }

    public void credit(long credit){
        amount-=credit;
    }

    public void debit(long debit){
        amount+=debit;
    }
}
