package transaction;
import accounts.account;

public class DepositTransaction {
	public void deposit(account arg,double deposit_bal) {
		double balance=arg.getAccbal()+deposit_bal;
		arg.setAccbal(balance);
		
		
	}

}
