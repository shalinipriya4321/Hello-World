import java.util.Scanner;

public class TeacherStudentmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of teacher you want to add");
		int no=sc.nextInt();
		Teacher t[]=new Teacher[no];
		for(int i=0;i<no;i++) {
			System.out.println("Enter teacher id");
			int tid=sc.nextInt();
			System.out.println("Enter teacher name");
			String tname=sc.next();
			System.out.println("Enter the no of student you want to assign to the teacher");
			int sno=sc.nextInt();
			Student s[]=new Student[sno];
			for(int j=0;j<sno;j++) {
			System.out.println("Enter student id");
			int sid=sc.nextInt();
			System.out.println("Enter student name");
			String sname=sc.next();
			System.out.println("Enter student branch id");
			int bid=sc.nextInt();
			s[j]=new Student(sid, sname,bid);
		}
			t[i]=new Teacher(tid, tname, s);
		
	}
		for (int i = 0; i <no; i++) {
			System.out.println(t[i]);
		}

}
}
