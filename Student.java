
public class Student {
	private int sid;
	private String name;
	private int branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, int branch) {
		super();
		this.sid = sid;
		this.name = name;
		this.branch = branch;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", branch=" + branch + "]";
	}
	

}
