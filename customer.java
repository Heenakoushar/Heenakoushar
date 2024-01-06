package entity;

public class customer {

	private String Cname;
	private long Cphno;
	private Movie cmovie;
	private double camt;

	public double getCamt() {
		return camt;
	}

	public void setCamt1(double camt) {
		this.camt = camt;
	}

	public customer(String name, long phno, Movie cmovie) {
		super();
		this.Cname = name;
		this.Cphno = phno;
		this.cmovie = cmovie;
	}

	public String getName() {
		return Cname;
	}

	public void setName(String name) {
		this.Cname = name;
	}

	public long getPhno() {
		return Cphno;
	}

	public void setPhno(long phno) {
		this.Cphno = phno;
	}

	public Movie getCmovie() {
		return cmovie;
	}

	public void setCmovie(Movie cmovie) {
		this.cmovie = cmovie;
	}

	@Override
	public String toString() {
		return "customer [name=" + Cname + ", phno=" + Cphno + "]";
	}

	public void setCamt(double amt) {
		// TODO Auto-generated method stub

	}

}
