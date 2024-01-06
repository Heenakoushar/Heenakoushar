package entity;

public class customer {
	private int cid;
	private String cname;
	private String cage;
	private long cphno;
	private String cemail;
	private double camt;
	public double getCamt() {
		return camt;
	}
	public void setCamt(double camt) {
		this.camt = camt;
	}
	private Address caddress;
	public customer(int cid, String cname, String cage, long cphno, String cemail, Address caddress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.cphno = cphno;
		this.cemail = cemail;
		this.caddress = caddress;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCage() {
		return cage;
	}
	public void setCage(String cage) {
		this.cage = cage;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Address getCaddress() {
		return caddress;
	}
	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", cage=" + cage + ", cphno=" + cphno + ", cemail="
				+ cemail + ", caddress=" + caddress + "]";
	}
	
	

}
