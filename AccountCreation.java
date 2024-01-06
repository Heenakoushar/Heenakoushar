package accounts;

public class AccountCreation {
	public account createAccount(String username, long accountnum, String ifsc, double accbal){
		account a1=new account(username,accountnum,ifsc,accbal);
				return a1;
		
	}

}
