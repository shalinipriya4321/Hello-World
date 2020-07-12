package Package2;

import java.util.Scanner;

public class CoffieMain {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of customer");
int n=sc.nextInt();
Customer c[]=new Customer[n];
for(int i=0;i<n;i++) {
	System.out.println("Enter customer Name");
	String cusName=sc.next();
	System.out.println("Enter customer Mno");
	String Mno=sc.next();
	System.out.println("Enter customer feedbackRating out of 5");
	double fb=sc.nextDouble();
	c[i]=new Customer(cusName, Mno, fb);
}
System.out.println("display the details of customer");
for(int i=0;i<n;i++) {
	
System.out.println(c[i]);
}
double sum=0;
System.out.println("display feedback rating of the customer");
for(int i=0;i<n;i++) {
	
System.out.println(c[i].getFeedbackrating());
sum=sum+c[i].getFeedbackrating();
}
System.out.println("Average feedback rating is");
double avg=(sum/n);
System.out.println(avg);





}

}

