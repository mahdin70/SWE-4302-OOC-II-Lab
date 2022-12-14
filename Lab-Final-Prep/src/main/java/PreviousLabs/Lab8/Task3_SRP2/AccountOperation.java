package PreviousLabs.Lab8.Task3_SRP2;

import java.util.Map;

public class AccountOperation {
    public static Map<String,Account> accounts;

    public void addAccount(String ID,Account account){
        accounts.put(ID, account);
    }

    public void updateAccount(String ID,Account account){
        accounts.replace(ID, account);
    }

    public static Account findAccount(String ID){
        return accounts.get(ID);
    }
}
