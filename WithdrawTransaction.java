package transaction;
import accounts.account;

public class WithdrawTransaction {
	public boolean withdraw(account arg,double withbal){
		if(arg.getAccbal()>withbal) {
			double balance=arg.getAccbal()-withbal;
			arg.setAccbal(balance);
			return true;
		}
		
		return false;
		
	}
	

}
