package app;

import accounts.account;
import accounts.AccountCreation;
import transaction.DepositTransaction;
import transaction.FundTransfer;
import transaction.ViewAccountBalance;
import transaction.WithdrawTransaction;

public class MainClass {
	public static void main(String[] args) {
		AccountCreation ac=new AccountCreation();
		account a1 =ac.createAccount("Heena",1234567894321l,"SYNB000",1000.00);
		account a2 =ac.createAccount("Manish",123456789012345l,"SYNB008",2000.00);
		
		
		WithdrawTransaction with=new WithdrawTransaction();
		DepositTransaction dep=new DepositTransaction();
		FundTransfer fun=new FundTransfer();
		ViewAccountBalance view=new ViewAccountBalance();
		
		System.out.println("===================");
		view.viewBalance(a1);
		
		System.out.println("==========deposit=========");
		dep.deposit(a1, 5000);
		view.viewBalance(a1);
		
		System.out.println("===========withdraw========");
		with.withdraw(a1, 1000);
		view.viewBalance(a1);
		
		System.out.println("=============transfer=========");
		fun.transfer(a1, a2, 3000);
		view.viewBalance(a1);
		view.viewBalance(a2);
		
		
		
		
		
		
		
	}

}
