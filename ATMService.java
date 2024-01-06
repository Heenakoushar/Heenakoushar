package Service;

import java.util.List;

import entity.Account;

public interface ATMService {
    double checkBalance(Account account);
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    List<String> getTransactionHistory(Account account);
}