package transaction;
import accounts.account;
public class FundTransfer {
	public boolean transfer(account arg1,account arg2,double transfer_bal) {
		if(arg1.getAccbal()>transfer_bal) {
			double balance=arg1.getAccbal()-transfer_bal;
			arg1.setAccbal(balance);
			double balace=arg2.getAccbal()+transfer_bal;
			arg2.setAccbal(balace);
			return true;
		}
		return false;
		
		
	}

}
