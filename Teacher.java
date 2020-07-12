import java.util.Arrays;

public class Teacher {
	private int tid;
	private String name;
	private Student s[];
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String name, Student[] s) {
		super();
		this.tid = tid;
		this.name = name;
		this.s = s;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getS() {
		return s;
	}
	public void setS(Student[] s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", s=" + Arrays.toString(s) + "]";
	}

}
