package Package2;

public class Customer {
	private String name;
	private String Mno;
	private double feedbackrating;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mno, double feedbackrating) {
		super();
		this.name = name;
		Mno = mno;
		this.feedbackrating = feedbackrating;
	}
	public Customer(double feedbackrating) {
		super();
		this.feedbackrating = feedbackrating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMno() {
		return Mno;
	}
	public void setMno(String mno) {
		Mno = mno;
	}
	public double getFeedbackrating() {
		return feedbackrating;
	}
	public void setFeedbackrating(double feedbackrating) {
		this.feedbackrating = feedbackrating;
	}
	@Override
	public String toString() {
		return "CoffieeShop [name=" + name + ", Mno=" + Mno + ", feedbackrating=" + feedbackrating + "]";
	}
	

}
