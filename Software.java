
public class Software {
	private int sid;
	private String sname;
	private int scost;
	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Software(int sid, String sname, int scost) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scost = scost;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getScost() {
		return scost;
	}
	public void setScost(int scost) {
		this.scost = scost;
	}
	@Override
	public String toString() {
		return "Software [sid=" + sid + ", sname=" + sname + ", scost=" + scost + "]";
	}

}
