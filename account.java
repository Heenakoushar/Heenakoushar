package accounts;

public class account {
    private String username;
    private long accountnum;
    private String ifsc;
    private double accbal;
	public account(String username, long accountnum, String ifsc, double accbal) {
		super();
		this.username = username;
		this.accountnum = accountnum;
		this.ifsc = ifsc;
		this.accbal = accbal;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(long accountnum) {
		this.accountnum = accountnum;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double accbal) {
		this.accbal = accbal;
	} 
}
