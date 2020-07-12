package Package2;

public class SavingAccount {
	private double balance;
	private int interestRate;
	private int accountNo;
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(double balance, int interestRate, int accountNo) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	public void withDraw(double amount) {
	if(amount>balance)
		System.out.println("amount cannot be greater than balnce");
	else
		amount=balance-amount;
		System.out.println("Successesfully Withdrawn-> UPDATED BALANCE IS: "+amount);
	
		
	}
	public void calculateInterst() {
		int t=0;
		
		float si= (float) ((balance*interestRate)/100);
	System.out.println(" Rate Of interet is:-> "+si);
		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", interestRate=" + interestRate + ", accountNo=" + accountNo
				+ "]";
	}
	

}
