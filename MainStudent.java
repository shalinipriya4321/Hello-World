import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of student you want to add");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter student id");
			int sid=sc.nextInt();
			System.out.println("Enter student name");
			String sname=sc.next();
			System.out.println("Enter student branchid");
			int branchid=sc.nextInt();
			s[i]=new Student(sid, sname, branchid);
		}
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}
		
		
	}

}
