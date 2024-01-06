package service_impl;
import java.util.List;

import Service.ATMService;
import entity.Account;


public class ATMServiceImpl implements ATMService {
	  
    public double checkBalance(Account account) {
        return account.getBalance();
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public List<String> getTransactionHistory(Account account) {
        return account.getTransactionHistory();
    }
  


}