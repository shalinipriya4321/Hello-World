package Package2;

import java.util.Scanner;

public class SavingAmountMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the amount you want to credit");
	int b=sc.nextInt();
	System.out.println("enter rate of interest");
	int r=sc.nextInt();
	System.out.println("enter the accountNo");
	int ano=sc.nextInt();
	SavingAccount sa=new SavingAccount(b, r, ano);
	System.out.println("enter the amount you want to withdraw");
	sa.withDraw(sc.nextInt());
	sa.calculateInterst();
		
	}

}
